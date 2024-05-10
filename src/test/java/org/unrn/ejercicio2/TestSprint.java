package org.unrn.ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSprint {

    @Test
    public void testSprint() {
        Spike s1 = new Spike(20);
        Spike s2 = new Spike(30);
        Tarea t1 = new Tarea(200);
        Historia h1 = new Historia();
        h1.agregarItem(s1, s2, t1);
        assertEquals(250, h1.calcularTiempoNecesario());

    }
}
