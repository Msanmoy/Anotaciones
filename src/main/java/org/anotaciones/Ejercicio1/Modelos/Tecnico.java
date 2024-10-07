package org.anotaciones.Ejercicio1.Modelos;

public class Tecnico extends Operario{
    private String perfil;
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                "} " + super.toString();
    }
}
