package com.alonsoleonard.edad;

import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EdadController {

    @FXML
    private TextField txtFecha;
    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {
        // La fecha viene como dd/mm/aaaa
        String[] partes = txtFecha.getText().split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        LocalDate hoy = LocalDate.now();
        int anios = hoy.getYear() - anio;
        int meses = hoy.getMonthValue() - mes;

        // Si aun no llega el dia del mes, no se cuenta ese mes completo
        if (hoy.getDayOfMonth() < dia) {
            meses = meses - 1;
        }
        // Si los meses quedan negativos, aun no cumple años este año
        if (meses < 0) {
            anios = anios - 1;
            meses = meses + 12;
        }

        lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
    }

    @FXML
    private void limpiar() {
        txtFecha.setText("");
        lblResultado.setText("");
    }
}
