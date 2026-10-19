package com.alonsoleonard.desglose;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DesgloseController {

    @FXML
    private TextField txtDinero;
    @FXML
    private TextArea txtCantidades;

    @FXML
    private void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());
        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String resultado = "";

        for (int i = 0; i < denominaciones.length; i++) {
            int cantidad = dinero / denominaciones[i];
            dinero = dinero % denominaciones[i];
            resultado = resultado + cantidad + "\n";
        }

        txtCantidades.setText(resultado);
    }

    @FXML
    private void limpiar() {
        txtDinero.setText("");
        txtCantidades.setText("");
    }
}
