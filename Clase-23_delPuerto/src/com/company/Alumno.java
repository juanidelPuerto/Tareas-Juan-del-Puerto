package com.company;
import java.util.HashMap;
import java.util.Map;

public class Alumno extends Persona{
    private HashMap<Materia,Float> materias_promedio;

    Alumno(String nombrex,HashMap<Materia,Float> materias_promediox){
        super(nombrex);
        this.materias_promedio=materias_promediox;
    }

    public float promedioFinal(){
        Float promedio_final = 0.0f;
        Float sumatoria_promedios = 0.0f;
        for (Map.Entry<Materia,Float> i : this.getMaterias_promedio().entrySet()
             ) {
            sumatoria_promedios=sumatoria_promedios+i.getValue();
        }
        promedio_final = sumatoria_promedios/this.getMaterias_promedio().size();
        return promedio_final;
    }

    public void agregarMateria(Materia materia_agregar,Float promedio){
        this.getMaterias_promedio().put(materia_agregar,promedio);
    }

    public float promedioSegunMateria(Materia materia_consultar){
        for (Map.Entry<Materia,Float>i : this.getMaterias_promedio().entrySet()
             ) {
            if (i.getKey().equals(materia_consultar)){
                return i.getValue();
            }
        }
        return 0.0f;
    }

    public float menorPromedio(){
        float menor_promedio = 10.0f;
        for (Map.Entry<Materia,Float> i : this.getMaterias_promedio().entrySet()
             ) {
            if (i.getValue()<menor_promedio){
                menor_promedio = i.getValue();
            }
        }
        return menor_promedio;
    }

    public float mayorPromedio(){
        float mayor_promedio = 0.0f;
        for (Map.Entry<Materia,Float> i : this.getMaterias_promedio().entrySet()
        ) {
            if (i.getValue()>mayor_promedio){
                mayor_promedio = i.getValue();
            }
        }
        return mayor_promedio;
    }
    public float calcularPromedio(Materia materia){
        float promedio = 0.0f;
        float sumatoria_notas = 0.0f;
        int cant_notas = 0;
        for (Map.Entry<Alumno,Float> i : materia.getLista_notas().entrySet()
             ) {
            if (i.getKey().equals(this)){
                sumatoria_notas=sumatoria_notas+i.getValue();
                cant_notas=cant_notas+1;
            }
        }
        promedio=sumatoria_notas/cant_notas;
        return promedio;
    }

    public void promedio(){
        for (Map.Entry<Materia,Float> i : this.getMaterias_promedio().entrySet()
             ) {
            float promedio_materia = calcularPromedio(i.getKey());
            this.getMaterias_promedio().replace(i.getKey(),promedio_materia);
        }
    }

    public HashMap<Materia, Float> getMaterias_promedio() {
        return materias_promedio;
    }


    public void setMaterias_promedio(HashMap<Materia, Float> materias_promedio) {
        this.materias_promedio = materias_promedio;
    }
}
