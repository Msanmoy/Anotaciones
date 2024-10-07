package org.anotaciones.Ejercicio2;

import org.anotaciones.Ejercicio2.Modelos.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = Empresa.cargadorDeContexto();
        System.out.println(empresa);
    }
}
