package org.anotaciones.Ejercicio3;

import org.anotaciones.Ejercicio3.Modelos.AgendaSemana;

public class Main {
    public static void main(String[] args) {
        AgendaSemana agendaSemana = AgendaSemana.cargadorDeContexto();
        System.out.println(agendaSemana);
    }
}
