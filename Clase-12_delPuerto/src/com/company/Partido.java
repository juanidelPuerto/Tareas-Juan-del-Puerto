package com.company;
import java.util.HashSet;

public class Partido {
        String fecha;
        private HashSet <Jugador> jugadores_citados;
        boolean ganado;

    public Partido(String fecha, HashSet<Jugador> jugadores_citados, boolean ganado) {
        this.fecha = fecha;
        this.jugadores_citados = jugadores_citados;
        this.ganado = ganado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public HashSet<Jugador> getJugadores_citados() {
        return jugadores_citados;
    }

    public void setJugadores_citados(HashSet<Jugador> jugadores_citados) {
        this.jugadores_citados = jugadores_citados;
    }

    public boolean isGanado() {
        return ganado;
    }

    public void setGanado(boolean ganado) {
        this.ganado = ganado;
    }
}
