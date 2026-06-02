public class Estudiante{
    private String nombre;
    private int edad;
    private double indiceAcademico;

    public Estudiante(String Nombre, int Edad, double IndiceAcademico){
        SetNombre(Nombre);
        SetEdad(Edad);
        SetIndiceAcademico(IndiceAcademico);
        
    }

    public void SetNombre(String Nombre){
        nombre = Nombre;
    }

    public String GetNombre(){
        return nombre;
    }

    public void SetEdad(int Edad){
        edad = Edad;
    }

    public int GetEdad(){
        return edad;
    }
    public void SetIndiceAcademico(double IndiceAcademico){
        indiceAcademico = IndiceAcademico;
    }
    public double GetIndiceAcademcio(){
        return indiceAcademico;
    }
}