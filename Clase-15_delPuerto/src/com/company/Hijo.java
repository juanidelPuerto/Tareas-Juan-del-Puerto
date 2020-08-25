package com.company;

public class Hijo extends Persona{

        private  String escuela;
        private String juego_favorito;


    public Hijo(){
        super();
        escuela="Instituto Moruli";
        juego_favorito="Ajedrez";
    }

    public Hijo(String nombre, int edad, int dni, int telefono, String direccion, String escuela, String juego_favorito) {
        super(nombre, edad, dni, telefono, direccion);
        this.escuela = escuela;
        this.juego_favorito = juego_favorito;
    }

    public Hijo(String escuela, String juego_favorito) {
        this.escuela = escuela;
        this.juego_favorito = juego_favorito;
    }

    public Hijo(String nombre, String escuela, String juego_favorito) {
        super(nombre);
        this.escuela = escuela;
        this.juego_favorito = juego_favorito;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getJuego_favorito() {
        return juego_favorito;
    }

    public void setJuego_favorito(String juego_favorito) {
        this.juego_favorito = juego_favorito;
    }
}
