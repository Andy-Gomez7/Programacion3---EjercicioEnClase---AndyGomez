import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMedico {
    private ArrayList<Paciente> ListaPacientes;
    Scanner scan;

    public SistemaMedico(){
        ListaPacientes = new ArrayList<Paciente>();
        scan = new Scanner(System.in);
    }

    public void Menu(){
        int op;
        Paciente pacienteBuscado;

        do
        {
            System.out.println("\nDigite una opcion:\n1-Registrar pacientes\n2-Mostrar informacion de paciente\n3-CalcularIMC\n4-Determinar pacientes\n5-Mostrar todos los pacientes\n6-Salir\n");
            op = scan.nextInt();

            switch(op)
            {
                case 1:
                    Registrar();
                    break;

                case 2:
                    System.out.print("Digite el nombre del paciente: ");
                    pacienteBuscado = Buscar(scan.next());
                    System.out.print("\n");
                    if(pacienteBuscado == null){
                        System.out.println("Paciente no encontrado");
                    }
                    else{
                        MostrarinfoPaciente(pacienteBuscado);
                    }
                    break;
                
                case 3:
                    System.out.print("Digite el nombre del paciente: ");
                    pacienteBuscado = Buscar(scan.next());
                    System.out.print("\n");
                    if(pacienteBuscado == null){
                        System.out.println("Paciente no encontrado");
                    }
                    else{
                        System.out.print("El IMC del paciente es: ");
                        System.out.println(CalcularIMC(pacienteBuscado));
                    }
                    break;
                
                case 4:
                    System.out.print("Digite el nombre del paciente: ");
                    pacienteBuscado = Buscar(scan.next());
                    System.out.print("\n");
                    if(pacienteBuscado == null){
                        System.out.println("Paciente no encontrado");
                    }
                    else{
                        Peso(pacienteBuscado);
                    }
                    break;

                case 5:
                    ListarPacientes();
                    break;
                
                case 6:
                    break;

                default:
                    break;

            }
        }while(op != 6);
    }

    public void Registrar(){
        int op;
        do 
        {
            System.out.println("\nDigite una opcion:\n1-Registrar un paciente\n2-Salir\n");
            op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.print("Digite el nombre: ");
                    String nombre = scan.next();
                    System.out.print("\n");
                    
                    System.out.print("Digite el peso kg: ");
                    double peso = scan.nextDouble();
                    System.out.print("\n");

                    System.out.print("Digite la altura en metros: ");
                    double altura = scan.nextDouble();
                    System.out.print("\n");
                    
                    Paciente nuevoPaciente = new Paciente(nombre, peso, altura);
                    ListaPacientes.add(nuevoPaciente);
                    break;

                case 2:
                    break;
            
                default:
                    break;
            }
        } while (op != 2);
    }

    public void MostrarinfoPaciente(Paciente paciente){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Digite el nombre: "+paciente.GetNombre());
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Digite el peso kg: "+paciente.GetPeso());
        System.out.println("----------------------------------------------------------------");
                
        System.out.println("----------------------------------------------------------------");
        System.out.println("Digite la altura en metros: "+paciente.GetAltura());
        System.out.println("----------------------------------------------------------------\n\n");
            
        
    }

    public void ListarPacientes(){
        int contador = 1;
        
        for(Paciente paciente : ListaPacientes){
            System.out.print("---------------------Paciente "+contador+"--------------------------");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Digite el nombre: "+paciente.GetNombre());
            System.out.println("----------------------------------------------------------------");

            System.out.println("----------------------------------------------------------------");
            System.out.println("Digite el peso kg: "+paciente.GetPeso());
            System.out.println("----------------------------------------------------------------");
                
            System.out.println("----------------------------------------------------------------");
            System.out.println("Digite la altura en metros: "+paciente.GetAltura());
            System.out.println("----------------------------------------------------------------\n\n");

            contador++;
            
        }
    }

    public Paciente Buscar(String nombre){
        for(Paciente paciente : ListaPacientes){
            if(paciente.GetNombre().equals(nombre)){
                return paciente;
            }
        }
        return null;
    }

    public double CalcularIMC(Paciente paciente){
        double aux = paciente.GetAltura() * paciente.GetAltura();
        return paciente.GetPeso()/aux;
    }

    public void Peso(Paciente paciente){
        double TipoPeso = CalcularIMC(paciente);

        if(TipoPeso < 18.5){
            System.out.println("Bajo peso");
        }
        else if(TipoPeso >= 18.5 && TipoPeso < 25.0){
            System.out.println("Peso normal");
        }
        else if(TipoPeso >= 25.0){
            System.out.println("Sobrepeso");
        }
    }
}