package org.anotaciones.Ejercicio2.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tecnicos {
    Tecnico[] value();
}
