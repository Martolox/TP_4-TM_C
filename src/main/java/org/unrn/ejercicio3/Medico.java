package org.unrn.ejercicio3;

public class Medico implements Seguro{
    private final String nombre;
    private final float precio;

    public Medico(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public double calcularCosto() {
        return precio;
    }
}