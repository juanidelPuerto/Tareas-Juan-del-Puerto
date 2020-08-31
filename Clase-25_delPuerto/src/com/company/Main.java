package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(500,500);
        ventana.setVisible(true);

        JLabel texto = new JLabel();
        texto.setText(" RIVER");
        texto.setSize(800,100);
        texto.setLocation(10,20);
        texto.setVisible(true);

        JButton boton = new JButton("Triplicar texto");
        boton.setSize(200,100);
        boton.setLocation(140,200);
        boton.setVisible(true);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String texto_final = texto.getText();
                texto_final = texto_final + texto_final + texto_final;
                texto.setText(texto_final);
            }
        });

        ventana.add(texto);
        ventana.add(boton);
    }
}
