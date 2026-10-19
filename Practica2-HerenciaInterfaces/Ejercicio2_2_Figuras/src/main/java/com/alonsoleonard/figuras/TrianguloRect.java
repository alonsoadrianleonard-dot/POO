package com.alonsoleonard.figuras;

import java.util.Locale;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        // Lados: ancho + alto + hipotenusa
        double hipotenusa = Math.sqrt(ancho * ancho + alto * alto);
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\n\n"
                + "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho
                + ", area: " + String.format(Locale.US, "%.2f", calcularArea())
                + ", perimetro: " + String.format(Locale.US, "%.2f", calcularPerimetro())
                + "\n";
    }
}
