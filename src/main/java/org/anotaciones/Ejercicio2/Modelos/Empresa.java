package org.anotaciones.Ejercicio2.Modelos;


import org.anotaciones.Ejercicio2.Anotaciones.Directivo;
import org.anotaciones.Ejercicio2.Anotaciones.Empleado;
import org.anotaciones.Ejercicio2.Anotaciones.Oficial;
import org.anotaciones.Ejercicio2.Anotaciones.Tecnico;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public static Empresa cargadorDeContexto() {
        Empresa empresa = new Empresa();
        Directivo[] directivos = Empresa.class.getAnnotationsByType(Directivo.class);
        Tecnico[] tecnicos = Empresa.class.getAnnotationsByType(Tecnico.class);
        Oficial[] oficiales = Empresa.class.getAnnotationsByType(Oficial.class);

        List<Empleado> localEmpleados = new ArrayList<>();

        for (Directivo directivo : directivos) {
            org.anotaciones.Ejercicio2.Modelos.Directivo localDirectivo = new org.anotaciones.Ejercicio2.Modelos.Directivo();

            initEmp(localDirectivo,directivo.empleado());
            localDirectivo.setCodigoDespacho(directivo.codigoDespacho());
            localEmpleados.add((Empleado) localDirectivo);
        }

        for (Tecnico tecnico : tecnicos) {
            org.anotaciones.Ejercicio2.Modelos.Tecnico localTecnico = new org.anotaciones.Ejercicio2.Modelos.Tecnico();

            initEmp(localTecnico, tecnico.operario().empleado());
            localTecnico.setCodigoTaller(tecnico.operario().codigoTaller());
            localTecnico.setPerfil(tecnico.perfil());
            localEmpleados.add((Empleado) localTecnico);
        }

        for (Oficial oficial : oficiales) {
            org.anotaciones.Ejercicio2.Modelos.Oficial localOficial = new org.anotaciones.Ejercicio2.Modelos.Oficial();

            initEmp(localOficial, oficial.operario().empleado());
            localOficial.setCodigoTaller(oficial.operario().codigoTaller());
            localOficial.setCategoria(oficial.categoria());
            localEmpleados.add((Empleado) localOficial);
        }

        empresa.setEmpleados(localEmpleados);
        return empresa;
    }

    private static void initEmp(org.anotaciones.Ejercicio2.Modelos.Empleado empleado, Empleado ant) {
        empleado.setNombre(ant.nombre());
        empleado.setApellido(ant.apellido());
        empleado.setDireccion(ant.direccion());
        empleado.setDni(ant.dni());
        empleado.setTelefono(ant.telefono());
        empleado.setTelefono(ant.telefono());
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + empleados +
                '}';
    }
}
