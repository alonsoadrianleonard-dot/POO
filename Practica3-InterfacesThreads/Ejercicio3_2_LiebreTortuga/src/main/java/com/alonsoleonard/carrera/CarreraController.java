package com.alonsoleonard.carrera;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class CarreraController {

    @FXML
    private Button btnIniciar;
    @FXML
    private Label lblLiebre;
    @FXML
    private ProgressBar barraLiebre;
    @FXML
    private Label lblTortuga;
    @FXML
    private ProgressBar barraTortuga;
    @FXML
    private Label lblGanador;

    @FXML
    private void iniciar() {
        btnIniciar.setDisable(true);
        lblGanador.setText("");
        barraLiebre.setProgress(0);
        barraTortuga.setProgress(0);

        ArrayList<Corredor> corredores = new ArrayList<>();
        corredores.add(new Liebre(barraLiebre, lblLiebre));
        corredores.add(new Tortuga(barraTortuga, lblTortuga));

        ArrayList<Thread> hilos = new ArrayList<>();
        for (Corredor c : corredores) {
            Thread hilo = new Thread(c);
            hilo.setDaemon(true);
            hilos.add(hilo);
            hilo.start();
        }

        // Un hilo "juez" espera a que todos lleguen y anuncia al ganador
        Thread juez = new Thread(() -> {
            try {
                for (Thread h : hilos) {
                    h.join();
                }
            } catch (InterruptedException e) {
                return;
            }
            Corredor ganador = corredores.get(0);
            for (Corredor c : corredores) {
                if (c.getHoraLlegada() < ganador.getHoraLlegada()) {
                    ganador = c;
                }
            }
            String nombreGanador = ganador.getNombre();
            Platform.runLater(() -> {
                lblGanador.setText("¡Ganó " + nombreGanador + "!");
                btnIniciar.setDisable(false);
            });
        });
        juez.setDaemon(true);
        juez.start();
    }
}
