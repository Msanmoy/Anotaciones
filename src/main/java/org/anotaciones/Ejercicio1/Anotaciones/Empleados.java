package org.anotaciones.Ejercicio1.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Empleados {
    Empleado[] value();
}
