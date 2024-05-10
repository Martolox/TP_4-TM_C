package org.unrn.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLaserX {
    Empleado e1, e2, e3, e4, e5, e6;
    LiderDeProyecto lider1, lider2, lider3, lider4;
    MandoMedio mando1, mando2;
    Gerente gerente1, gerente2;
    Jefe jefe;

    @BeforeEach
    public void setup() {
        e1 = new Regular("empleado1", 10);
        e2 = new Regular("empleado2", 10);
        e3 = new Regular("empleado3", 10);
        e4 = new Regular("empleado4", 10);
        e5 = new Regular("empleado5", 10);
        e6 = new Regular("empleado6", 10);
        lider1 = new LiderDeProyecto("lider1", 50);
        lider2 = new LiderDeProyecto("lider2", 50);
        lider3 = new LiderDeProyecto("lider3", 50);
        lider4 = new LiderDeProyecto("lider4", 50);
        mando1 = new MandoMedio("mando1", 150);
        mando2 = new MandoMedio("mando2", 150);
        gerente1 = new Gerente("gerente1", 500);
        gerente2 = new Gerente("gerente2", 500);
        jefe = new Jefe("jefe", 1000);
        lider1.agregarEmpleado(e1, e2);
        lider2.agregarEmpleado(e3, e4);
        lider3.agregarEmpleado(e5);
        lider4.agregarEmpleado(e6);
        mando1.agregarEmpleado(lider1, lider2);
        mando2.agregarEmpleado(lider3, lider4);
        gerente1.agregarEmpleado(mando1);
        gerente2.agregarEmpleado(mando2);
        jefe.agregarEmpleado(gerente1, gerente2);
    }

    @Test
    public void calcularMontoTotal() {
        assertEquals(70,lider1.mostrarSalarios());
        assertEquals(2560,jefe.mostrarSalarios());
    }
}
