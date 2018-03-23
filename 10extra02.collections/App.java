import java.util.*;

public class App
{
    private static Collection c = null;

    public static void main(String[] args)
    {
        int opcion=0;
        do
        {
            opcion = App.menuTipoColeccion();
            App.limpiar();
            App.evaluarTipoColeccion(opcion);
			App.procesarOperacion();
        }while(opcion!=9);
    }
    
    private static int menuTipoColeccion()
    {
        System.out.println("#########################################");
        System.out.println("###          Tipo Coleccion          ####");
        System.out.println("#########################################");
        System.out.println("###  1. Acceso directo               ####");                
        System.out.println("###  2. Inserciones y eliminaciones  ####");
        System.out.println("###  3. Sin duplicados               ####");
        System.out.println("###  4. Ordenaciones                 ####");
        System.out.println("#########################################");
        System.out.println("###  9. SALIR               	     ####");
        System.out.println("#########################################");
        System.out.print("  > ");
        int opc = Integer.parseInt(Leer.porTeclado());
        return opc;
    }
        
    private static void evaluarTipoColeccion(int opcion)
    {
    	switch (opcion)
		{
			case 1:
				c = new ArrayList();
				break;
			case 2:
				c = new LinkedList();
				break;
			case 3:
				c = new HashSet();
				break;
			case 4:
				c = new TreeSet();
				break;
			case 9:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
		}
	}
		
    private static void procesarOperacion()		
    {
    	int opcion = 0;
		do
		{
            App.limpiar();			
			opcion = App.menuTipoOperacion();
			App.evaluarTipoOperacion(opcion);
		}while(opcion!=9);    	
    }
		
    static int menuTipoOperacion()
    {
        System.out.println("################################################");
        System.out.println("    Operaciones con " + c.getClass().getName());
        System.out.println("################################################");
        System.out.println("###  1. Agregar                             ####");                
        System.out.println("###  2. Eliminar                            ####");
        System.out.println("###  3. Mostrar                             ####");
        System.out.println("###  4. Insertar en una posicion            ####");
        System.out.println("###  5. Devolver el objeto de una posicion  ####");        
        System.out.println("################################################");
        System.out.println("###  9. Menu anterior                       ####");
        System.out.println("################################################");
        System.out.print("  > ");
        int opc = Integer.parseInt(Leer.porTeclado());
        return opc;
    }    
		
	
	private static Asignatura crearAsignatura()
	{
		System.out.print("Nombre de la asignatura: ");
		String nombre = Leer.porTeclado();
		System.out.print("Creditos de la asignatura: ");
		float creditos = Float.parseFloat(Leer.porTeclado());
		return new Asignatura(nombre, creditos);
	}
		
    private static void evaluarTipoOperacion(int opcion)
    {
		switch(opcion)
		{
			case 1:
				c.add(App.crearAsignatura());
				System.out.print("\nPulse <ENTER> para continuar...");				
				Leer.porTeclado();				
				break;
			case 2:
				System.out.println("Nombre de la asignatura:");
				String nombre = Leer.porTeclado();
				if(c.remove(new Asignatura(nombre)))
					System.out.println("Objeto eliminado");
				else
					System.out.println("No se pudo eliminar el objeto");				

				System.out.print("\nPulse <ENTER> para continuar...");				
				Leer.porTeclado();
				break;				
			case 3:
				System.out.println("Informacion de las asignaturas:");
				Iterator it = c.iterator();
				while(it.hasNext())
					System.out.println(it.next());
				System.out.print("\nPulse <ENTER> para continuar...");				
				Leer.porTeclado();					
				break;
			case 4:
				if(c instanceof List)
				{
					List l=(List) c;
					System.out.print("Posicion en la que desea insertar: ");
					int posicion = Integer.parseInt(Leer.porTeclado());
					l.add(posicion, App.crearAsignatura());
					System.out.println("Objeto insertado en la posición " + posicion);									
				}
				else
					System.out.println("Esta opcion no esta disponible para esta coleccion");				
					
				System.out.print("\nPulse <ENTER> para continuar...");				
				Leer.porTeclado();					
				break;
			case 5:
				if(c instanceof List)
				{
					List l=(List) c;
					System.out.print("Posicion a obtener: ");
					int posicion = Integer.parseInt(Leer.porTeclado());
					System.out.println(l.get(posicion));
				}
				else
					System.out.println("Esta opcion no esta disponible para esta coleccion");				
				
				System.out.print("\nPulse <ENTER> para continuar...");				
				Leer.porTeclado();						
				break;
			case 9:
				System.out.println("Volviendo al menu anterior...");
				break;
			default:
				System.out.println("Opcion incorrecta");
				System.out.print("\nPulse <ENTER> para continuar...");				
				Leer.porTeclado();					
				break;
		}
	}
    
    static void limpiar()
    {
	    for(int i=0;i<25;i++)
            System.out.println();
    }
    
}
