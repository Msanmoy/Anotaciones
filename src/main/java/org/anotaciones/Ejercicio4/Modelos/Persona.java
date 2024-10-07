package org.anotaciones.Ejercicio4.Modelos;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class Persona {
    @NonNull
    String nombre;
    int edad;
}
