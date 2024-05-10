package org.unrn.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSeguros {
    Hogar h1;
    Automovil a1;
    Medico m1;
    Vida v1;
    Paquete p1, p2;

    @BeforeEach
    public void setup() {
        h1 = new Hogar("h1", 10);
        a1 = new Automovil("a1", 20);
        m1 = new Medico("m1", 50);
        v1 = new Vida ("v1", 100);
        p1 = new Paquete("p1");
        p2 = new Paquete("p2");
        p1.agregarSeguro(h1, a1);
        p2.agregarSeguro(h1, a1, m1, v1);
    }

    @Test
    public void calcularCostoPaquete1() {
        assertEquals(28.5, p1.calcularCosto());
    }

    @Test
    public void calcularCostoPaquete2() {
        assertEquals(153.0, p2.calcularCosto());
    }
}
