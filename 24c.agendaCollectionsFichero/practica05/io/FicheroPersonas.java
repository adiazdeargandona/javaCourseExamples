package practica05.io;

import java.util.Iterator;
import java.util.Collection;

import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;

import java.util.ArrayList;
import java.util.Collection;

import practica05.dominio.Persona;
import practica05.negocio.Agenda;


public class FicheroPersonas
{
	public static void guardar(Collection personas)
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
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("Se produjo un error en la escritura del archivo");
		}
			
	}	

	public static void guardar(Agenda agenda)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("agendas.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(agenda);
			oos.close();
			fos.close();
		}
		catch(IOException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("Se produjo un error en la escritura del archivo");
		}
			
	}	

	public static Agenda leer() 
	{
		Agenda agenda = null;
		try
		{
			FileInputStream fis = new FileInputStream("agendas.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			agenda = (Agenda) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Clase Agenda/Persona no encontrada");
		}
		catch(FileNotFoundException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("No se encontró el fichero");
		}
		catch(IOException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("Se produjo un error en la lectura del archivo");
		}

		return agenda;
			
	}	


	public static ArrayList leerPersonas() 
	{
		ArrayList personas = new ArrayList();
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try
		{
			fis = new FileInputStream("personas.obj");
			ois = new ObjectInputStream(fis);
			while(true)
				personas.add(ois.readObject());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Clase Agenda/Persona no encontrada");
		}
		catch(EOFException e)
		{
			try
			{
				ois.close();
				fis.close();
			}
			catch(IOException eClose)
			{
				System.out.println("No se pudo cerrar el fichero");	
			}
		}		
		catch(FileNotFoundException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("No se encontró el fichero");
		}
		catch(IOException e)
		{
			//Desarrollo: e.printStackTrace();
			//Solo en Producción:
			System.out.println("Se produjo un error en la lectura del archivo");
		}
		return personas;
	}


/*
		for(Persona p:personas)
			oos.writeObject(p);
*/

/*
	public static void guardarPersonasJDK5(Collection<Persona> personas)
	{

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.obj"));

		for(Persona p:personas)
			oos.writeObject(p.getNombre());

		oos.close();
	}*/	

}