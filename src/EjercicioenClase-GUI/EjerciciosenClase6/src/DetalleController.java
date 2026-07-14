import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DetalleController {
    
    @FXML
    private Label txtNombre;

    @FXML
    private Label txtMatricula;

    @FXML
    private Label txtCarrera;

    @FXML
    public void recibirEstudiante(Estudiante estudiante){
        txtNombre.setText("Nombre: "+estudiante.GetNombre());
        txtMatricula.setText("Matricula: "+estudiante.GetMatricula());
        txtCarrera.setText("Carrera: "+estudiante.GetCarrera());
    }

    @FXML
    public void cerrarVentana(){
        Stage stage = (Stage) txtNombre.getScene().getWindow();
        stage.close();
    }
}