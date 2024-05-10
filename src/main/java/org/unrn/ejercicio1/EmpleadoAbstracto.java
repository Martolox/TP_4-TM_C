package org.unrn.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class EmpleadoAbstracto implements Empleado{
    private String nombre;
    private final int salario;
    private final List<Empleado> lista;

    public EmpleadoAbstracto(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.lista = new ArrayList<>();
    }

    public int mostrarSalarios() {
        int monto = 0;
        for (Empleado e : lista) {
            monto += e.mostrarSalarios();
        }
        return monto += salario;
    }

    public void agregarEmpleado(Empleado ... empleados) {
        Collections.addAll(lista, empleados);
    }
}
