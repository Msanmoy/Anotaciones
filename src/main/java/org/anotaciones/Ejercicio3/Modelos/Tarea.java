package org.anotaciones.Ejercicio3.Modelos;

import org.anotaciones.Ejercicio3.Enum.DiaSemana;

public class Tarea {
    private String titulo;
    private String descripcion;
    private DiaSemana dia;
    private String hora;

    public Tarea(String titulo, String descripcion, DiaSemana dia, String hora) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dia = dia;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }

}
