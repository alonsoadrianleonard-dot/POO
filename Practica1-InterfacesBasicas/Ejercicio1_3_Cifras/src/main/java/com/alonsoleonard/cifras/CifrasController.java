package com.alonsoleonard.cifras;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CifrasController {

    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtCantidad;
    @FXML
    private TextField txtImpares;
    @FXML
    private TextField txtPares;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtMayor;
    @FXML
    private TextField txtMenor;
    @FXML
    private TextArea txtDivisores;

    @FXML
    private void analizar() {
        int numero = Integer.parseInt(txtNumero.getText());

        int cantidad = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int mayor = 0;
        int menor = 9;
        int aux = numero;

        // Se separa el numero cifra por cifra
        do {
            int cifra = aux % 10;
            cantidad++;
            if (cifra % 2 == 0) {
                sumaPares = sumaPares + cifra;
            } else {
                sumaImpares = sumaImpares + cifra;
            }
            if (cifra > mayor) {
                mayor = cifra;
            }
            if (cifra < menor) {
                menor = cifra;
            }
            aux = aux / 10;
        } while (aux > 0);

        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores = divisores + i + "\n";
            }
        }

        txtCantidad.setText("" + cantidad);
        txtImpares.setText("" + sumaImpares);
        txtPares.setText("" + sumaPares);
        txtTotal.setText("" + (sumaImpares + sumaPares));
        txtMayor.setText("" + mayor);
        txtMenor.setText("" + menor);
        txtDivisores.setText(divisores);
    }

    @FXML
    private void limpiar() {
        txtNumero.setText("");
        txtCantidad.setText("");
        txtImpares.setText("");
        txtPares.setText("");
        txtTotal.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtDivisores.setText("");
    }
}
