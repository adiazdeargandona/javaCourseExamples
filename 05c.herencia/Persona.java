// C:\... javaCourseExamples\04c.atributosClase\docs>javadoc -private ..\*.java

public class Persona
{
	//Atributos
	/** Nombre de la persona o alias o mote */
	String nombre;
	int edad;
	String nif;
	/** Todos los objetos Persona viven en la misma ciudad */
	static String CIUDAD;

	Persona()
	{
		
	}

	/** Constructor personalizado puedo indicar a Java la forma correcta
	de creación de objetos */
	Persona(String nombre, String nif, int edad)
	{
		this.nombre = nombre;
		this.nif = nif;
		this.setEdad(edad);		
	}

	/** Lo oblogatorio */
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
		 this.formatear(nif) + "<br />Edad: " + this.formatear(edad) + "";
	}

	String getInfo()
	{
		return "\nNombre: " + nombre + "\nNIF: " +
		 nif + "\nEdad: " + edad + "\nCiudad: " + CIUDAD;
	}
}

