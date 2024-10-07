package org.anotaciones.Ejercicio3.Anotaciones;

import org.anotaciones.Ejercicio3.Enum.DiaSemana;

import java.lang.annotation.Repeatable;

@Repeatable(Tareas.class)
public @interface Tarea {
    String titulo();
    String descripcion();
    DiaSemana dia();
    String hora();
}
