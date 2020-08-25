package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class AppParaDeposito {

    public static void main(String[] args) {

       Deposito deposito1 = new Deposito("Deposito de alimentos Coghlan", new ArrayList<>() , new ArrayList<>(), new ArrayList<>(),new ArrayList<>());
        Scanner ingreso_opcion = new Scanner(System.in);
        Scanner ingreso_nombre = new Scanner(System.in);
        boolean preguntar=true;

        String nombreProducto1 = "Arroz";
        String nombreProducto2 = "Gaseosa";
        String nombreProducto3 = "Fideos";

        ProductoAlimenticio producto1 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto2 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto3 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto4 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto5 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto6= new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto7= new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto8 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto9 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto10 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto11 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto12 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto13= new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto14 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto15 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);
        ProductoAlimenticio producto16 = new ProductoAlimenticio("Arroz",60,"12/12/2019","05/05/2020",1.0f);

        ProductoAlimenticio producto17 = new ProductoAlimenticio("Fideos",75,"9/12/2019","04/04/2020",1.0f);
        ProductoAlimenticio producto18 = new ProductoAlimenticio("Fideos",75,"9/12/2019","04/04/2020",1.0f);
        ProductoAlimenticio producto19 = new ProductoAlimenticio("Fideos",75,"9/12/2019","04/04/2020",1.0f);
        ProductoAlimenticio producto20 = new ProductoAlimenticio("Fideos",75,"9/12/2019","04/04/2020",1.0f);
        ProductoAlimenticio producto21 = new ProductoAlimenticio("Fideos",75,"9/12/2019","04/04/2020",1.0f);


        deposito1.getProductos_ingresados().add(producto1);
        deposito1.getProductos_ingresados().add(producto2);
        deposito1.getProductos_ingresados().add(producto3);
        deposito1.getProductos_ingresados().add(producto4);
        deposito1.getProductos_ingresados().add(producto5);
        deposito1.getProductos_ingresados().add(producto6);
        deposito1.getProductos_ingresados().add(producto7);
        deposito1.getProductos_ingresados().add(producto8);
        deposito1.getProductos_ingresados().add(producto9);
        deposito1.getProductos_ingresados().add(producto10);
        deposito1.getProductos_ingresados().add(producto11);
        deposito1.getProductos_ingresados().add(producto12);
        deposito1.getProductos_ingresados().add(producto13);
        deposito1.getProductos_ingresados().add(producto14);
        deposito1.getProductos_ingresados().add(producto15);
        deposito1.getProductos_ingresados().add(producto16);
        deposito1.getProductos_ingresados().add(producto17);
        deposito1.getProductos_ingresados().add(producto18);
        deposito1.getProductos_ingresados().add(producto19);
        deposito1.getProductos_ingresados().add(producto20);
        deposito1.getProductos_ingresados().add(producto21);

        deposito1.getNombre_productos().add(nombreProducto1);
        deposito1.getNombre_productos().add(nombreProducto2);
        deposito1.getNombre_productos().add(nombreProducto3);

        while(preguntar){
                System.out.println("Bienvenido a la app de consulta del deposito");
                System.out.println("-----------------");
                System.out.println("¿Que desea realizar?");
                System.out.println("1- Consultar el valor monetario equivalente al stock en el deposito.");
                System.out.println("2- Consultar los productos sin stock.");
                System.out.println("3- Consultar el stock de algun producto.");
                System.out.println("4- Consultar los productos con unidades menores a 15.");
                System.out.println("5- Salir.");
                System.out.println("-----------------");
                System.out.println("Ingrese el numero para elegir la opción.");
                int opcion_elegida = ingreso_opcion.nextInt();

                switch (opcion_elegida){
                    case 1:
                        float stock_monetario = deposito1.getStockMonetario();
                        System.out.println("El stock monetario es: $" + stock_monetario);
                        break;

                    case 2:
                        System.out.println("Los productos sin stock son:");
                        deposito1.ingresarProductosSinStock();
                        deposito1.mostrarArrayStrings(deposito1.getProductos_sin_stock());
                        break;

                    case 3:
                        System.out.println("Ingrese el nombre del producto a consultar");
                        String nombre_consultar = ingreso_nombre.nextLine();
                        int stock = deposito1.getStockProducto(nombre_consultar);
                        System.out.println("El stock es : " + stock);
                        break;

                    case 4:
                        System.out.println("Los productos con unidades menores a 15 son:");
                        deposito1.ingresarProductosMenores15();
                        deposito1.mostrarArrayStrings(deposito1.getProductos_menores15());
                        break;

                    case 5:
                        System.out.println("Gracias por utilizar la app. Hasta luego!");
                        preguntar=false;
                        break;

                }

        }

    }

}
