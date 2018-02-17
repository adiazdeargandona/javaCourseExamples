/**
@author David Contreras
*/

public class Persona
{
    int edad;
    String nombre;
   
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.setEdad(edad);
    }
   
    int getEdad()
    {
        return edad;
    }
   
    void setEdad(int edad)
    {
        if(edad > 0 && edad < 120)
            this.edad = edad;
    }
   
    String getNombre()
    {
        return nombre;
    }
}