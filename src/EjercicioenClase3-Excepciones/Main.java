import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GestionEstudiantes gestion = new GestionEstudiantes();
        int op;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite: \n1-Registrar estudiante\n2-Mostrar estudiantes\n3-Salir\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    gestion.Resgistrar();
                    break;
                
                case 2:
                    gestion.Mostrar();
                    break;
                
                case 3:
                    break;
            
                default:
                    break;
            }    
        } while (op != 3);
    }   
}