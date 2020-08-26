package com.company;

import java.util.ArrayList;

public class Pedido {
    private int numero_pedido;
    private ArrayList<Plato> platos_ordenados;
    private boolean servido;
    private Mesa mesa;

    public Pedido(int numero_pedido, ArrayList<Plato> platos_ordenados, boolean servido, Mesa mesa) {
        this.numero_pedido = numero_pedido;
        this.platos_ordenados = platos_ordenados;
        this.servido = servido;
        this.mesa = mesa;
    }


    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public ArrayList<Plato> getPlatos_ordenados() {
        return platos_ordenados;
    }

    public void setPlatos_ordenados(ArrayList<Plato> platos_ordenados) {
        this.platos_ordenados = platos_ordenados;
    }

    public boolean isServido() {
        return servido;
    }

    public void setServido(boolean servido) {
        this.servido = servido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
