public class AppPersona
{
	public static void main(String args[]) 
	{
		//Persona p0 = new Persona(); //ERROR

		Persona p = new Persona("Luis", 21); //Llamada al constructor por defecto

		Persona p2;
		p2 = new Persona("Lola", 22);
		p2.setNombre("Manuel");
		p2.setEdad(-21);


		int edadP = p.getEdad();
		
		System.out.println("Nombre de p " + p.getNombre());
		System.out.println("Edad de p " + edadP);
		System.out.println("Edad de p " + p.getEdad());

		System.out.println("Nombre de p2 " + p2.getNombre());
		System.out.println("Edad de p2 " + p2.getEdad());

		double edadMedia = (p.getEdad() + p2.getEdad()) / 2.0;
		System.out.println("La edad media es " + edadMedia);
		System.out.println("La suma de las edades es " + (p.getEdad() + p2.getEdad()));

	}
}

