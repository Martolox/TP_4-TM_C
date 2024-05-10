package org.unrn.ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrecioRemeras {

    @Test
    public void testRemeraImportada() {
        RemeraImportada r1 = new RemeraImportada(100);
        assertEquals(135.18, r1.calcularPrecio(), 0.01);
    }

    @Test
    public void testRemeraNacional() {
        RemeraNacional r2 = new RemeraNacional(100);
        assertEquals(93.38, r2.calcularPrecio(), 0.01);
    }
}
