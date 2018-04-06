/** RETO 14: Excepciones
 *  Ejecución 1. Invocar al método metodo1() y metodo2() de la clase Util dentro del mismo bloque try. Cada error se gestionará de forma diferente.
 *  Ejecución 2.  A continuación, invocar nuevamente al método metodo1() y metodo2() de la clase Util sabiendo que en el caso de darse el error ExceptionTipo2 se realizará un tratamiento y en el caso restante otro tratamiento.
 * 
 *  El tratamiento de los errores será mostrando el texto: "solucionando el error ....."
 *  
 */
 
class Main 
{
  public static void main(String[] args) 
  {
    //Ejecución 1
    
    try
    {
        Util util = new Util();
        util.metodo1();
        Util.metodo2();
    }
    catch(ExceptionTipo2 e)
    {
        System.out.println("Solucionando el error ExceptionTipo2");
    }
    catch(ExceptionTipo1 e)
    {
        System.out.println("Solucionando el error ExceptionTipo1");
    }    
    catch(Exception e)
    {
        System.out.println("Solucionando el error Exception");
    }     
    
    //Ejecución 2
    
    try
    {
        Util util = new Util();
        util.metodo1();
        Util.metodo2();
    }
    catch(ExceptionTipo2 e)
    {
        System.out.println("Solucionando el error ExceptionTipo2 individual");
    }
    catch(Exception e)
    {
        System.out.println("Solucionando el error ExceptionTipo1 y Exception de forma conjunta");
    }    
  }
}