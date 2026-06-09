public class UsuarioService{
    public static void ValidarEstudiante(String nombre, int edad, double IndiceAcademico) throws EstudianteValidator
    {
        if(nombre.equals("")){
            throw new EstudianteValidator("\nEl nombre no puede estar vacio\n");
        }

        if(edad < 18 || edad > 100){
            throw new EstudianteValidator("\nla edad debe ser mayor o igual a 18\n");
        }

        if(IndiceAcademico < 0.0 || IndiceAcademico > 4.0){
            throw new EstudianteValidator("\nEl indice debe estar entre 0 y 4\n");
        }
        
    }
}