package org.unrn.ejercicio4;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    protected double mesConPromocion() {
        return 0.15;
    }

    protected double mesSinPromocion() {
        return 0.21;
    }
}

