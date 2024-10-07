package org.anotaciones.Ejercicio2.Anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Tecnicos.class)
public @interface Tecnico {
    Operario operario();
    String perfil();
}
