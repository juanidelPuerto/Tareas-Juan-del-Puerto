package com.company;
import java.util.ArrayList;
import  java.util.Scanner;

public class ProgramaDos {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el valor de n");
        int n = ingreso.nextInt();
        ArrayList<Integer> numeros_pares= new ArrayList<>();
        int j = 0;

        for (int i = 0; i < n;){
            if (j != 0 && j%2 == 0){
                numeros_pares.add(j);
                i++;
            }
            j++;
        }

        for (int i = 0; i < numeros_pares.size(); i++){
            System.out.println(numeros_pares.get(i));
        }
    }


}
