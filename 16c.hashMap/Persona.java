/** @author David Contreras */

public class Persona implements Comparable
{
	private String nombre;
	private byte edad;
	
	public Persona(String nombre, byte edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(nombre);
		sb.append(" (");
		sb.append(edad);
		sb.append(")");
		return sb.toString();
	}
	

	public int getEdad()
	{
		return edad;
	}

	public String getNombre()
	{
		return nombre;
	}

	public boolean equals(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p = (Persona) o;
			if(nombre.equals(p.getNombre()) && edad == p.getEdad())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	
	public int hashCode()
	{
		//No se podrá devolver como código HASH la edad, ya que es un atributo modificable.
		//return nombre.hashCode();
		//return nombre.charAt(0);
		return String.valueOf(nombre.charAt(0)).hashCode(); 
	}
	
	
	public int compareTo(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p = (Persona) o;		
			int comparacion = nombre.compareTo(p.getNombre());
			if (comparacion==0)
				return String.valueOf(edad).compareTo(String.valueOf(p.getEdad()));
			else
				return comparacion;
		}
		else
			return +1;
	}
}

