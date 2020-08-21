package com.company;
import java.util.Scanner;

public class ProgramaUno {
    public static void main(String[] args) {
       Scanner ingreso = new Scanner(System.in);


       System.out.println("Ingrese el primer número");
       int num1= ingreso.nextInt();

       System.out.println("Ingrese el segundo número");
       int num2 = ingreso.nextInt();

       if (num1==num2){
           System.out.println("Los números ingresados son iguales");

       }else if (num1>num2){
           System.out.println("El número " + num1 +" es mayor a "+ num2);

       }else{
           System.out.println("El número " + num2 +" es mayor a "+ num1);
       }


    }
}
