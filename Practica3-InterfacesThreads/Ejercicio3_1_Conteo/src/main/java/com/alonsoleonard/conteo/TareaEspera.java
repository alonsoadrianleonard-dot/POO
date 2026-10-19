package com.alonsoleonard.conteo;

import javafx.application.Platform;
import javafx.scene.control.ProgressBar;

/**
 * Hilo que llena la barra de progreso en un tiempo dado sin congelar la interfaz.
 */
public class TareaEspera implements Runnable {

    private ProgressBar barra;
    private int segundos;
    private AlTerminar alTerminar;

    public TareaEspera(ProgressBar barra, int segundos, AlTerminar alTerminar) {
        this.barra = barra;
        this.segundos = segundos;
        this.alTerminar = alTerminar;
    }

    @Override
    public void run() {
        int pasos = 100;
        for (int i = 1; i <= pasos; i++) {
            try {
                Thread.sleep(segundos * 1000 / pasos);
            } catch (InterruptedException e) {
                return;
            }
            double avance = i / (double) pasos;
            // Solo el hilo de JavaFX puede tocar la interfaz
            Platform.runLater(() -> barra.setProgress(avance));
        }
        Platform.runLater(() -> alTerminar.terminado());
    }
}
