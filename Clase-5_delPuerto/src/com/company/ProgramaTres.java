package com.company;
import java.util.Scanner;
public class ProgramaTres {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        int cant_numeros = 0;
        int sumatoria = 0;
        int num_ingresado = 0;
        boolean seguir_preguntando = true;
        while (seguir_preguntando){
            System.out.println("Ingrese un numero");
            num_ingresado=ingreso.nextInt();

            if (num_ingresado == (-1)){
                seguir_preguntando=false;
            }else{
                sumatoria = sumatoria + num_ingresado;
                cant_numeros++;
            }
        }

        System.out.println("La sumatoria de los numeros ingresados es: "+ sumatoria);
        System.out.println("La cantidad de numeros ingresados es: "+ cant_numeros);
    }


}
