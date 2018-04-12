package practica05.io;

import java.util.Iterator;
import java.util.Collection;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import practica05.dominio.Persona;


public class FicheroPersonas
{

	public static void guardarPersonas(Collection personas)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("personas.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Iterator it = personas.iterator();
			while(it.hasNext())
			{
				//Persona p = (Persona) it.next();
				oos.writeObject(it.next());
			}

			oos.close();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			//Solo en Producción: System.out.prinln("ERROR");
		}
			
		

/*
		for(Persona p:personas)
			oos.writeObject(p);
*/

	}
/*
	public static void guardarPersonasJDK5(Collection<Persona> personas)
	{

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.obj"));

		for(Persona p:personas)
			oos.writeObject(p.getNombre());

		oos.close();
	}*/	

}