package practicasJava.practica05.dominio;

public class Trabajador extends Persona
{
	private String profesion;

	public Trabajador(String nombre, String nif, int edad, String profesion)
	{
		super(nombre, nif, edad);
		this.profesion = profesion;
	}	

	public String getProfesion()
	{
		return profesion;
	}

	public void setProfesion(String profesion)
	{
		this.profesion = profesion;
	}

	@Override
	public String getInfoHTML()
	{
		return super.getInfoHTML() + "<br />Profesión: " + this.formatear(profesion);
	}

	@Override
	public String toString()
	{
		return super.toString() + "\nProfesion : " + profesion;
	}
}