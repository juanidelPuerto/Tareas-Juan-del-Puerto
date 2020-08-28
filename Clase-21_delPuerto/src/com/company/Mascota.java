package com.company;

public class Mascota {
    private String nombre;
    private Dueño dueño;
    private String tipo_mascota;


    public Mascota(String nombre, Dueño dueño, String tipo_mascota) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.tipo_mascota = tipo_mascota;
    }


    public void saludar(String nombre_duenio){
        System.out.println("-----");
    }

    public void alimentar(){

    }

    public String getTipoMascota() {
        return tipo_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }



    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }
}
