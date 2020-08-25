package com.company;

import java.util.HashSet;

public class Equipo {
    private String nombre_equipo;
    private HashSet<Jugador> jugadores;
    private String nombre_dt;
    private String apellido_dt;


    public Equipo(String nombre_equipo, HashSet<Jugador> jugadores, String nombre_dt, String apellido_dt) {
        this.nombre_equipo = nombre_equipo;
        this.jugadores = jugadores;
        this.nombre_dt = nombre_dt;
        this.apellido_dt = apellido_dt;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre_dt() {
        return nombre_dt;
    }

    public void setNombre_dt(String nombre_dt) {
        this.nombre_dt = nombre_dt;
    }

    public String getApellido_dt() {
        return apellido_dt;
    }

    public void setApellido_dt(String apellido_dt) {
        this.apellido_dt = apellido_dt;
    }
}
