package com.alonsoleonard.conteo;

/**
 * Lleva la cuenta de los clics.
 */
public class Contador {

    private int clics;

    public Contador() {
        clics = 0;
    }

    public void incrementar() {
        clics++;
    }

    public int getClics() {
        return clics;
    }
}
