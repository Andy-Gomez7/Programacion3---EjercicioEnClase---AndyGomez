import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Moneda.fxml"));

        Scene scene = new Scene(loader.load());

        scene.getStylesheets().add(
                getClass().getResource("/Style/estilo.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Conversor de monedas");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}