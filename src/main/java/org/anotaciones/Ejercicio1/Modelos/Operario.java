package org.anotaciones.Ejercicio1.Modelos;

public abstract class Operario extends Empleado {
    private int codigoTaller;

    public int getCodigoTaller() {
        return codigoTaller;
    }
    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

}
