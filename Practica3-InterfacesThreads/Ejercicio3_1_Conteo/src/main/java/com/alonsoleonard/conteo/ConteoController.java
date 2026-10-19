package com.alonsoleonard.conteo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class ConteoController {

    @FXML
    private TextField txtClics;
    @FXML
    private ProgressBar barra;
    @FXML
    private Button btnEsperar;

    private Contador contador = new Contador();

    @FXML
    private void contar() {
        contador.incrementar();
        txtClics.setText("" + contador.getClics());
    }

    @FXML
    private void esperar() {
        btnEsperar.setDisable(true);
        barra.setProgress(0);

        TareaEspera tarea = new TareaEspera(barra, 10, () -> btnEsperar.setDisable(false));
        Thread hilo = new Thread(tarea);
        hilo.setDaemon(true);
        hilo.start();
    }
}
