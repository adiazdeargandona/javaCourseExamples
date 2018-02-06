public class Estudiante extends Persona
{
	String estudios;

	Estudiante(String nombre, String nif, int edad, String estudios)
	{
		super(nombre, nif, edad);
		this.estudios = estudios;
	}	


	String getEstudios()
	{
		return estudios;
	}

	void setEstudios(String estudios)
	{
		this.estudios = estudios;
	}

	@Override
	String getInfoHTML()
	{
		return super.getInfoHTML() + "<br />Estudios: " + this.formatear(estudios);
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + "\nEstudios : " + estudios;
	}

	@Override
	int tributar()
	{
		return 0;
	}
	
}