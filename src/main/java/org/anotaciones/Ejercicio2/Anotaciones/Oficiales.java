package org.anotaciones.Ejercicio2.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Oficiales {
    Oficial[] value();
}
