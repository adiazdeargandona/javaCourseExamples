/* Se recomienda que el nombre de la 
clase identifique el tipo objeto ....................*/
public class Persona
{
	//Atributos
	String nombre;
	int edad;
	String nif;

	//Constructor personalizado puedo indicar a Java la forma correcta
	//de creación de objetos
	Persona(String nombre, String nif, int edad)
	{
		this.nombre = nombre;
		this.nif = nif;
		this.setEdad(edad);		
	}

/*
	Persona(int edad)
	{
		this.setEdad(edad);		
	}
*/

//Lo oblogatorio
	Persona(String nombre, String nif)
	{
		this.nombre = nombre;
		this.nif = nif;
	}


	/*(String nif)
	{
		this.nif = nif;
	}*/

/*
	Persona()
	{

	}	*/

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
		 nif + "\nEdad: " + edad;
	}
}

