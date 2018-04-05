package practica08.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;


import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Cursor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

import practica08.dominio.Figura;
import practica08.dominio.Circulo;
import practica08.dominio.Cuadrado;
import practica08.dominio.Dibujo;

import practica08.util.Util;


/** 
	Facilita la representación gráfica de objetos creados por el alumno mediante una ventana gráfica y un lienzo 
*/
public class JVentanaDibujo extends JFrame
{
	private Dibujo dibujo;
	private Lienzo lienzo;

	private JButton btnCirculo;
	private JButton btnCuadrado;

	private int xInicial = 0;
	private int yInicial = 0;

	public static void main(String[] args) 
	{
		new JVentanaDibujo();	
	}

	public JVentanaDibujo()
	{
		super("JPaint 2018");

		this.dibujo = new Dibujo("sin_nombre.dib");

		this.setLayout(new BorderLayout());

		JPanel pnlNorte = new JPanel(new FlowLayout());

		btnCirculo = new JButton("Círculo");
		btnCirculo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				lienzo.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent me)
					{
						if(xInicial==0 && yInicial ==0)
						{
							xInicial = me.getX();
							yInicial= me.getY();
							lienzo.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
						}
						else
						{
							int x = me.getX();
							int y = me.getY();
							Circulo c = new Circulo(xInicial, yInicial, true, Color.RED, x - xInicial);	
							JVentanaDibujo.this.pintarFigura(c, this);	
						}
					}
				});
			}
		});
		btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				lienzo.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				lienzo.addMouseListener(new MouseAdapter()
				{
					public void mouseClicked(MouseEvent me)
					{
						if(xInicial==0 && yInicial ==0)
						{
							xInicial = me.getX();
							yInicial= me.getY();
							lienzo.setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
						}
						else
						{
							int x = me.getX();
							int y = me.getY();
							Cuadrado c = new Cuadrado(xInicial, yInicial, true, Color.RED, x - xInicial);		
							JVentanaDibujo.this.pintarFigura(c, this);	
						}
					}
				});
			}
		});
		pnlNorte.add(btnCirculo);
		pnlNorte.add(btnCuadrado);

		JPanel pnlCentro = new JPanel(new FlowLayout());
		lienzo = new Lienzo(this);
		lienzo.setBackground(Color.WHITE);
		lienzo.setSize(800,600);
		pnlCentro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnlCentro.add(lienzo);

		JPanel pnlSur = new JPanel(new GridLayout(1,3));
		JLabel lblMensaje1 = new JLabel("JPaint 2018");
		JLabel lblMensaje2 = new JLabel("Programación Orientada a Objetos (ICAI)");
		JLabel lblMensaje3 = new JLabel("por David Contreras");
		pnlSur.add(lblMensaje1);
		pnlSur.add(lblMensaje2);
		pnlSur.add(lblMensaje3);

		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentro, BorderLayout.CENTER);
		this.add(pnlSur, BorderLayout.SOUTH);
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	private void pintarFigura(Figura f, MouseListener ml)
	{
		dibujo.pintar("Grupo Rojo", f);
		lienzo.repaint();
		lienzo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		lienzo.removeMouseListener(ml);
		xInicial = 0;
		yInicial = 0;
	}

	public Dibujo getDibujo()
	{
		return dibujo;
	}

}