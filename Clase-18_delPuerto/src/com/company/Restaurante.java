package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Restaurante {
        private String nombre_restaurante;
        private HashMap<Pedido,Mozo> pedidos;
        private HashSet<Mesa> mesas;
        private HashSet<Plato> platos;

    public Restaurante(String nombre_restaurante, HashMap<Pedido, Mozo> pedidos, HashSet<Mesa> mesas, HashSet<Plato> platos) {
        this.nombre_restaurante = nombre_restaurante;
        this.pedidos = pedidos;
        this.mesas = mesas;
        this.platos = platos;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public void setNombre_restaurante(String nombre_restaurante) {
        this.nombre_restaurante = nombre_restaurante;
    }

    public HashMap<Pedido, Mozo> getPedidos() {
        return pedidos;
    }

    public void setPedidos(HashMap<Pedido, Mozo> pedidos) {
        this.pedidos = pedidos;
    }

    public HashSet<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(HashSet<Mesa> mesas) {
        this.mesas = mesas;
    }

    public HashSet<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(HashSet<Plato> platos) {
        this.platos = platos;
    }
    public int idPedido(Pedido pedido_consultar){
        int id_retornar=0;
        id_retornar=pedido_consultar.getNumero_pedido();
        return id_retornar;
    }
    public Plato getPlatoMasPedido(){
        int cant_veces_mayor = 0;
        Plato plato_retornar = new Plato("",0,0);
        for (Plato i : this.getPlatos()
             ) {
            if (i.getVeces_pedido()>cant_veces_mayor){
                cant_veces_mayor=i.getVeces_pedido();
                plato_retornar=i;
            }
        }
        return plato_retornar;
    }

    public Plato getPlatoMenosPedido(){
        int cant_veces_menor = 0;
        Plato plato_retornar = new Plato("",0,0);
        for (Plato i : this.getPlatos()
        ) {
            if (i.getVeces_pedido()<cant_veces_menor){
                cant_veces_menor=i.getVeces_pedido();
                plato_retornar=i;
            }
        }
        return plato_retornar;
    }

    public Mesa getMesaMasOcupada(){
        int cant_ocupada_mayor = 0;
        Mesa mesa_retornar = new Mesa(0,0,true,0);
        for (Mesa i : this.getMesas()
             ) {
            if (cant_ocupada_mayor>i.getVeces_ocupada()){
                cant_ocupada_mayor=i.getVeces_ocupada();
                mesa_retornar=i;
            }
        }
        return mesa_retornar;
    }

    public Pedido getProximoPedidoEntregar(){
        Pedido pedido_retornar = new Pedido(0,new ArrayList<>(),false,new Mesa(0,0,true,0));
        for (Map.Entry<Pedido,Mozo> i : this.getPedidos().entrySet()
             ) {
                if (pedido_retornar.getNumero_pedido() < i.getKey().getNumero_pedido() && i.getKey().isServido()==false){
                    pedido_retornar=i.getKey();
                }
        }
        return pedido_retornar;
    }

    
    public void ingresarPedido(Mesa mesa_ingresar, Mozo mozo_ingresar, ArrayList<Plato> platos_ordenados){
        int id_pedido_ingresar=this.getPedidos().size()+1;
        Pedido pedido_ingresar = new Pedido(id_pedido_ingresar,platos_ordenados,false,mesa_ingresar);
        this.getPedidos().put(pedido_ingresar,mozo_ingresar);
    }

    public void reiniciarDia(){
        this.getPlatos().clear();
        for (Mesa i : this.getMesas()
             ) {
            i.setDisponible(true);
        }
    }

    public static void main(String[] args) {



    }
}
