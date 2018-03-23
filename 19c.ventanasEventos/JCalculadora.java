import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class JCalculadora extends JFrame implements ActionListener
{
	private JButton btnIgual;
	private JButton btnC;

	private JTextField txtResultado;

	public static void main(String[] args) 
	{
		new JCalculadora("JCalculadora v1.0");
	}

	public JCalculadora(String titulo)
	{
		super(titulo);

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());
		JPanel pnlCentro = new JPanel(new GridLayout(4,3));
		JPanel pnlDerecha = new JPanel(new GridLayout(4,1));
		JPanel pnlSur = new JPanel(new FlowLayout());

		txtResultado = new JTextField("0", 30);
		pnlNorte.add(txtResultado);

		JLabel lblMensaje1 = new JLabel("JCalculadora");
		JLabel lblMensaje2 = new JLabel("   - 2º GITT - POO -    ");
		JLabel lblMensaje3 = new JLabel("ICAI");
		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		for(int i=1;i<10;i++)
			this.crearBoton(String.valueOf(i), pnlCentro);

		btnC = new JButton("C");
		//componenteQueRecibeElEvento.addTIPO_EVENTO(objetoGestorEvento)
		btnC.addActionListener(this);
		pnlCentro.add(btnC);

		this.crearBoton("0", pnlCentro);

		btnIgual = new JButton("=");
		btnIgual.addActionListener(this);
		pnlCentro.add(btnIgual);

		this.crearBoton("+", pnlDerecha);
		this.crearBoton("-", pnlDerecha);
		this.crearBoton("*", pnlDerecha);
		this.crearBoton("/", pnlDerecha);
		
		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);
		this.add(pnlDerecha, BorderLayout.EAST);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}

	private void crearBoton(String label, JPanel panel)
	{
		JButton btnNumeroAux = new JButton(label);
		btnNumeroAux.addActionListener(this);
		panel.add(btnNumeroAux);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o==btnC)
			txtResultado.setText("0");
		else if(o==btnIgual)
		{
			//Recurro a un truco para evaluar la operación matemática gracias a la implementación de Javascript que posee Java desde la 1.6
			try
			{
				ScriptEngineManager scriptManager = new ScriptEngineManager();
			    ScriptEngine engineJavaScript = scriptManager.getEngineByName("JavaScript");
		    	txtResultado.setText(engineJavaScript.eval(txtResultado.getText()).toString());
		    }
		    catch(ScriptException error)
		    {
		    	txtResultado.setText(error.getMessage());
		    }
		}
		else
		{
			String label = e.getActionCommand();
			if(txtResultado.getText().equals("0"))
				txtResultado.setText("");
			txtResultado.setText(txtResultado.getText() + label);
		}
	}
}