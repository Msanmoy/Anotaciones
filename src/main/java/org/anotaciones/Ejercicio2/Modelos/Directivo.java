package org.anotaciones.Ejercicio2.Modelos;

public class Directivo extends Empleado{
    private int codigoDespacho;

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codigoDespacho=" + codigoDespacho +
                "} " + super.toString();
    }
}
