/** @author David Contreras */
import java.util.TreeSet;

public class AppTreeSet
{
	public static void main(String args[])
	{
		TreeSet miTreeSet = new TreeSet();
		miTreeSet.add(new Persona("Jaime", 17, "C\\aaaaa", "1111A"));
		miTreeSet.add(new Persona("Manuel", 25, "C\\cccc", "3333C"));
		miTreeSet.add(new Persona("Luis", 15, "C\\bbbb", "2222B"));
		//Se agrega, ya que no es el mismo vía equals
		miTreeSet.add(new Persona("Jaime", 18, "C\\dddd", "4444D")); 
		
		System.out.println(miTreeSet);

		System.out.println("Contenido del TreeSet despues del borrado");
		miTreeSet.remove(new Persona("Jaime", "4444D"));
		System.out.println(miTreeSet);
	}
}	