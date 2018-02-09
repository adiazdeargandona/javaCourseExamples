public class AppTrabajador
{
	public static void main(String args[])
	{
		Persona.setCIUDAD("MADRID");

		Persona p = new Persona("Manuel", "11111A", 33);

		Trabajador t = new Trabajador("Luis", "2222F", 22, "Teleco");

		System.out.println(t.getInfo());
		System.out.println(p.getInfo());

		Persona personas[] = new Persona[10];

		personas[0] = p; 
		personas[1] = t; //UPCASTING
		personas[2] = new Trabajador("Jaime", "33333F", 21, "Filosofo"); //UPCASTING

		//personas[2].getProfesion()-->ERROR

		if(personas[2] instanceof Trabajador)
			Trabajador t2 = (Trabajador) personas[2]; //DOWNCASTING

		t2.getProfesion();

		System.out.println("\n============= Generalización de personas =============");

		for(int i=0;i<personas.length;i++)
			if(personas[i]!=null)
				System.out.println(personas[i].getInfo());

	}
}

