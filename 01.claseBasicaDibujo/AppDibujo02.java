public class AppDibujo02
{
	public static void main( String[] args )
	{
		Dibujo dibujo = new Dibujo();
		Cuadrado c = new Cuadrado(10,10, 100);
		dibujo.pintar(c);
		Util util = new Util();
		c.setX(300);
		dibujo.pintar(c);		
		util.wait(1);
		c.setY(300);
		dibujo.pintar(c);		
		util.wait(1);
		c.setLado(150);
		dibujo.pintar(c);
	}
}