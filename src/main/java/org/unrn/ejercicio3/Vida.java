package org.unrn.ejercicio3;

public class Vida implements Seguro{
    private final String nombre;
    private final float precio;

    public Vida(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public double calcularCosto() {
        return precio;
    }
}