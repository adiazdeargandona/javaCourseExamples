public class Cuadrado
{
	int x;
	int y;
	int lado;

	static boolean RELLENO = false;

	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param lado Tamaño del cuadrado en pixels
	*/
	Cuadrado(int x, int y, int lado)
	{
		this.x = x;
		this.y = y;
		this.lado = lado;
	}

	int getX()
	{
		return x;
	}

	int getY()
	{
		return y;
	}

	int getLado()
	{
		return lado;
	}

	void setX(int x)
	{
		this.x=x;
	}

	void setY(int y)
	{
		this.y=y;
	}

	void setLado(int lado)
	{
		this.lado=lado;
	}

	static void setRELLENO(boolean relleno)
	{
		RELLENO = relleno;
	}

	static boolean isRELLENO()
	{
		return RELLENO;
	}

}