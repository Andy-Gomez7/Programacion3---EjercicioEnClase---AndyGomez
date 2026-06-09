import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class GestionarEstudiante{
    private File archivo;
    private Scanner scan;

    public GestionarEstudiante(){
        scan = new Scanner(System.in);
        try{
            archivo = new File("Estudiante.txt");
            if(archivo.createNewFile()){
                System.out.println("Archivo creado\n");
            }
            else{
                System.out.println("Archivo no creado\n");
            }
        }catch(Exception e){}
    } 

    public void Agregar(){
        try{
            FileWriter write = new FileWriter("estudiante.txt",true);
            BufferedWriter bufwrite = new BufferedWriter(write);
            
            scan.nextLine();
            System.out.print("Digite el nombre: ");
            String nombre = scan.nextLine();
            System.out.println();

            System.out.print("Digite la edad: ");
            int edad = scan.nextInt();
            System.out.println();

            scan.nextLine();
            System.out.print("Digite la matricula: ");
            String Matricula = scan.nextLine();
            System.out.println();

            
            bufwrite.write("Estudiante: "+nombre);
            bufwrite.newLine();
            bufwrite.write("Edad: "+edad);
            bufwrite.newLine();
            bufwrite.write("Matricula: "+Matricula);
            bufwrite.newLine();
            bufwrite.newLine();

            bufwrite.close();

        }catch(Exception e){}
    }

    public void Mostrar(){
        try{
            FileReader read = new FileReader("estudiante.txt");
            BufferedReader bufread = new BufferedReader(read);

            String linea;

            while((linea =  bufread.readLine()) != null){
                System.out.println(linea);
                System.out.println();
            }
            bufread.close();

        }catch(Exception e){}
    }

    public void Menu(){
        int op;
        do{
            System.out.print("Digite:\n1-Agregar\n2-Mostrar\n3-Salir\n");
            op = scan.nextInt();
            switch(op){
                case 1:
                    Agregar();
                    break;
                case 2:
                    Mostrar();
                    break;
                case 3:
                    break;
            }
        }while(op != 3);
    }
}