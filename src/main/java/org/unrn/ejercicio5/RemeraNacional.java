package org.unrn.ejercicio5;

public class RemeraNacional extends Remera {
    private final double recargo = 0.015;
    private final double extra = -0.2;
    private final double ganancias = 0.15;

    public RemeraNacional(double precio) {
        super(precio);
    }

    @Override
    public double recargo() {
        return (1 + recargo);
    }

    @Override
    public double extra() {
        return (1 + extra);
    }

    @Override
    public double ganancias() {
        return (1 + ganancias);
    }
}
