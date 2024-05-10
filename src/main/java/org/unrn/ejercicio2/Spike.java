package org.unrn.ejercicio2;

public class Spike implements ItemDeProyecto {
    private final int tiempo;

    public Spike(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int calcularTiempoNecesario() {
        return tiempo;
    }
}
