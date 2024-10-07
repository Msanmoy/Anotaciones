package org.anotaciones.Ejercicio3.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tareas {
    Tarea[] value();
}
