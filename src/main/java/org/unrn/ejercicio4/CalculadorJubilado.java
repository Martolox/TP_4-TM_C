package org.unrn.ejercicio4;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    protected double mesConPromocion() {
        return 0.1;
    }

    protected double mesSinPromocion() {
        return 0;
    }
}
