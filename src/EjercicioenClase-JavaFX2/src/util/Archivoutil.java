package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import model.Cita;

public class Archivoutil {
    private File archivo; 
    
    public Archivoutil(File Archivo){
        archivo = Archivo;
    }

    public void Escribir(String linea){
        try {
            FileWriter write = new FileWriter(archivo, true);
            
            write.write(linea+"\n\n");
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cita> Leer(){
        ArrayList<Cita> citas = new ArrayList<>();
        
        try {
            String[] aux;
            String linea;
            FileReader leer = new FileReader(archivo);
            BufferedReader bufLeer = new BufferedReader(leer);
            
            while((linea = bufLeer.readLine()) != null){
                aux = linea.split(";");
                if(aux.length == 10){
                    Cita cita = new Cita(aux[0], aux[1], aux[2], aux[3], aux[4], aux[5], LocalDate.parse(aux[6]), aux[7], aux[8], aux[9]);
                    citas.add(cita);
                }
            }
            
            leer.close();
            bufLeer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("Error de entrada/salida del archivo");
        } catch(DateTimeParseException a){
            a.printStackTrace();
            System.out.print("Error de conversion a LocalDate");
        }
        return citas;
    }
}