package com.example.generadordeclaves;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;


public class GeneradorDeClavesController  {
    Clave clave=new Clave();
    @FXML
    private Button button_generar=new Button();

    @FXML
    private PasswordField textPassword;

    final Clipboard clipboard = Clipboard.getSystemClipboard();
    final ClipboardContent cont_portapapeles = new ClipboardContent();
    @FXML
    private Spinner<Integer> spinnerLongitud;




    @FXML
    public void copiar(ActionEvent actionEvent) {
        String copiaClave = textPassword.getText();
        cont_portapapeles.putString(copiaClave);
        clipboard.setContent(cont_portapapeles);

    }
    @FXML
    public void btn_generar(ActionEvent actionEvent) {
        int longitud = spinnerLongitud.getValue();
        textPassword.setText(clave.generar(longitud));
    }

    @FXML

    public void mostrar(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("La contraseña generada es "+textPassword.getText());
        alert.showAndWait();
    }
}
