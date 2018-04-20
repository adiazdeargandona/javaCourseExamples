package practicasJava.practicaJAR.dominio;

public class Alumno implements java.io.Serializable
{
	private String nombre;
	private String apellidos;
	private int curso;

	public Alumno(String nombre, String apellidos, int curso)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;		
	}

	public String toString()
	{
		return nombre + " " + apellidos + " (" + curso + ")";
	}

}