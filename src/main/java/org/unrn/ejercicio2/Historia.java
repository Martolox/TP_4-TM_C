package org.unrn.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Historia implements ItemDeProyecto {
    private final List<ItemDeProyecto> lista;

    public Historia () {
        this.lista = new ArrayList<>();
    }

    public void agregarItem(ItemDeProyecto ... items) {
        Collections.addAll(lista, items);
    }

    @Override
    public int calcularTiempoNecesario() {
        int total = 0;
        for (ItemDeProyecto i : lista) {
            total += i.calcularTiempoNecesario();
        }

        return total;
    }
}
