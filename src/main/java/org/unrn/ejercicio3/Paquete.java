package org.unrn.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paquete implements Seguro{
    private final String nombre;
    private final List<Seguro> lista;

    public Paquete(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }

    public void agregarSeguro(Seguro ... seguros) {
        Collections.addAll(lista, seguros);
    }

    @Override
    public double calcularCosto() {
        double monto = 0;
        for (Seguro s : lista) {
            monto += s.calcularCosto();
        }
        return (monto - 0.05 * (lista.size() - 1) * monto);
    }
}
