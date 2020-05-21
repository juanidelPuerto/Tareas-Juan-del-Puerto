package com.company;

public class Instruccion {
    private String nombreoperacion;
    private int valor;
    private String nombrevariable;


    public String getNombreoperacion() {
        return nombreoperacion;
    }

    public int getValor() {
        return valor;
    }

    public String getNombreVariable() {
        return nombrevariable;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNombreVariable(String nombreVariable) {
        this.nombrevariable = nombreVariable;
    }

    public void setNombreoperacion(String nombreoperacion) {
        this.nombreoperacion = nombreoperacion;
    }

    public Instruccion(String nombreoperacion, int valor, String nombrevariable) {
        this.nombreoperacion = nombreoperacion;
        this.valor = valor;
        this.nombrevariable = nombrevariable;
    }

    public Instruccion(String nombreoperacion, int valor) {
        this.nombreoperacion = nombreoperacion;
        this.valor = valor;
    }

    public Instruccion(String nombreoperacion) {
        this.nombreoperacion = nombreoperacion;
    }

    public Instruccion(String nombreoperacion, String nombrevariable) {
        this.nombreoperacion = nombreoperacion;
        this.nombrevariable = nombrevariable;
    }
}
