package org.anotaciones.Ejercicio1.Anotaciones;

import java.lang.annotation.Repeatable;

@Repeatable(Empleados.class)
public @interface Empleado {
    String nombre();
    String apellido();
    String dni();
    String direccion();
    int telefono();
    String clase();
    int codigoDespacho();

}
