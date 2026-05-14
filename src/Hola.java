import java.util.ArrayList;    
import java.util.Scanner;

public class Hola
{
    public static void main(String[] args)
    {
        ArrayList<Visitante> Visitantes = new ArrayList<Visitante>(5);

        RegistrarVisitantes(Visitantes);
        MostrarVisitantes(Visitantes);
    }

    public static void RegistrarVisitantes(ArrayList<Visitante> Visitante)
    {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Digite su informacion visitante "+(i+1)+":\n");

            Visitante vis = new Visitante();

            System.out.print("Digite su nombre: ");
            String nombre = scanner.next();
            vis.setNombre(nombre);

            System.out.print("Digite su edad: ");
            int edad = scanner.nextInt();
            vis.setEdad(edad);

            System.out.print("Digite su cedula: ");
            String cedula = scanner.next();
            vis.setCedula(cedula);

            Visitante.add(vis);

            System.out.print("\n");
        }
    }

    public static void MostrarVisitantes(ArrayList<Visitante> Visitante)
    {
        System.out.print("----------------------------------Visitantes-----------------------------------\n");

        for(int i = 0; i < 5; i++)
        {
            Visitante vis = Visitante.get(i);

            System.out.println("\nVisitante "+(i+1)+": \n");
            System.out.println("Nombre: "+vis.getNombre());
            System.out.println("Edad: "+vis.getEdad());
            System.out.println("Cedula: "+vis.getCedula());
        }
    }   
}
