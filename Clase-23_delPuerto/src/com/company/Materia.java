package com.company;
import java.util.HashMap;
import java.util.Map;

public class Materia {
    private String nombre_materia;
    private HashMap<Alumno, Float> lista_notas;


    public Materia(String nombre_materia, HashMap<Alumno, Float> lista_notas) {
        this.nombre_materia = nombre_materia;
        this.lista_notas = lista_notas;
    }

    public void agregarNota(Alumno a, Float nota_agregar){
        this.lista_notas.put(a,nota_agregar);

    }

    public float menorNota(){
        float menor_nota = 10.0f;
        for (Map.Entry<Alumno,Float> i : this.lista_notas.entrySet()
             ) {

                if (i.getValue()<menor_nota){
                    menor_nota = i.getValue();
                }
            }
            return menor_nota;
        }

    public float MayorNota(){
        float mayor_nota = 1.0f;
        for (Map.Entry<Alumno,Float> i : this.lista_notas.entrySet()
        ) {

            if (i.getValue()>mayor_nota){
                mayor_nota = i.getValue();
            }
        }
        return mayor_nota;
    }


    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public HashMap<Alumno, Float> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(HashMap<Alumno, Float> lista_notas) {
        this.lista_notas = lista_notas;
    }
}
