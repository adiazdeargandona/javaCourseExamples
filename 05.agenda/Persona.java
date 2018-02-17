/**
@author David Contreras
*/

public class Persona
{
    int edad;
    String nombre;
   
    public Persona(String n, int e)
    {
        edad = e;
        nombre = n;
    }
   
    int getEdad()
    {
        return edad;
    }
   
    void setEdad(int _edad)
    {
        edad = _edad;
    }
   
    String getNombre()
    {
        return nombre;
    }
}