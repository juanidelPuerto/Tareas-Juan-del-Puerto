package com.company;

public class Plato {
    private  String nombre_plato;
    private int veces_pedido;
    private float precio;

    public Plato(String nombre_plato, int veces_pedido, float precio) {
        this.nombre_plato = nombre_plato;
        this.veces_pedido = veces_pedido;
        this.precio = precio;
    }


    public String getNombre_plato() {
        return nombre_plato;
    }

    public void setNombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public int getVeces_pedido() {
        return veces_pedido;
    }

    public void setVeces_pedido(int veces_pedido) {
        this.veces_pedido = veces_pedido;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
