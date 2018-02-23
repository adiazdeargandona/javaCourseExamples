import java.util.ArrayList;

public class App
{
	public static void main(String args[])
	{
		ArrayList personas = new ArrayList();

		personas.add(new Persona("Manuel", "1111F" , 22));
		personas.add(new Persona("Luis", "2222E", 33));
		personas.add(0, new Persona("Pepe", "3333G", 44));
		
		personas.remove(1);
		
		for(int i=0;i<personas.size();i++)
		{
			Object o = personas.get(i);
			System.out.println(o.toString());
			Persona p = (Persona) o;
			System.out.println(p.getNombre());
		}
		
		System.out.println("\n\n" + personas.contains(new Persona("2222E")));

		for(int i=0;i<personas.size();i++)
			System.out.println(personas.get(i));
	}
}