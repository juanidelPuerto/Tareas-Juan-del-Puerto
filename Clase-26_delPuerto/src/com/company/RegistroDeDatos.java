package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.MouseEvent;


public class RegistroDeDatos {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<Persona>();
        JFrame ventana = new JFrame();
        ventana.setSize(555,200);
        ventana.setLayout(null);
        ventana.setVisible(true);

        JButton boton_registrar = new JButton("Registrar");
        boton_registrar.setSize(500,33);
        boton_registrar.setLocation(25,85);


        JLabel texto = new JLabel();
        texto.setSize(500,40);
        texto.setLocation(225,25);

        ventana.add(boton_registrar);
        ventana.add(texto);
        System.out.println("Ingrese su nombre, Por favor.");
        String nombre_ingresado = ingreso.nextLine();
        System.out.println("El nombre que ingresó es: " + nombre_ingresado);

        System.out.println("Ingrese su apellido, Por favor.");
        String apellido_ingresado = ingreso.next();
        System.out.println("El apellido que ingresó es:" + apellido_ingresado);

        System.out.println("Ingrese su edad, Por favor.");
        String edad_ingresada = ingreso.next();
        int edad_insertar = Integer.parseInt(edad_ingresada);
        System.out.println("La edad que ingresó es: " + edad_insertar);

        System.out.println("Ingrese su ocupacion, Por favor.");
        String ocupacion_ingresada = ingreso.next();
        System.out.println("La ocupacion que ingresó es: " + ocupacion_ingresada);

        System.out.println("Presione el boton Registrar en la ventana, si desea registrar sus datos");

        boton_registrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Persona persona_ingresar = new Persona(nombre_ingresado,apellido_ingresado,edad_insertar,ocupacion_ingresada);
                personas.add(persona_ingresar);
                texto.setText("Registro Exitoso");
            }
        });
    }
}
