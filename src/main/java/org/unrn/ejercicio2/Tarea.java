package org.unrn.ejercicio2;

public class Tarea implements ItemDeProyecto {
    private final int tiempo;

    public Tarea(int tiempo) {
        this.tiempo = tiempo;
    }


    @Override
    public int calcularTiempoNecesario() {
        return tiempo;
    }
}
