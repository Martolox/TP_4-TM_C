package org.unrn.ejercicio4;

import org.junit.jupiter.api.Test;
import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadorIVA {

    @Test
    public void calcularIVA_Jubilado() {
        CalculadorJubilado jubilado = new CalculadorJubilado(new LogTransaction(), 1);
        assertEquals(14000.0, jubilado.calcularPrecio(14000));
    }
    @Test
    public void calcularIVA_Jubilado_mesEnPromocion() {
        CalculadorJubilado jubilado = new CalculadorJubilado(new LogTransaction(), now().getMonth().getValue());
        assertEquals(15400.0, jubilado.calcularPrecio(14000));
    }
    @Test
    public void calcularIVA_NoJubilado() {
        CalculadorNoJubilado noJubilado = new CalculadorNoJubilado(new LogTransaction(), 1);
        assertEquals(16940.0, noJubilado.calcularPrecio(14000));
    }
    @Test
    public void calcularIVA_NoJubilado_mesEnPromocion() {
        CalculadorNoJubilado noJubilado = new CalculadorNoJubilado(new LogTransaction(), now().getMonth().getValue());
        assertEquals(16100.0, noJubilado.calcularPrecio(14000));
    }
}
