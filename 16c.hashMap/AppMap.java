/** @author David Contreras */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class AppMap
{

	public static void main(String args[])
	{
		
		//La implementación de abajo sirve para los HashMap y TreeMap, por lo que se podría escrbir:
		
		/* 
		 * HashMap hm = new HashMap();
		 * 		o
		 * TreeMap hm = new TreeMap();
		 *
		 */
		 
		//Para hacerla más polivalente codificaremos:
		
		Map m = null;

		int opcion = 1;
		
		switch(opcion)
		{
			case 1:
				m = new TreeMap();
				break;
			case 2:
				m = new HashMap();
				break;
		}
		
		m.put(new Persona("Luis", (byte)23), new Coche("VW", "Golf"));
		m.put(new Persona("Juan", (byte)33), new Coche("Seat", "Ibiza"));
		m.put(new Persona("Manuel", (byte)19), new Coche("Dacia", "Logan"));
		m.put(new Persona("David", (byte)23), new Coche("Dacia", "Logan"));
		
		m.put(new Persona("Juan", (byte) 33), new Coche("BMW", "330xd"));

		m.put(new Persona("Juan", (byte) 32), new Coche("BMW", "530d"));
		
		
		Coche coche = (Coche) m.get(new Persona("Manuel", (byte)19));
		System.out.println("El coche de Manuel es: " + coche);
		
		
		System.out.println("\nListado de coches");
		Collection c = m.values();
		Iterator it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
			
			
		System.out.println("\nExiste Luis: " + m.containsKey(new Persona("Luis", (byte)23)));
		
		System.out.println("\nListado del Map");
		System.out.println("\n===============");
		Set s = m.entrySet();
		Iterator it2 = s.iterator();
		while(it2.hasNext())
		{
			Object o = it2.next();
			Map.Entry entry = (Map.Entry) o;
			System.out.println("La clave: " + entry.getKey() + " y el valor: " + entry.getValue());		
		}

		
	}	
	
}







