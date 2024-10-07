package org.anotaciones.Ejercicio3.Modelos;

import org.anotaciones.Ejercicio3.Anotaciones.Tarea;
import org.anotaciones.Ejercicio3.Enum.DiaSemana;

import java.util.ArrayList;
import java.util.List;

@Tarea(
        titulo = "Hacer ejercicio",
        descripcion = "Pierna en el GIM",
        dia = DiaSemana.LUNES,
        hora = "17:00"
)

@Tarea(
        titulo = "Comer Sano",
        descripcion = "Preparar arroz con pollo",
        dia = DiaSemana.JUEVES,
        hora = "21:30"
)

@Tarea(
        titulo = "Hacer ejercicio",
        descripcion = "Torso en el GIM",
        dia = DiaSemana.VIERNES,
        hora = "18:00"
)

public class AgendaSemana {
    private List<org.anotaciones.Ejercicio3.Modelos.Tarea> tareas;

    public static AgendaSemana cargadorDeContexto(){
        AgendaSemana agenda = new AgendaSemana();
        Tarea[] tareas = AgendaSemana.class.getAnnotationsByType(Tarea.class);
        List<org.anotaciones.Ejercicio3.Modelos.Tarea> listaTareas = new ArrayList<>();

        for (Tarea tarea : tareas) {
            org.anotaciones.Ejercicio3.Modelos.Tarea localTarea = new org.anotaciones.Ejercicio3.Modelos.Tarea(tarea.titulo(), tarea.descripcion(), tarea.dia(), tarea.hora());
            listaTareas.add(localTarea);
        }

        agenda.setTareas(listaTareas);
        return agenda;
    }

    public List<org.anotaciones.Ejercicio3.Modelos.Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<org.anotaciones.Ejercicio3.Modelos.Tarea> tareas) {
        this.tareas = tareas;
    }


    @Override
    public String toString() {
        String devolver = "";
        for (int i = 0; i < tareas.size(); i++) {
            devolver += tareas.get(i).toString();
            if (i < tareas.size() - 1) {
                devolver += "\n--------------------\n";
            }
        }

        return devolver;
    }
}

