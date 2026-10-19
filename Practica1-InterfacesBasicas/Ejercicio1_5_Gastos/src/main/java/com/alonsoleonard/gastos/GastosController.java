package com.alonsoleonard.gastos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GastosController {

    @FXML
    private TextField txtAlimentacion;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefonia;
    @FXML
    private TextField txtOtros;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtMasAlto;

    @FXML
    private void calcular() {
        String[] nombres = {"Alimentación", "Refrigerios", "Transporte", "Telefonía", "Otros"};
        int[] gastos = new int[5];
        gastos[0] = Integer.parseInt(txtAlimentacion.getText());
        gastos[1] = Integer.parseInt(txtRefrigerios.getText());
        gastos[2] = Integer.parseInt(txtTransporte.getText());
        gastos[3] = Integer.parseInt(txtTelefonia.getText());
        gastos[4] = Integer.parseInt(txtOtros.getText());

        int total = 0;
        int posMayor = 0;
        for (int i = 0; i < gastos.length; i++) {
            total = total + gastos[i];
            if (gastos[i] > gastos[posMayor]) {
                posMayor = i;
            }
        }

        txtTotal.setText("" + total);
        txtMasAlto.setText(nombres[posMayor]);
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtMasAlto.setText("");
    }
}
