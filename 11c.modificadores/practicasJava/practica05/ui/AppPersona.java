package practicasJava.practica05.ui;
import practicasJava.practica05.dominio.Persona;

public class AppPersona
{
	public static void main(String args[])
	{

		int valorMaximoInt = Integer.MAX_VALUE;

		Persona p1 = new Persona("Manuel", "11111A", 33);
		//p1.nombre = "Luis";
		p1.setNombre("Luis");
		Persona p2 = new Trabajador("Jaime", "22222A", 44, "Teleco");
		Object o[] = new Object[2]; 
		o[0] = p1;
		o[1] = "HOLA";
		o[2] = p2;

		for(int i=0;i<2;i++)
			System.out.println(o[i]);
	}
}

