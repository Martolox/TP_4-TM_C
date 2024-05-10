package org.unrn.ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    private final LogTransaction log;
    private final int mesEnPromocion;

    public Calculador(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * this.mesConPromocion();
        } else {
            precioTotal += precioProducto * this.mesSinPromocion();
        }
        log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }

    protected abstract double mesConPromocion();

    protected abstract double mesSinPromocion();
}
