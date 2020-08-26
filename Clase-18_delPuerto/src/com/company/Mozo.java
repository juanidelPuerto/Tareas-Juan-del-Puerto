package com.company;

import java.util.HashSet;

public class Mozo {
    private String nombre_apellido;
    private int dni;
    private HashSet<Pedido> pedidos_diarios;

    public Mozo(String nombre_apellido, int dni, HashSet<Pedido> pedidos_diarios) {
        this.nombre_apellido = nombre_apellido;
        this.dni = dni;
        this.pedidos_diarios = pedidos_diarios;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashSet<Pedido> getPedidos_diarios() {
        return pedidos_diarios;
    }

    public void setPedidos_diarios(HashSet<Pedido> pedidos_diarios) {
        this.pedidos_diarios = pedidos_diarios;
    }

    public void agregarPedido(Pedido x){ this.getPedidos_diarios().add(x); }
}
