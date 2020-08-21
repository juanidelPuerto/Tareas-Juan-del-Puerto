package com.company;

public class Producto {
        private int precio;
        private String nombre;
        private String marca;
        private int unidades;

    public Producto(int precio, String nombre, String marca, int unidades) {
        this.precio = precio;
        this.nombre = nombre;
        this.marca = marca;
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
