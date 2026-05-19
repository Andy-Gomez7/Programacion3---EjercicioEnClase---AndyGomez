import java.util.Scanner;

public class Paciente {
    private String nombre;
    private double peso;
    private double altura;
    Scanner scan;

    public Paciente(){
        scan = new Scanner(System.in);
        SetNombre("");
        SetPeso(0.0);
        SetAltura(0.0);
    }

    public Paciente(String Nombre, double Peso, double Altura){
        scan = new Scanner(System.in);
        SetNombre(Nombre);
        SetPeso(Peso);
        SetAltura(Altura);
    }

    public void SetNombre(String Nombre){
        if(Nombre.equals("")){
            System.out.println("Altura no valida\n");
            do
            {
                System.out.print("\nDigite una altura valida: ");
                Nombre = scan.next();
            }while (Nombre.equals(""));
            System.out.println("\n");
        }
        nombre = Nombre;
    }

    public String GetNombre(){
        return nombre;
    }

    public void SetPeso(double Peso){
        if(Peso <= 0){
            System.out.println("Altura no valida\n");
            do
            {
                System.out.print("\nDigite una altura valida: ");
                Peso = scan.nextDouble();
            }while (Peso <= 0);
            System.out.println("\n");
        }
        peso = Peso;
    }

    public double GetPeso(){
        return peso;
    }

    public void SetAltura(double Altura){
        if(Altura <= 0){
            System.out.println("Altura no valida\n");
            do
            {
                System.out.print("\nDigite una altura valida: ");
                Altura = scan.nextDouble();
            }while (Altura <= 0);
            System.out.println("\n");
        }
        altura = Altura;
    }

    public double GetAltura(){
        return altura;
    }
}