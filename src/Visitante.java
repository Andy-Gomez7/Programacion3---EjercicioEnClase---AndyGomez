public class Visitante
{
    private String nombre;
    private int edad;
    private String cedula;

    public Visitante(){
        setEdad(0);
        setNombre("");

    } 

    public Visitante(String nombre, int edad){
        setEdad(edad);
        setNombre(nombre);
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String Nombre)
    {
        nombre = Nombre;
    }

    public String getCedula() 
    {
        return cedula;
    }

    public void setCedula(String Cedula)
    {
        cedula = Cedula;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int Edad)
    {
        edad = Edad;
    }
}