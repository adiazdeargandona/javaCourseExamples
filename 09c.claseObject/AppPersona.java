public class AppPersona
{
	public static void main(String args[])
	{
		Persona p1 = new Persona("Manuel", "11111A", 33);
		Persona p2 = new Persona("Manuel", "11111A", 33);
		Object o[] = new Object[2]; 
		o[0] = p1;
		o[1] = "HOLA";


		for(int i=0;i<2;i++)
			System.out.println(o[i]);



		System.out.println(p1==p2);		
		p1 = p2;
		System.out.println(p1==p2);	


		p1 = new Persona("Manuel", "11111A", 33);
		p2 = new Persona("Manuel", "11111A", 34);	

		System.out.println("Equals: " + p1.equals(p2));	


		int i = 1;
		int j = 1;

		System.out.println(i==j);

		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}
}

