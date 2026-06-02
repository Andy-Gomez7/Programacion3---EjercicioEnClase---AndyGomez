public class UsuarioService{
    public static void ValidarEstudiante(String nombre, int edad, double IndiceAcademico) throws EstudianteValidator
    {
        if(!nombre.trim().isEmpty()){
            throw new EstudianteValidator("\nEl nombre no puede estar vacio\n");
        }
        else{
            System.out.print("\nnombre invalido\n");
        }

        if(edad >= 18 && edad <= 100){
            throw new EstudianteValidator("\nla edad debe ser mayor o igual a 18\n");
        }
        else{
            System.out.print("\nEdad invalida\n");
        }

        if(IndiceAcademico >= 0.0 && IndiceAcademico <= 4.0){
            throw new EstudianteValidator("\nEl indice debe estar entre 0 y 4\n");
        }
        else{
            System.out.print("\nIndice invalido\n");
        }
        
    }
}