/* RETO 9: Interfaz de String
Investiga en la documentación de la API para dar respuesta a las siguientes transformaciones:
https://docs.oracle.com/javase/9/docs/api/java/lang/String.html
*/

class Main 
{
  public static void main(String[] args) 
  {
    String texto = "No di mi decoro cedi mi don";
    //Mostrar la longitud del String
    System.out.println(texto.length());
    //Convertir texto a letrás mayúsculas
    System.out.println(texto.toUpperCase());
    //Mostrar los tres primeros caracteres
    System.out.println(texto.substring(0,3));
    //Mostar el número de veces que el caracter 'o'
    int posicion = 0;
    int numeroA = 0;
    while(posicion!=-1)
    {
      posicion = texto.indexOf('o', posicion+1);
      numeroA++;
    }
    System.out.println(--numeroA);
    //Mostar la posición en que aparece la última 'a'
    System.out.println(texto.lastIndexOf('o'));
    //Mostrar la frase invertida en letras mayúsculas
    System.out.println(new StringBuilder(texto).reverse().toString().toUpperCase());
  }
}