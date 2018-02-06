public class AppTrabajador
{
	public static void main(String args[])
	{
		Persona.setCIUDAD("MADRID");
		Persona personas[] = new Persona[10];

		personas[0] = new Trabajador("Jaime", "33333F", 21, "Administrativo");
		personas[1] = new Estudiante("Luis", "222222F", 24, "Teleco en ICAI");
		personas[2] = new Trabajador("Jaime", "44444F", 22, "Empresario");

		//personas[2].getProfesion()-->ERROR

		System.out.println("\n============= Tributacion de personas =============");

		for(int i=0;i<personas.length;i++)
			if(personas[i]!=null)
				System.out.println(personas[i].tributar());



		System.out.println("\n============= Pintando objetos =============");

		Pintable pintables[] = new Pintable[10];

		pintables[0] = new Trabajador("Jaime", "33333F", 21, "Administrativo");
		pintables[1] = new Cuadrado(12, 12, true, java.awt.Color.BLUE, 200);

		for(int i=0;i<pintables.length;i++)
			if(pintables[i]!=null)
				System.out.println(pintables[i].pintar());

		


	}
}

