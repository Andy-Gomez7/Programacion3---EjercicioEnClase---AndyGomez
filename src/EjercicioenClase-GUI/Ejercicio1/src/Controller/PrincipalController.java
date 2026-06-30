package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private TextField txtCantConv;

    @FXML
    private Label mensajeAyuda;

    @FXML
    private Button Convertir;
    
    @FXML
    private Button Limpiar;

    @FXML
    private ComboBox<String> Monedas;

    @FXML
    private Label Resultado;

    @FXML
    private void initialize(){
        Monedas.getItems().addAll("Dolar","Euro");
    }


    @FXML
private void Convertir(ActionEvent e) {

    String textoCantidad = txtCantConv.getText();
    Double cantidad = 0.0;

    try {
        if (textoCantidad.isBlank()) {
            mensajeAyuda.setText("Ingrese un monto.");
        }
        else if (Monedas.getValue() == null) {
            mensajeAyuda.setText("Seleccione una moneda.");
        }
        else {
            cantidad = Double.parseDouble(textoCantidad);
            if (cantidad < 0) {
                mensajeAyuda.setText("Ingrese un monto valido.");
            }
            else if (Monedas.getValue().equals("Dolar")) {
                Resultado.setText(String.valueOf(convPesoDolar(cantidad)));
                mensajeAyuda.setText("");
            }
            else if (Monedas.getValue().equals("Euro")) {
                Resultado.setText(String.valueOf(convPesoEuro(cantidad)));
                mensajeAyuda.setText("");
            }
        }

    } catch (NumberFormatException a) {
        mensajeAyuda.setText("El monto debe ser numerico.");
    }
}

    private double convPesoDolar(double num){
        return num * 0.017;
    }

    private double convPesoEuro(double num){
        return num * 0.015;
    }

    @FXML
    private void Limpiar(){
        txtCantConv.clear();
        Resultado.setText("");
        mensajeAyuda.setText("");
        Monedas.getSelectionModel().clearSelection();    
    }
}