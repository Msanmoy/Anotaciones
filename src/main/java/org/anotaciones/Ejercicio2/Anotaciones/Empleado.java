package org.anotaciones.Ejercicio2.Anotaciones;

public @interface Empleado {
    String nombre();
    String apellido();
    String dni();
    String direccion();
    int telefono();
    int codigoDespacho() default 0;
    int codigoTaller() default 0;
    String perfil() default "";
    String categoria() default "";
}
