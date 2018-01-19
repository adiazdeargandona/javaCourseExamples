public class AppPersona
{
	public static void main(String args[]) 
	{
		int i = 8;
		String s = "hola";

		int j;
		j = 7;

		Persona p = new Persona(); //Llamada al constructor por defecto

//		String nombre = p.getNombre();
//		System.out.println(nombre.toUpperCase());
	/*
		C:\Users\david\Documents\sources\javaCourseExamples\02c.claseBasica>java AppPersona
		Exception in thread "main" java.lang.NullPointerException
        at AppPersona.main(AppPersona.java:14)
    */
		//System.out.println(p.getNombre().toUpperCase());

		p.setNombre("Luis");
		p.setEdad(22);

		Persona p2;
		p2 = new Persona();
		p2.setNombre("Manuel");
		p2.setEdad(21);


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

