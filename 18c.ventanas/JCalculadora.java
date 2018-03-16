import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class JCalculadora extends JFrame
{
	public static void main(String[] args) 
	{
		new JCalculadora("JCalculadora v0.1");
	}

	public JCalculadora(String titulo)
	{
		super(titulo);
		//super("Mi título");
		//this.setTitle("Mi titulo");

		//this.setLayout(new FlowLayout());
		this.setLayout(new BorderLayout());
		//this.setLayout(new GridLayout(3, 2));


		JPanel pnlNorte = new JPanel(new FlowLayout());
		JPanel pnlCentro = new JPanel(new FlowLayout());
		JPanel pnlSur = new JPanel(new GridLayout(4,3));

		JTextField txtResultado = new JTextField("0", 30);
		pnlNorte.add(txtResultado);

		JLabel lblMensaje1 = new JLabel("JCalculadora");
		JLabel lblMensaje2 = new JLabel("   - 2º GITT - POO -    ");
		JLabel lblMensaje3 = new JLabel("ICAI");
		pnlCentro.add(lblMensaje1);
		pnlCentro.add(lblMensaje2);
		pnlCentro.add(lblMensaje3);

		for(int i=0;i<10;i++)
			pnlSur.add(new JButton(String.valueOf(i)));

		pnlSur.add(new JButton("C"));
		pnlSur.add(new JButton("="));
		
		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);
		

		/*this.add(btnAceptar);
		this.add(btnCancelar);
		this.add(btnSalir);
		this.add(btnOtro);
*/
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocation(100, 200);
		//this.setSize(800, 600);
		this.pack();
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}
}