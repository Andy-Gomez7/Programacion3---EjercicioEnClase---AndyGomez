import java.util.ArrayList;
import java.util.Scanner;

public class GestionEstudiantes {
    ArrayList<Estudiante> Estudiantes;
    Scanner scan;

    public GestionEstudiantes(){
        Estudiantes = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void Resgistrar(){
        
        System.out.print("\nDigite el nombre: ");
        String nombre = scan.nextLine();
        System.out.print("\n\n");

        System.out.print("Digite la edad: ");
        int edad = scan.nextInt();
        System.out.print("\n\n");

        System.out.print("Digite el indice: ");
        double indice = scan.nextDouble();
        System.out.print("\n\n");
        scan.nextLine();

        try
        {
            UsuarioService.ValidarEstudiante(nombre, edad, indice);
            Estudiante nuevo = new Estudiante(nombre, edad, indice);
            Estudiantes.add(nuevo);
            System.out.print("\nEstudiante registrado");
        }catch(EstudianteValidator e)
        {
            System.out.print(e.getMessage());
        }finally
        {
            System.out.print("\n\nproceso finalizado\n\n");
        }
    }

    public void Mostrar(){
        System.out.print("=================================");
        System.out.print("           Estudiantes           ");
        System.out.print("=================================");
        for(Estudiante est : Estudiantes){
            System.out.print("\n\n---------------------------------------------\n");
            System.out.print("Nombre: "+est.GetNombre()+"\n\n");
            System.out.print("Edad: "+est.GetEdad()+"\n\n");
            System.out.print("Indice: "+est.GetIndiceAcademcio()+"\n\n");
            System.out.print("---------------------------------------------\n\n");
        }
    }
}
