package practicasJava.practica05.dominio;

public class Persona //extends Object
{
	public final static int EDAD_MAXIMA = 120;
	public final static int EDAD_MINIMA = 0;

	private static String CIUDAD;

	private String nombre;
	private int edad;
	private String nif;

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

	/* Contructor de búsqueda: equals */
	public Persona(String nif)
	{
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
		if(edad > EDAD_MINIMA && edad < EDAD_MAXIMA)
			this.edad = edad;		
	}

	protected String formatear(int texto)
	{
		return this.formatear("" + texto);
	}

	protected String formatear(String texto)
	{
		return "<u><i><b>" + texto + "</b></i></u>";
	}

	public String getInfoHTML()
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


