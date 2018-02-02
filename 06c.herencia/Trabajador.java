public class Trabajador extends Persona
{
	String profesion;

	Trabajador(String nombre, String nif, int edad, String profesion)
	{
		super(nombre, nif, edad);
		this.profesion = profesion;
	}	


	String getProfesion()
	{
		return profesion;
	}

	void setProfesion(String profesion)
	{
		this.profesion = profesion;
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + "\nProfesion : " + profesion;
	}
}