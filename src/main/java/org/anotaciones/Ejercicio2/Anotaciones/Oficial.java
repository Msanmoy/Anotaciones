package org.anotaciones.Ejercicio2.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Oficiales.class)
public @interface Oficial {
    Operario operario();
    String categoria();
}
