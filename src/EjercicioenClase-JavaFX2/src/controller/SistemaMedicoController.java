package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import model.Cita;
import util.Archivoutil;

public class SistemaMedicoController {

    @FXML
    private AnchorPane AP;

    @FXML
    private HBox hbx;

    @FXML
    private ComboBox<String> CBEspecialidad;

    @FXML
    private ComboBox<String> CBEstado;

    @FXML
    private ComboBox<String> CBMedico;

    @FXML
    private DatePicker DPFecha;

    @FXML
    private TableView<Cita> TbVw;

    @FXML
    TableColumn<Cita, String> TColCodigo = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColPaciente = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColCedula = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColTelefono = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColMedico = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColEspecialidad = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColFecha = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColHora = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColMotivoConslt = new TableColumn<>();

    @FXML
    TableColumn<Cita, String> TColEstado = new TableColumn<>(); 

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnCargar;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextArea txtFAMotivoCons;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtPaciente;

    @FXML
    private TextField txtTelefono;
    
    @FXML
    private Label lbMensajeUser;

    private ObservableList<Cita> citasObsv;

    private Archivoutil ArchUtil;

    private File archivo;

    public void initialize(){
        CBEstado.getItems().addAll("Programada","Atendida","Cancelada");

        CBEspecialidad.getItems().addAll("Dermatología", "Endocrinología", "Epidemiología", "Gastroenterología");

        CBMedico.getItems().addAll("Enzo fernandez","Nico Gonzales","Nicolas Tagliafico");

        try {
            archivo = new File("Citas.txt");
        
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        
            ArchUtil = new Archivoutil(archivo);
        
        } catch (IOException e) {
            e.printStackTrace();
        }

        hbx.setStyle("-fx-background-color: skyblue");
    }

    public void Registrar(){
        citasObsv = FXCollections.observableArrayList(ArchUtil.Leer());
    }

    public void Cancelar(){
        Cita cita = TbVw.getSelectionModel().getSelectedItem();

        if(cita != null){
            cita.setEstado("Cancelada");
            TbVw.refresh();
            lbMensajeUser.setText("la cita fue cancelada");
        }else{
            lbMensajeUser.setText("porfavor selecciones una casila");
        }
    }

    public void Limpiar(){
        txtCodigo.clear();
        txtPaciente.clear(); 
        txtCedula.clear(); 
        txtTelefono.clear();
        CBMedico.getSelectionModel().clearSelection();
        CBEspecialidad.getSelectionModel().clearSelection();
        DPFecha.setValue(null);
        txtHora.clear();
        txtFAMotivoCons.clear();
        CBEstado.getSelectionModel().clearSelection();
        lbMensajeUser.setText("La informacion se limpio exitosamente");
    }

    public void Guardar(){
        String cita = txtCodigo.getText()+";"+ txtPaciente.getText()+";"+txtCedula.getText()+";"+txtTelefono.getText()+";"+CBMedico.getValue()+";"+CBEspecialidad.getValue()+";"+DPFecha.getValue()+";"+txtHora.getText()+";"+txtFAMotivoCons.getText()+";"+CBEstado.getValue();
        
        if(BuscarDuplicado(txtCodigo.getText())){
            lbMensajeUser.setText("El paciente de fue registrado");
        }
        else{
            lbMensajeUser.setText("El paciente fue registrado exitosamente");
        }

        ArchUtil.Escribir(cita);
    }

    public void Cargar(){
        TbVw.setItems(citasObsv);
        lbMensajeUser.setText("La informacion del paciente se cargo exitosamente");
    }

    private Boolean BuscarDuplicado(String buscar){
        String linea;
        try {
            FileReader leer = new FileReader(archivo);
            BufferedReader bufleer = new BufferedReader(leer);
            
            while((linea = bufleer.readLine()) != null){
                if(buscar.equals(linea)){
                    return true;
                }
            }

            leer.close();
            bufleer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}