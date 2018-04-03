import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class VentanaAlumnoEventosAnonima extends JFrame
{
	JTextField txtNombre;
	JTextField txtApellidos;
	JTextField txtCurso;
	JButton btnGuardar;
	JButton btnListar;	
	
	java.util.ArrayList listaAlumnos = 	new java.util.ArrayList ();
			
	public static void main(String s[])
	{
		new VentanaAlumnoEventosAnonima("Gesti�n de Personas");
	}
	
	public VentanaAlumnoEventosAnonima(String titulo)
	{

		//Componentes		
		
		JLabel lblNombre = new JLabel ("Nombre:");
		txtNombre = new JTextField(8);
		JLabel lblApellidos = new JLabel ("Apellidos:");
		txtApellidos = new JTextField(10);
		JLabel lblCurso = new JLabel ("Curso:");		
		txtCurso = new JTextField(2);
		btnGuardar = new JButton("Guardar");
		btnListar = new JButton("Listar");		
		
		btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnListar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		Font fntTexto = new Font("Arial", Font.BOLD, 12);
		lblNombre.setFont(fntTexto);
		lblApellidos.setFont(fntTexto);
		lblCurso.setFont(fntTexto);
		
		Color clrTexto = new Color(86, 150, 200);
		txtNombre.setBackground(clrTexto);
		txtApellidos.setBackground(clrTexto);
		txtCurso.setBackground(clrTexto);
		
		txtNombre.setForeground(Color.WHITE);
		txtApellidos.setForeground(Color.WHITE);
		txtCurso.setForeground(Color.WHITE);
		
		
		//Layout
		this.setLayout(new BorderLayout());

		JLabel labelRotulo = new JLabel("Gesti�n de Personas", JLabel.CENTER);
		labelRotulo.setFont(new Font("Arial", Font.BOLD, 18));

		JPanel pnlCentro = new JPanel(new GridLayout(3,2));
		
		pnlCentro.add(lblNombre);
		pnlCentro.add(txtNombre);
		pnlCentro.add(lblApellidos);
		pnlCentro.add(txtApellidos);
		pnlCentro.add(lblCurso);
		pnlCentro.add(txtCurso);
		
		JPanel pnlSur = new JPanel(new FlowLayout());

		pnlSur.add(btnGuardar);		
		pnlSur.add(btnListar);
		
		this.add(labelRotulo, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);


		//Ventana


		this.addWindowListener(new WindowAdapter()
			{
			    public void windowClosing(WindowEvent e) 
			    {
			    	int opcion = JOptionPane.showConfirmDialog(VentanaAlumnoEventosAnonima.this, "Gestion Alumnos", "�Desea abandonar la aplicaci�n?",  JOptionPane.YES_NO_OPTION);
			    	if(opcion == JOptionPane.YES_OPTION)
			    		System.exit(0);

			    }
			});

		txtNombre.addKeyListener(new KeyAdapter()
			{
				public  void keyPressed(KeyEvent e) 
				{
					if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
						txtNombre.setText("");
					else if(e.getKeyCode()==KeyEvent.VK_ENTER)
						txtApellidos.requestFocus();

				} 

			});
		txtApellidos.addKeyListener(new KeyAdapter()
			{
				public  void keyPressed(KeyEvent e) 
				{
					if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
						txtApellidos.setText("");
					else if(e.getKeyCode()==KeyEvent.VK_ENTER)
						txtCurso.requestFocus();
				} 

			});
		txtCurso.addKeyListener(new KeyAdapter()
			{
				public  void keyPressed(KeyEvent e) 
				{
					if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
						txtCurso.setText("");
					else if(e.getKeyCode()==KeyEvent.VK_ENTER)
						VentanaAlumnoEventosAnonima.this.guardarAlumno();			
				} 

			});

		btnGuardar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					VentanaAlumnoEventosAnonima.this.guardarAlumno();
				}	
			});
		btnListar.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					VentanaAlumnoEventosAnonima.this.listar();
				}	

			});
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setTitle("Practica Java");
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		
	}

	private void guardarAlumno()
	{
		int error = 0;
		try
		{
			int curso = Integer.parseInt(txtCurso.getText());
			error = 1;
			//int edad = Integer.parseInt(txtEdad.getText());
			Alumno a = new Alumno (txtNombre.getText(), txtApellidos.getText(), curso);
			listaAlumnos.add(a);
			txtNombre.setText("");
			txtApellidos.setText("");
			txtCurso.setText("");		
			txtNombre.requestFocus();		
		}
		catch(NumberFormatException e)
		{
			if(error==0)
			{
				txtCurso.setText("");
				txtCurso.requestFocus();	
				JOptionPane.showMessageDialog(this, "Por favor introduzca el CURSO correctamente", "Error", JOptionPane.ERROR_MESSAGE);
			}
		/* En el caso de que hubiese otra l�nea que 
			else if(error==1)
			{
				txtEdad.setText("");
				txtEdad.requestFocus();	
				JOptionPane.showMessageDialog(this, "Por favor introduzca la EDAD correctamente", "Error", JOptionPane.ERROR_MESSAGE);
			}			
			*/
		}

	}

	private void listar()
	{
		//No se debe hacer en una aplicaci�n real, se deber�a mostrar en la ventana.
		System.out.println(listaAlumnos);
	}

}