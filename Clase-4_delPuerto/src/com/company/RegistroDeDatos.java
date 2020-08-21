package com.company;

import java.util.Scanner;

public class RegistroDeDatos {
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su nombre, Por favor.");
        String nombre_ingresado = ingreso.nextLine();
        System.out.println("El nombre que ingresó es: " + nombre_ingresado);

        System.out.println("Ingrese su apellido, Por favor.");
        String apellido_ingresado = ingreso.next();
        System.out.println("El apellido que ingresó es:" + apellido_ingresado);

        System.out.println("Ingrese su edad, Por favor.");
        int edad_ingresada = ingreso.nextInt();
        System.out.println("La edad que ingresó es: " + edad_ingresada);

        System.out.println("Ingrese su ocupacion, Por favor.");
        String ocupacion_ingresada = ingreso.next();
        System.out.println("La ocupacion que ingresó es: " + ocupacion_ingresada);

    }

}
