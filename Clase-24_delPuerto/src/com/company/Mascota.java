package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Mascota {
    private String nombre;
    private Dueño dueño;
    private String tipo_mascota;
    private Fecha fecha_nacimiento;
    private ArrayList<Fecha> fechas_control;

    public Mascota(String nombre, Dueño dueño, String tipo_mascota, Fecha fecha_nacimiento, ArrayList<Fecha> fechas_control) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.tipo_mascota = tipo_mascota;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fechas_control = fechas_control;
    }
    public boolean cumpleVisitas(){
        boolean cumple =  false;
        return cumple;
    }

    public boolean cumpleVisitasDesdeNacimineto(){
        boolean cumple = false;
        return cumple;
    }
    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ArrayList<Fecha> getFechas_control() {
        return fechas_control;
    }

    public void setFechas_control(ArrayList<Fecha> fechas_control) {
        this.fechas_control = fechas_control;
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