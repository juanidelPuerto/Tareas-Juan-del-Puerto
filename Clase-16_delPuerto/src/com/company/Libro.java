package com.company;

public class Libro {
    private String nombre_libro;
    private float precio;
    private Editorial editorial_libro;


    public Libro(String nombre_libro, float precio, Editorial editorial_libro) {
        this.nombre_libro = nombre_libro;
        this.precio = precio;
        this.editorial_libro = editorial_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
