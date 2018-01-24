public class AppDibujo02
{
	public static void main( String[] args )
	{
		Dibujo dibujo = new Dibujo();
		Cuadrado c = new Cuadrado(10,10, 100);
		dibujo.pintar(c);
		Util.wait(1);
		c.setX(300);
		dibujo.pintar(c);		
		Util.wait(1);
		c.setY(300);
		dibujo.pintar(c);		
		Util.wait(1);
		c.setLado(150);
		dibujo.pintar(c);
	}
}