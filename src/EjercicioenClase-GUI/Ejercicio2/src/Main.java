import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));

            Scene scene = new Scene(loader.load());

            stage.setScene(scene);
            stage.setTitle("Sistema de Cafeteria");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
