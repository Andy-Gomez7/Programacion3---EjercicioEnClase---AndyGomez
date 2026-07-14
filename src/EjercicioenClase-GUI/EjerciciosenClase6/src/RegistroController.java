import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class RegistroController {
    
    @FXML
    private TextField txtFNombre;
    
    @FXML
    private TextField txtFMatricula;

    @FXML
    private TextField txtFCarrera;

    public Estudiante estudiante;
    
    public DetalleController controller;

    @FXML
    public void inicializarEstudiante(){
        estudiante = new Estudiante(
            txtFNombre.getText(), 
            txtFMatricula.getText(), 
            txtFCarrera.getText()
        );
        
        DetalleController controller = Navegacion.abrirVentana(
            "detalle.fxml",
            "Detalle del estudiante"            
        );

        controller.recibirEstudiante(estudiante);
        
        
    }

}