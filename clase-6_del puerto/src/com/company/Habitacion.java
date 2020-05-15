package com.company;


public class Habitacion {
    private int num_Habitacion;
    private int capacidad_Habitacion;
    private int precio_Habitacion;
    private boolean estado_Habitacion;



    public int getNum_Habitacion() {
        return num_Habitacion;
    }


    public int getCapacidad_Habitacion(){return capacidad_Habitacion;}

    public int getPrecio_Habitacion(){return precio_Habitacion;}

    public boolean getestado_Habitacion(){return estado_Habitacion;}


    public void setNum_Habitacion(int num_Habitacion) {
        this.num_Habitacion = num_Habitacion;
    }

    public void setEstado_Habitacion(boolean estado_Habitacion) {
        this.estado_Habitacion = estado_Habitacion;
    }

    public void setPrecio_Habitacion(int precio_Habitacion) {
        this.precio_Habitacion = precio_Habitacion;
    }

    public void setCapacidad_Habitacion(int capacidad_Habitacion) {
        this.capacidad_Habitacion = capacidad_Habitacion;
    }

}


