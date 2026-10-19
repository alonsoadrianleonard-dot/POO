package com.alonsoleonard.carrera;

import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Tortuga extends Corredor {

    public Tortuga(ProgressBar barra, Label estado) {
        super("La Tortuga", barra, estado);
    }

    @Override
    public int getPausa() {
        return 150; // lenta pero constante
    }
}
