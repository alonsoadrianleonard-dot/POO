package com.alonsoleonard.carrera;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * Corredor generico: cada corredor es un hilo que avanza su barra de progreso.
 */
public abstract class Corredor implements Runnable {

    protected String nombre;
    protected ProgressBar barra;
    protected Label estado;
    protected int avance;          // de 0 a 100
    protected long horaLlegada;

    public Corredor(String nombre, ProgressBar barra, Label estado) {
        this.nombre = nombre;
        this.barra = barra;
        this.estado = estado;
    }

    /** Milisegundos que tarda en avanzar 1%. */
    public abstract int getPausa();

    /** Cada corredor decide si hace algo especial en cierto punto de la carrera. */
    protected void eventoEspecial() throws InterruptedException {
    }

    @Override
    public void run() {
        avance = 0;
        mostrarEstado("¡Está corriendo!");
        try {
            while (avance < 100) {
                Thread.sleep(getPausa());
                avance++;
                double progreso = avance / 100.0;
                Platform.runLater(() -> barra.setProgress(progreso));
                eventoEspecial();
            }
        } catch (InterruptedException e) {
            return;
        }
        horaLlegada = System.currentTimeMillis();
        mostrarEstado("¡Llegó a la meta!");
    }

    protected void mostrarEstado(String texto) {
        Platform.runLater(() -> estado.setText(nombre + ": " + texto));
    }

    public String getNombre() {
        return nombre;
    }

    public long getHoraLlegada() {
        return horaLlegada;
    }
}
