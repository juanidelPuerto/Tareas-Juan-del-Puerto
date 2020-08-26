package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Libreria {
    private String nombre;
    private HashSet<Editorial> editoriales;
    private HashMap<Editorial,Integer> ventas_editorial;

    public Libreria(String nombre, HashSet<Editorial> editoriales, HashMap<Editorial, Integer> ventas_editorial) {
        this.nombre = nombre;
        this.editoriales = editoriales;
        this.ventas_editorial = ventas_editorial;
    }

    public HashMap<Editorial, Integer> getVentas_editorial() {
        return ventas_editorial;
    }

    public void setVentas_editorial(HashMap<Editorial, Integer> ventas_editorial) {
        this.ventas_editorial = ventas_editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(HashSet<Editorial> editoriales) {
        this.editoriales = editoriales;
    }

    public void calcularVentasEditorial(){
        for (Editorial i : this.getEditoriales()) {
            int libros_vendidos = 0;
             libros_vendidos = i.getLibros_vendidos().size();
             this.getVentas_editorial().put(i,libros_vendidos);
        }
    }

    public Editorial getEditorialMasVentas(){
        Integer mas_ventas = 0;
        Editorial editorial_retornar = new Editorial("",new HashSet<>());
        for (Map.Entry<Editorial,Integer> i : this.getVentas_editorial().entrySet()) {
            if (mas_ventas < i.getValue()){
                mas_ventas = i.getValue();
                editorial_retornar = i.getKey();
            }
        }
        return editorial_retornar;
    }
    public void mostrarVentasXEditorial(){
        String salida="";
        for (Map.Entry <Editorial,Integer> i : this.getVentas_editorial().entrySet()
             ) {
            salida=salida+ "  |Editorial: " + i.getKey().getNombre_editorial() + " Ventas: " + i.getValue();
            System.out.println(salida);
        }
    }
    public static void main(String[] args) {
	            Libreria libreria = new Libreria("Libreria Fahrenheit 451",new HashSet<>(),new HashMap<>());
	            Editorial editorial1 = new Editorial("Kapelusz",new HashSet<>());
                Editorial editorial2 = new Editorial("Sudamericana",new HashSet<>());
                Editorial editorial3 = new Editorial("Atlántida",new HashSet<>());
                Editorial editorial4 = new Editorial("ElAteneo",new HashSet<>());
                Editorial editorial5 = new Editorial("Interzona",new HashSet<>());
                Editorial editorial6 = new Editorial("Sur",new HashSet<>());
                Editorial editorial7 = new Editorial("Alianza",new HashSet<>());

                libreria.getEditoriales().add(editorial1);
                libreria.getEditoriales().add(editorial2);
                libreria.getEditoriales().add(editorial3);
                libreria.getEditoriales().add(editorial4);
                libreria.getEditoriales().add(editorial5);
                libreria.getEditoriales().add(editorial6);
                libreria.getEditoriales().add(editorial7);

                Libro libro1 = new Libro("Fahrenheit 451",45,editorial4);
                Libro libro2 = new Libro("La Ciudad",34,editorial4);
                Libro libro3 = new Libro("La Mansion",110,editorial4);
                Libro libro4 = new Libro("El Padrino",150,editorial4);
                Libro libro5 = new Libro("1984",210,editorial4);
                Libro libro6 = new Libro("La Peste",55,editorial2);
                Libro libro7 = new Libro("Harry Potter",500,editorial2);
                Libro libro8 = new Libro("El Eternauta",210,editorial2);
                Libro libro9 = new Libro("El virus",300,editorial2);
                Libro libro10 = new Libro("Percy Jackson",210,editorial1);
                Libro libro11 = new Libro("Los juegos del hambre",321,editorial1);
                Libro libro12 = new Libro("Los Miserables",500,editorial1);
                Libro libro13 = new Libro("Ford vs Ferrari",185,editorial3);
                Libro libro14 = new Libro("Rayuela",150,editorial3);
                Libro libro15 = new Libro("Tartufo",225,editorial6);

                editorial4.getLibros_vendidos().add(libro1);
                editorial4.getLibros_vendidos().add(libro2);
                editorial4.getLibros_vendidos().add(libro3);
                editorial4.getLibros_vendidos().add(libro4);
                editorial4.getLibros_vendidos().add(libro5);
                editorial2.getLibros_vendidos().add(libro6);
                editorial2.getLibros_vendidos().add(libro7);
                editorial2.getLibros_vendidos().add(libro8);
                editorial2.getLibros_vendidos().add(libro9);
                editorial1.getLibros_vendidos().add(libro10);
                editorial1.getLibros_vendidos().add(libro11);
                editorial1.getLibros_vendidos().add(libro12);
                editorial3.getLibros_vendidos().add(libro13);
                editorial3.getLibros_vendidos().add(libro14);
                editorial6.getLibros_vendidos().add(libro15);


                System.out.println("Informe de ventas de " + libreria.getNombre());
                libreria.calcularVentasEditorial();
                System.out.println("Las ventas de cada editorial son: ");
                libreria.mostrarVentasXEditorial();
                Editorial editorial_mas_ventas = libreria.getEditorialMasVentas();
                System.out.println("La editorial con mas ventas es: " + editorial_mas_ventas.getNombre_editorial());

    }
}
