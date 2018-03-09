/** @author David Contreras */
public class Persona 
{
	private int edad;
	private String nombre;
	private String domicilio;
	private String nif;
	
	public Persona(String nombre, int edad, String domicilio, String nif)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
		this.nif = nif;	
	}	
	
	
	//Constructor de búsqueda. Atributos que utiliza equals
	public Persona(String nombre, String nif)
	{
		this.nombre = nombre;
		this.nif = nif;	
	}
	
	int getEdad()
	{
		return edad;
	}
	
	void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	String getNombre()
	{
		return nombre;
	}
	
	String getNif()
	{
		return nif;
	}	
	
	void setNif(String nif)
	{
		this.nif = nif;
	}		

	void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}	
	
	String getDomicilio()
	{
		return domicilio;
	}	
	
	public String toString()
	{
		return nombre + " (" + edad + ") Domicilio: " + domicilio + " (" + nif + ")";
	}

	public boolean equals(Object o)
	{
		if(o instanceof Persona)
		{
			Persona p = (Persona) o;
			return nif.equals(p.getNif());
		}
		else
			return false;
	
	}

	@Override
	public int hashCode()
	{
		return nombre.charAt(0);
	}

}

