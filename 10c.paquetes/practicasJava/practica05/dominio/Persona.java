package practicasJava.practica05.dominio;

public class Persona //extends Object
{
	static String CIUDAD;

	String nombre;
	int edad;
	String nif;

	public Persona(String nombre, String nif, int edad)
	{
		//super();
		this.nombre = nombre;
		this.nif = nif;
		this.setEdad(edad);		
	}

	public Persona(String nombre, String nif)
	{
		this.nombre = nombre;
		this.nif = nif;
	}

	public static String getCIUDAD()
	{
		return CIUDAD;
	}

	static void setCIUDAD(String ciudad)
	{
		CIUDAD = ciudad;
	}

	//Metodos
	public String getNombre()
	{
		return nombre;
	}


	public String getNif()
	{
		return nif;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setNif(String nif)
	{
		this.nif = nif;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setEdad(int edad)
	{
		if(edad > 0 && edad < 120)
			this.edad = edad;		
	}

	public String formatear(int texto)
	{
		return this.formatear("" + texto);
	}

	String formatear(String texto)
	{
		return "<u><i><b>" + texto + "</b></i></u>";
	}

	String getInfoHTML()
	{
		return " <br />Nombre: " + this.formatear(nombre) + "<br />NIF: " +
		 this.formatear(nif) + "<br />Edad: " + this.formatear(edad);
	}


	@Override
	public String toString()
	{
		return "\nNombre: " + nombre + "\nNIF: " +
		 nif + "\nEdad: " + edad + "\nCiudad: " + CIUDAD;
	}

	@Override
	public boolean equals(Object obj) //Upcasting
	{
		if(obj instanceof Persona)
		{
			Persona p = (Persona) obj; //Downcasting
			if (nif.equals(p.getNif()))
				return true;
			else
				return false;
		}
		else
			return false;
	}
}

