package com.company;
import java.util.HashSet;

public class Veterinaria {
    private HashSet<Mascota> mascotas_ingresadas;

    public HashSet<Mascota> getMascotas_ingresadas() {
        return mascotas_ingresadas;
    }

    public void setMascotas_ingresadas(HashSet<Mascota> mascotas_ingresadas) {
        this.mascotas_ingresadas = mascotas_ingresadas;
    }

    public String getAnimalMejorAsistencia() {

        int asistencias_perros=0;
        int asistencias_gatos=0;
        int asistencias_tortugas=0;
        for (Mascota i : this.getMascotas_ingresadas()
             ) {
                if (i.getTipoMascota().equals("Perro") && i.cumpleVisitas()){
                    asistencias_perros=asistencias_perros+1;
                }
                if (i.getTipoMascota().equals("Gato") && i.cumpleVisitas()){
                    asistencias_gatos=asistencias_gatos+1;
                }
                if (i.getTipoMascota().equals("Tortuga") && i.cumpleVisitas()){
                asistencias_tortugas=asistencias_tortugas+1;
                }
        }
        int mayor_asistencias = getMayorDeTres(asistencias_gatos,asistencias_perros,asistencias_tortugas);
        if (mayor_asistencias==asistencias_gatos){
            return "Gato";
        }else if (mayor_asistencias==asistencias_perros){
            return "Perro";
        }else{
            return "Tortuga";
        }

    }

    public int getMayorDeTres(int num1, int num2, int num3){
        if (num2<=num1 && num3<=num1){
            return num1;
        }
        if (num1<=num2 && num3<=num2){
            return num2;
        }else{
            return num3;
        }
    }

    public HashSet<String> razasPerrosNoCumplenAsistencia(){
        HashSet razas_perros = new HashSet<String>();
        for (Mascota i : this.getMascotas_ingresadas()
             ) {
                if (i.getClass()==Perro.class && !i.cumpleVisitas()){

                        razas_perros.add(((Perro) i).getRaza_perro());
                }
        }
        return razas_perros;
    }

    public static void main(String[] args) {



    }
}
