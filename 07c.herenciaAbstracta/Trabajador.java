public class Trabajador extends Persona implements Pintable
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
	String getInfoHTML()
	{
		return super.getInfoHTML() + "<br />Profesión: " + this.formatear(profesion);
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + "\nProfesion : " + profesion;
	}

	@Override
	int tributar()
	{
		int impuestos = 0;
		switch(profesion)
		{
			case "Teleco":
				impuestos = 20;
				break;
			case "Empresario":
				impuestos = 30;
				break;
			case "Administrativo":
				impuestos = 10;
				break;
			default: 
				impuestos = 5;
		}

		return impuestos;
	}

	@Override
	public String pintar()
	{
		return "Pintando el trabajador " + nombre;
	}	
}