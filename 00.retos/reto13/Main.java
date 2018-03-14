/** @author David Contreras */

/* RETO 13: Muestra el contenido de las colecciones mediante el método mostrar */
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

class Main {
  public static void main(String[] args) 
  {
    ArrayList miArrayList = new ArrayList();
    miArrayList.add("Uno");
    miArrayList.add("Dos");
    miArrayList.add("Tres");
    
    TreeSet miTreeSet = new TreeSet();
    miTreeSet.add("Uno");
    miTreeSet.add("Dos");
    miTreeSet.add("Tres");
  }
  
  private static void mostrar(Collection col)
  {
      Iterator it = col.iterator();
      while(it.hasNext())
        System.out.println(it.next());
  }
}