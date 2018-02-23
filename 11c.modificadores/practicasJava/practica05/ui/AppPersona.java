package practicasJava.practica05.ui;
import practicasJava.practica05.dominio.Persona;
import practicasJava.practica05.dominio.Trabajador;

public class AppPersona
{
	public static void main(String args[])
	{
		int valorMaximoInt = Integer.MAX_VALUE;

		Persona p1 = new Persona("Manuel", "11111A", 33);
		//p1.nombre = "Luis";
		p1.setNombre("Luis");
		Persona p2 = new Trabajador("Jaime", "22222A", 44, "Teleco");

		Object objetos[] = new Object[3]; 
		objetos[0] = p1;
		objetos[1] = "HOLA";
		objetos[2] = p2;

		for(int i=0;i<objetos.length;i++)
			System.out.println("\nObjeto #" + (i+1) + ":\n" + objetos[i]);
	}
}

