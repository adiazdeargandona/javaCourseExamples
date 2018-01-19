/* Se recomienda que el nombre de la 
clase identifique el tipo objeto ....................*/
public class Persona
{
	//Atributos
	String nombre;
	int edad;

	//Constructor personalizado puedo indicar a Java la forma correcta
	//de creación de objetos
	Persona(String nombre, int edad)
	{
		this.nombre = nombre;
		this.setEdad(edad);		
	}

	Persona(String nombre)
	{
		this.nombre = nombre;
	}

	Persona()
	{

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
}

