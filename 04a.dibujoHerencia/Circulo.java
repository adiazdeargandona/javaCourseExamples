import java.awt.Color;

public class Circulo extends Figura
{
	int radio;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param lado Tamaño del cuadrado en pixels
	*/
	Circulo(int x, int y, boolean relleno, Color color, int radio)
	{
		super(x, y, relleno, color);
		this.setRadio(radio);
	}

	void setRadio(int radio)
	{
		if(x>1 && x<600)
			this.radio = radio;
		else
			this.radio = 2;
	}

	int getRadio()
	{
		return radio;
	}

	void pintar(java.awt.Graphics g)
	{
		g.setColor(color);
		if(relleno)
			g.fillOval(x, y, radio, radio); 
		else
			g.drawOval(x, y, radio, radio); 
	}

}