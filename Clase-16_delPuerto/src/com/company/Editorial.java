package com.company;

import java.util.HashSet;

public class Editorial {
    private String nombre_editorial;
    private HashSet<Libro> libros_vendidos;


    public Editorial(String nombre_editorial, HashSet<Libro> libros_vendidos) {
        this.nombre_editorial = nombre_editorial;
        this.libros_vendidos = libros_vendidos;
    }

    public HashSet<Libro> getLibros_vendidos() {
        return libros_vendidos;
    }

    public void setLibros_vendidos(HashSet<Libro> libros_vendidos) {
        this.libros_vendidos = libros_vendidos;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorail(String nombre_editorail) {
        this.nombre_editorial = nombre_editorail;
    }
}
