public class AppPersona
{
	static Persona personas[] = new Persona[10];

	public static void main(String args[])
	{
		Persona.setCIUDAD("Madrid");

		AppPersona.crearPersonas();
		AppPersona.mostrarPersonas();
	}

	static void crearPersonas()
	{
		personas[0] = new Persona("Luis", "111111F", 21);
		personas[1] = new Persona("Manuel", "222222F", 22);
		personas[2] = new Persona("Lucas", "3333333F", 33);
	}

	static void mostrarPersonas()
	{
		for(int i=0; i<10; i++)
		{
			if(personas[i]!=null)
			{
				System.out.println(personas[i].getInfo());
			}
		}
	}
}

