package com.company;

import java.util.ArrayList;

public class Programa {
    private ArrayList<Rutina> rutinas;

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(ArrayList<Rutina> rutinas) {

        this.rutinas = rutinas;
    }

    public Programa() {
        this.rutinas=new ArrayList<Rutina>();
    }

    public Rutina getRutinabyname(String nombre_rutinax){
        for ( Rutina rutina_i : rutinas) {
            if (nombre_rutinax.equals(rutina_i.getNombre_rutina())){
                return rutina_i;
            }
        }
        Rutina r = new Rutina(nombre_rutinax,new ArrayList<Instruccion>());
        rutinas.add(r);
        return r;
    }
    public void agregarInstruccion(String nombre_rutinax, Instruccion instruccionx){
        for ( Rutina i: rutinas) {
            if (nombre_rutinax.equals(i.getNombre_rutina())){
                getRutinabyname(nombre_rutinax).getInstrucciones().add(instruccionx);
                }
            }
        Rutina r = new Rutina(nombre_rutinax,new ArrayList<Instruccion>());
        r.getInstrucciones().add(instruccionx);
        rutinas.add(r);

        }

    }

