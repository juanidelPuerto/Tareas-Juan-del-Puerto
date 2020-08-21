package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroDeCompras {
    public static void main(String[] args) {

            Scanner ingreso = new Scanner(System.in);
            ArrayList<Producto> Productos_comprar = new ArrayList<>();
            boolean preguntar = true;

        while (preguntar){
        System.out.println("Desea ingresar un producto? y/n");
        String respuesta = "";
        respuesta = ingreso.next();

            if (respuesta.equals("y")) {

                System.out.println("Ingrese el precio del Producto");
                int precio_ingresado = 0;
                precio_ingresado = ingreso.nextInt();

                System.out.println("Ingrese el nombre del Producto");
                String nombre_ingresado = "";
                nombre_ingresado = ingreso.next();

                System.out.println("Ingrese la marca del producto");
                String marca_ingresada = "";
                marca_ingresada = ingreso.next();

                System.out.println("Ingrese las unidades que desee llevar");
                int unidades_ingresadas = 0;
                unidades_ingresadas = ingreso.nextInt();

                Producto producto_ingresar = new Producto(precio_ingresado,nombre_ingresado,marca_ingresada,unidades_ingresadas);
                Productos_comprar.add(producto_ingresar);

                System.out.println("El producto se ha ingresado correctamente");

            }else{
                preguntar = false;
                float importe_total = 0;

                for(int i = 0 ;i < Productos_comprar.size(); i++){
                    int cantidad = 1;
                    float precio_final_producto = 0;
                    cantidad=Productos_comprar.get(i).getUnidades();
                    precio_final_producto=cantidad*Productos_comprar.get(i).getPrecio();
                    importe_total=importe_total+precio_final_producto;
                }

                System.out.println("El importe total es: $" + importe_total);


            }

        }
    }
}
