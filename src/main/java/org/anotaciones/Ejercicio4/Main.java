package org.anotaciones.Ejercicio4;

import org.anotaciones.Ejercicio4.Modelos.Empleado;
import org.anotaciones.Ejercicio4.Modelos.Persona;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Manuel");
        empleado.setCategoria("Técnico Informático");
        empleado.setSueldo(1853.97);

        System.out.println(empleado);

        Persona persona = Persona.builder().nombre("Manuel").build();

        System.out.println(persona);
    }
}
