package com.company;
import java.util.ArrayList;

public class Deposito {

    private String nombre_deposito;
    private ArrayList<ProductoAlimenticio> productos_ingresados;
    private ArrayList<String> productos_menores15;
    private ArrayList<String> nombre_productos;
    private ArrayList<String> productos_sin_stock;


    public Deposito(String nombre_deposito, ArrayList<ProductoAlimenticio> productos_ingresados, ArrayList<String> productos_menores15, ArrayList<String> nombre_productos, ArrayList<String> productos_sin_stock) {
        this.nombre_deposito = nombre_deposito;
        this.productos_ingresados = productos_ingresados;
        this.productos_menores15 = productos_menores15;
        this.nombre_productos = nombre_productos;
        this.productos_sin_stock = productos_sin_stock;
    }

    public String getNombre_deposito() {
        return nombre_deposito;
    }

    public void setNombre_deposito(String nombre_deposito) {
        this.nombre_deposito = nombre_deposito;
    }

    public ArrayList<ProductoAlimenticio> getProductos_ingresados() {
        return productos_ingresados;
    }

    public void setProductos_ingresados(ArrayList<ProductoAlimenticio> productos_ingresados) {
        this.productos_ingresados = productos_ingresados;
    }

    public ArrayList<String> getProductos_menores15() {
        return productos_menores15;
    }

    public void setProductos_menores15(ArrayList<String> productos_menores15) {
        this.productos_menores15 = productos_menores15;
    }

    public ArrayList<String> getNombre_productos() {
        return nombre_productos;
    }

    public void setNombre_productos(ArrayList<String> nombre_productos) {
        this.nombre_productos = nombre_productos;
    }

    public ArrayList<String> getProductos_sin_stock() {
        return productos_sin_stock;
    }

    public void setProductos_sin_stock(ArrayList<String> productos_sin_stock) {
        this.productos_sin_stock = productos_sin_stock;
    }

    public int getStockProducto(String nombre_producto){
        int stock = 0;

            for (ProductoAlimenticio i : this.getProductos_ingresados()
                 ) {
                if (nombre_producto.equals(i.getNombre())){
                    stock++;
                }
            }
           return stock;
        }
    public void ingresarProductosMenores15(){
        for (String i : this.getNombre_productos()
        ) {
            if (this.getStockProducto(i) < 15){
                this.getProductos_menores15().add(i);
            }
        }

    }
    public void ingresarProductosSinStock(){

        for (String i : this.getNombre_productos()
             ) {
            int apariciones = 0;
            for (ProductoAlimenticio j : this.getProductos_ingresados()
            ) {
                if (i.equals(j.getNombre())){ apariciones++; }
            }
            if (apariciones==0){this.getProductos_sin_stock().add(i); }
        }

    }


    public float getStockMonetario(){
        float stock_monetario = 0;
        float precio_total_ptoducto = 0;
        for (ProductoAlimenticio i : this.getProductos_ingresados()
             ) {
            precio_total_ptoducto = getStockProducto(i.getNombre()) * i.getPrecio();
            stock_monetario = stock_monetario + precio_total_ptoducto;
        }

        return stock_monetario;
    }



    public void mostrarArrayStrings(ArrayList<String> array_mostrar){
        for (String i : array_mostrar
             ) {
            System.out.println(i);
        }
    }

}




