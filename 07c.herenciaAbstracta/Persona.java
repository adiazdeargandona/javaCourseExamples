//no existen personas en la realidad: Trabjadores, estudiantes, etc.
public abstract class Persona //extends Object
{
	static String CIUDAD;

	String nombre;
	int edad;
	String nif;

	Persona(String nombre, String nif, int edad)
	{
		//super();
		this.nombre = nombre;
		this.nif = nif;
		this.setEdad(edad);		
	}

	Persona(String nombre, String nif)
	{
		this.nombre = nombre;
		this.nif = nif;
	}

	static String getCIUDAD()
	{
		return CIUDAD;
	}

	static void setCIUDAD(String ciudad)
	{
		CIUDAD = ciudad;
	}

	//Metodos
	String getNombre()
	{
		return nombre;
	}

	int getEdad()
	{
		return edad;
	}

	void setNif(String nif)
	{
		this.nif = nif;
	}

	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	void setEdad(int edad)
	{
		if(edad > 0 && edad < 120)
			this.edad = edad;		
	}

	String formatear(int texto)
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

	String getInfo()
	{
		return "\nNombre: " + nombre + "\nNIF: " +
		 nif + "\nEdad: " + edad + "\nCiudad: " + CIUDAD;
	}

	//pay taxes
	abstract int tributar();
}

