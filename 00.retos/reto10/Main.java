/* RETO 10. Interfaz de la clase Math
https://docs.oracle.com/javase/9/docs/api/java/lang/Math.html
*/

import java.io.*;

class Main 
{
  public static void main(String[] args) 
  {
    //Pedir al usuario el primer número a través del teclado con la clase suministrada abajo: Leer
    System.out.print("Numero 1: ");
    int a = Integer.parseInt(Leer.porTeclado());
    //Pedir al usuario el segundo número con la clase Console
    System.out.print("Numero 2: ");
    int b = Integer.parseInt(System.console().readLine());
    
    //Mostrar la suma de los dos números
    System.out.println(a+b);
    //Mostrar el máximo
    System.out.println(Math.max(a,b));
    //Mostrar el mínimo
    System.out.println(Math.min(a,b));    
    //Mostrar la suma de los valores absolutos
    System.out.println(Math.abs(a) + Math.abs(b));    
    //Mostrar el resultado de elevar a a b
    System.out.println(Math.pow(a, b));    
    //Mostrar la raíz cuadrado de la suma de los cuadrados de a y b
    System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2)));    
  }
}

class Leer
{
    /** Devuelve un String de lo introducido por teclado */
    public static String porTeclado()
    {
      String s="";
      BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
      try 
      {
        s = b.readLine();
      }
      catch(IOException e) 
      {
        e.printStackTrace();
      }
      return s;
    }
} 
