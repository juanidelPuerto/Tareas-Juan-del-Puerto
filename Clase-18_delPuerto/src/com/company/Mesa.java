package com.company;

public class Mesa {
    private int numero;
    private int veces_ocupada;
    private boolean disponible;
    private int capacidad;

    public Mesa(int numero, int veces_ocupada, boolean disponible, int capacidad) {
        this.numero = numero;
        this.veces_ocupada = veces_ocupada;
        this.disponible = disponible;
        this.capacidad = capacidad;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVeces_ocupada() {
        return veces_ocupada;
    }

    public void setVeces_ocupada(int veces_ocupada) {
        this.veces_ocupada = veces_ocupada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
