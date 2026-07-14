public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;

    public Estudiante(String Nombre, String Matricula, String Carrera){
        SetNombre(Nombre);
        SetMatricula(Carrera);
        SetCarrera(Matricula);
    }

    public void SetNombre(String Nombre){
        nombre = Nombre;
    }

    public String GetNombre(){
        return nombre;
    }

    public void SetCarrera(String Matricula){
        matricula = Matricula;
    }
    
    public String GetCarrera(){
        return carrera;
    }

    public void SetMatricula(String Carrera){
        carrera = Carrera;
    }

    public String GetMatricula(){
        return matricula;
    }
}