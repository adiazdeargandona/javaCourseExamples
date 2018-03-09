/** @author David Contreras */
import java.util.HashSet;

public class AppHashSet
{
	public static void main(String args[])
	{
		HashSet miHashSet = new HashSet();
		miHashSet.add(new Persona("Luis", 15, "C\\bbbb", "2222B"));
		miHashSet.add(new Persona("Jaime", 17, "C\\aaaaa", "1111A"));
		miHashSet.add(new Persona("Manuel", 25, "C\\cccc", "3333C"));
		//Se agrega, ya que no es el mismo vía equals
		miHashSet.add(new Persona("Jaime", 18, "C\\dddd", "4444D")); 
		
		System.out.println(miHashSet);

		System.out.println("Contenido del TreeSet despues del borrado");
		miHashSet.remove(new Persona("Jaime", "4444D"));
		System.out.println(miHashSet);

		System.out.println("Existe Jaime?");
		System.out.println(miHashSet.contains(new Persona("Jaime", "4444D")));
	}
}	