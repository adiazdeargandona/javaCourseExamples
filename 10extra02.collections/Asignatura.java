
public class Asignatura implements Comparable
{
	private String nombre;
	private float creditos;	
	
	public Asignatura(String _nombre, float _creditos)
	{
		nombre = _nombre;
		creditos = _creditos;
	}
	
	//Constructor para b�squedas
	public Asignatura(String _nombre)
	{
		nombre = _nombre;
	}	
	
	public String getNombre()
	{
		return nombre;
	}
	
	public float getCreditos()
	{
		return creditos;
	}

	public void setCreditos(float _creditos)
	{
		creditos = _creditos;
	}
	
	public String toString()
	{
		return nombre + " (" + creditos + ")";
	}

	public boolean equals(Object o)
	{
		if(o instanceof Asignatura)
		{
			Asignatura a = (Asignatura) o;
			return nombre.equals(a.getNombre());
		}
		else
			return false;
	
	}
	
	public int compareTo(Object o)
	{
		return nombre.compareTo(((Asignatura)o).getNombre());
	}
	
}