package com.alonsoleonard.carrera;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Liebre extends Corredor {

    public Liebre(ProgressBar barra, Label estado) {
        super("La Liebre", barra, estado);
    }

    @Override
    public int getPausa() {
        return 40; // muy rapida
    }

    @Override
    protected void eventoEspecial() throws InterruptedException {
        // A la mitad del camino se confia y se duerme
        if (avance == 50) {
            mostrarEstado("¡Se durmió!");
            Thread.sleep(12000);
            mostrarEstado("¡Despertó y está corriendo!");
        }
    }
}
