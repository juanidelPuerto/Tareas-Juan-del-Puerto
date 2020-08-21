package com.company;

public class Main {

    public static void main(String[] args) {

        ProductoAlimenticio producto1= new ProductoAlimenticio("Chocolate Arcor",50,"09/12/2019","09/12/2020",0.200f);
        ProductoAlimenticio producto2 = new ProductoAlimenticio("Pollo",350,"15/05/2020","18/07/2020",6.000f);
        ProductoAlimenticio producto3 = new ProductoAlimenticio("Papas fritas Lays",75,"15/05/2020","17/08/2020",0.500f);


        OrdenDeCompra orden1 = new OrdenDeCompra("15/08/2020",1630,200,"Pablo",2,"efectivo");
        OrdenDeCompra orden2 = new OrdenDeCompra("15/08/2020",1745,8000,"Juan",256,"efectivo");
        OrdenDeCompra orden3 = new OrdenDeCompra("15/08/2020",1800,7500,"Ramon",255,"tarjeta  de credito");


        boolean vencido1 = producto1.productoVencido("17/08/2020");
        System.out.println(vencido1);
        boolean vencido2 = producto2.productoVencido("17/08/2020");
        System.out.println(vencido2);
        boolean vencido3 = producto3.productoVencido("17/08/2020");
        System.out.println(vencido3);

        System.out.println("-------------");

        boolean peso1 = producto1.pesoMayora5kg();
        System.out.println(peso1);
        boolean peso2 = producto2.pesoMayora5kg();
        System.out.println(peso2);
        boolean peso3 = producto3.pesoMayora5kg();
        System.out.println(peso3);

        System.out.println("-------------");

        boolean menor255_1 = orden1.cantMenor255();
        System.out.println(menor255_1);
        boolean menor255_2 = orden2.cantMenor255();
        System.out.println(menor255_2);
        boolean menor255_3 = orden3.cantMenor255();
        System.out.println(menor255_3);

        System.out.println("-------------");

        boolean efectivo1 = orden1.pago_efectivo();
        System.out.println(efectivo1);
        boolean efectivo2 = orden2.pago_efectivo();
        System.out.println(efectivo2);
        boolean efectivo3 = orden3.pago_efectivo();
        System.out.println(efectivo3);


    }
}
