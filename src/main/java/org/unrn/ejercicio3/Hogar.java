package org.unrn.ejercicio3;

public class Hogar implements Seguro{
    private final String nombre;
    private final float precio;

    public Hogar(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public double calcularCosto() {
        return precio;
    }
}
