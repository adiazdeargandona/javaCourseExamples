package practicasJava.practicaJAR.io;

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

import practicasJava.practicaJAR.dominio.Alumno;



public class IOAlumno
{
	public static void guardar(Collection alumnos)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("data/alumnos.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Iterator it = alumnos.iterator();
			while(it.hasNext())
			{
				oos.writeObject(it.next());
			}

			oos.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println("Se produjo un error en la escritura del archivo");
		}
			
	}	

	public static ArrayList leer() 
	{
		ArrayList alumnos = new ArrayList();
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try
		{
			fis = new FileInputStream("data/alumnos.obj");
			ois = new ObjectInputStream(fis);
			while(true)
				alumnos.add(ois.readObject());
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
		return alumnos;
	}


/*
		for(Persona p:alumnos)
			oos.writeObject(p);
*/

/*
	public static void guardaralumnosJDK5(Collection<Persona> alumnos)
	{

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.obj"));

		for(Persona p:alumnos)
			oos.writeObject(p.getNombre());

		oos.close();
	}*/	

}