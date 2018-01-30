public class AppTrabajador
{
	public static void main(String args[])
	{
		Trabajador t = new Trabajador();
		t.setNombre("Luis");
		t.setEdad(22);
		t.setProfesion("Teleco");

		System.out.println(t.getNombre());
		System.out.println(t.getEdad());
		System.out.println(t.getProfesion());
	}
}

