package org.anotaciones.Ejercicio1;

import org.anotaciones.Ejercicio1.Modelos.Empresa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Empresa empresa = Empresa.cargadorDeContexto();
     System.out.println(empresa);
    }
}