package org.anotaciones.Ejercicio1.Modelos;

public class Oficial extends Operario{
    private String categoria;
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                "} " + super.toString();
    }
}
