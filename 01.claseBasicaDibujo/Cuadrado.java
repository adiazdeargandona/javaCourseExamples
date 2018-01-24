public class Cuadrado
{
	private int x;
	private int y;
	private int lado;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param lado Tamaño del cuadrado en pixels
	*/
	public Cuadrado(int x, int y, int lado)
	{
		this.x = x;
		this.y = y;
		this.lado = lado;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getLado()
	{
		return lado;
	}

	public void setX(int x)
	{
		this.x=x;
	}

	public void setY(int y)
	{
		this.y=y;
	}

	public void setLado(int lado)
	{
		this.lado=lado;
	}

}