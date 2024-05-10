package org.unrn.ejercicio5;

public abstract class Remera {
    private final double precio;

    public Remera(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio * recargo() * extra() * ganancias();
    }

    public abstract double recargo();

    public abstract double extra();

    public abstract double ganancias();
}