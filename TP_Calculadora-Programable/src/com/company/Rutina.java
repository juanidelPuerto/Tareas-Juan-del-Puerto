package com.company;

import java.util.ArrayList;

public class Rutina {
    private String nombre_rutina;
    private ArrayList<Instruccion> instrucciones;



    public String getNombre_rutina() {
        return nombre_rutina;
    }

    public Rutina(String nombre_rutina, ArrayList<Instruccion> instrucciones) {
        this.nombre_rutina = nombre_rutina;
        this.instrucciones = instrucciones;
    }

    public ArrayList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public void setNombre_rutina(String nombre_rutina) {
        this.nombre_rutina = nombre_rutina;
    }

    public void setInstrucciones(ArrayList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
