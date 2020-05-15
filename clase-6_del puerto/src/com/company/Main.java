package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion();
        Habitacion habitacion2 = new Habitacion();
        Habitacion habitacion3 = new Habitacion();
        Habitacion habitacion4 = new Habitacion();
        Habitacion habitacion5 = new Habitacion();
        Habitacion habitacion6 = new Habitacion();
        Habitacion habitacion7 = new Habitacion();
        Habitacion habitacion8 = new Habitacion();
        Habitacion habitacion9 = new Habitacion();
        Habitacion habitacion10 = new Habitacion();
        Habitacion habitacion11 = new Habitacion();
        Habitacion habitacion12 = new Habitacion();
        Habitacion habitacion13 = new Habitacion();


        habitacion1.setNum_Habitacion(1);
        habitacion1.setCapaciad_Habitacion(1);
        habitacion1.setPrecio_Habitacion(545);
        habitacion1.setEstado_Habitacion(false);

        habitacion2.setNum_Habitacion(2);
        habitacion2.setCapaciad_Habitacion(1);
        habitacion2.setPrecio_Habitacion(545);
        habitacion2.setEstado_Habitacion(false);

        habitacion3.setNum_Habitacion(3);
        habitacion3.setCapaciad_Habitacion(1);
        habitacion3.setPrecio_Habitacion(545);
        habitacion3.setEstado_Habitacion(false);

        habitacion4.setNum_Habitacion(4);
        habitacion4.setCapaciad_Habitacion(1);
        habitacion4.setPrecio_Habitacion(545);
        habitacion4.setEstado_Habitacion(false);

        habitacion5.setNum_Habitacion(5);
        habitacion5.setCapaciad_Habitacion(1);
        habitacion5.setPrecio_Habitacion(545);
        habitacion5.setEstado_Habitacion(false);

        habitacion6.setNum_Habitacion(6);
        habitacion6.setCapaciad_Habitacion(1);
        habitacion6.setPrecio_Habitacion(545);
        habitacion6.setEstado_Habitacion(false);

        habitacion7.setNum_Habitacion(7);
        habitacion7.setCapaciad_Habitacion(1);
        habitacion7.setPrecio_Habitacion(545);
        habitacion7.setEstado_Habitacion(false);

        habitacion8.setNum_Habitacion(8);
        habitacion8.setCapaciad_Habitacion(1);
        habitacion8.setPrecio_Habitacion(545);
        habitacion8.setEstado_Habitacion(false);

        habitacion9.setNum_Habitacion(9);
        habitacion9.setCapaciad_Habitacion(2);
        habitacion9.setPrecio_Habitacion(785);
        habitacion9.setEstado_Habitacion(false);

        habitacion10.setNum_Habitacion(10);
        habitacion10.setCapaciad_Habitacion(2);
        habitacion10.setPrecio_Habitacion(785);
        habitacion10.setEstado_Habitacion(false);

        habitacion11.setNum_Habitacion(11);
        habitacion11.setCapaciad_Habitacion(2);
        habitacion11.setPrecio_Habitacion(785);
        habitacion11.setEstado_Habitacion(false);

        habitacion12.setNum_Habitacion(12);
        habitacion12.setCapaciad_Habitacion(2);
        habitacion12.setPrecio_Habitacion(785);
        habitacion12.setEstado_Habitacion(false);

        habitacion13.setNum_Habitacion(13);
        habitacion13.setCapaciad_Habitacion(2);
        habitacion13.setPrecio_Habitacion(785);
        habitacion13.setEstado_Habitacion(false);

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(habitacion1);
        habitaciones.add(habitacion2);
        habitaciones.add(habitacion3);
        habitaciones.add(habitacion4);
        habitaciones.add(habitacion5);
        habitaciones.add(habitacion6);
        habitaciones.add(habitacion7);
        habitaciones.add(habitacion8);
        habitaciones.add(habitacion9);
        habitaciones.add(habitacion10);
        habitaciones.add(habitacion11);
        habitaciones.add(habitacion12);
        habitaciones.add(habitacion13);



        ArrayList<Huesped> huespedes = new ArrayList<>();

        Huesped huesped1 = new Huesped();
        Huesped huesped2 = new Huesped();
        Huesped huesped3 = new Huesped();
        Huesped huesped4 = new Huesped();
        Huesped huesped5 = new Huesped();
        Huesped huesped6 = new Huesped();


        huesped1.setNombre_Huesped("Pablo");
        huesped1.setApellido_Huesped("Lorenzo");
        huesped1.setEdad_Huesped(80);
        huesped1.setDni_Huesped(10233203);
        huesped1.setentrada(2, 7, 2020);
        huesped1.setentrada(16, 7, 2020);
        huesped1.setHabitacion_Huesped(habitacion1);
        habitacion1.setEstado_Habitacion(true);

        huesped2.setNombre_Huesped("Juan");
        huesped2.setApellido_Huesped("Fangio");
        huesped2.setEdad_Huesped(58);
        huesped2.setDni_Huesped(4237411);
        huesped2.setentrada(10, 6, 2020);
        huesped2.setentrada(23, 6, 2020);
        huesped2.setHabitacion_Huesped(habitacion3);
        habitacion3.setEstado_Habitacion(true);

        huesped3.setNombre_Huesped("Francisco");
        huesped3.setApellido_Huesped("Reyes");
        huesped3.setEdad_Huesped(36);
        huesped3.setDni_Huesped(35162352);
        huesped3.setentrada(14, 11, 2020);
        huesped3.setentrada(26, 11, 2020);
        huesped3.setHabitacion_Huesped(habitacion5);
        habitacion5.setEstado_Habitacion(true);

        huesped4.setNombre_Huesped("Tomas");
        huesped4.setApellido_Huesped("Perez");
        huesped4.setEdad_Huesped(40);
        huesped4.setDni_Huesped(21398190);
        huesped4.setentrada(25, 6, 2020);
        huesped4.setentrada(5, 7, 2020);
        huesped4.setHabitacion_Huesped(habitacion2);
        habitacion2.setEstado_Habitacion(true);

        huesped5.setNombre_Huesped("Fernando");
        huesped5.setApellido_Huesped("Alonso");
        huesped5.setEdad_Huesped(54);
        huesped5.setDni_Huesped(885984);
        huesped5.setentrada(20, 4, 2020);
        huesped5.setentrada(15, 5, 2020);
        huesped5.setHabitacion_Huesped(habitacion4);
        habitacion4.setEstado_Habitacion(true);

        huesped6.setNombre_Huesped("Federico");
        huesped6.setApellido_Huesped("Martinez");
        huesped6.setEdad_Huesped(37);
        huesped6.setDni_Huesped(987654);
        huesped6.setentrada(15, 12, 2020);
        huesped6.setentrada(25, 12, 2020);
        huesped6.setHabitacion_Huesped(habitacion10);
        habitacion10.setEstado_Habitacion(true);

        huespedes.add(huesped1);
        huespedes.add(huesped2);
        huespedes.add(huesped3);
        huespedes.add(huesped4);
        huespedes.add(huesped5);
        huespedes.add(huesped6);
    }

    public ArrayList<Huesped> masFrecuentes(ArrayList<Huesped> huespedes) {
        int i = 0;
        int x = 0;
        int y = 0;
        int cantMasRepetido = 0;
        int cantMasRepetidoR = 0;
        int masRepetido = 0;
        ArrayList<Huesped> huespedesClon = (ArrayList<Huesped>) huespedes.clone();
        ArrayList<Huesped> masFrecuentes = new ArrayList<>();
        while (y < 6) {
            while (x < huespedesClon.size()) {
                while (i < huespedesClon.size()) {
                    if (huespedesClon.get(x).getDni_Huesped() == huespedesClon.get(i).getDni_Huesped()) {
                        cantMasRepetido = cantMasRepetido + 1;
                    }
                    i = i + 1;
                }
                if (cantMasRepetido > cantMasRepetidoR) {
                    masRepetido = x;
                    cantMasRepetidoR = cantMasRepetido;
                }
                x = x + 1;
            }
            masFrecuentes.set(y, huespedesClon.get(masRepetido));
            huespedesClon.remove(masRepetido);
            y = y + 1;
        }
        return masFrecuentes;
    }

    public ArrayList<Huesped> habitacionMasFrecuentes(ArrayList<Huesped> huespedes) {
        int i = 0;
        int x = 0;
        int y = 0;
        int cantMasRepetido = 0;
        int cantMasRepetidoR = 0;
        int masRepetido = 0;
        ArrayList<Huesped> huespedesClon = (ArrayList<Huesped>) huespedes.clone();
        ArrayList<Huesped> masFrecuentes = new ArrayList<>();
        while (y < 3) {
            while (x < huespedesClon.size()) {
                while (i < huespedesClon.size()) {
                    if (huespedesClon.get(x).getHabitacion_Huesped() == huespedesClon.get(i).getHabitacion_Huesped()) {
                        cantMasRepetido = cantMasRepetido + 1;
                    }
                    i = i + 1;
                }
                if (cantMasRepetido > cantMasRepetidoR) {
                    masRepetido = x;
                    cantMasRepetidoR = cantMasRepetido;
                }
                x = x + 1;
            }
            masFrecuentes.set(y, huespedesClon.get(masRepetido));
            huespedesClon.remove(masRepetido);
            y = y + 1;
        }
        return masFrecuentes;
    }

    public double IngresoTotal(ArrayList<Huesped> huespedes){
        int i=0;
        double total=0;
        while(i<huespedes.size()){
            if(huespedes.get(i).cantDias()<30){
                total=total+(huespedes.get(i).getHabitacion_Huesped().getPrecio_Habitacion() * huespedes.get(i).cantDias());
            }else{
                total=total+(huespedes.get(i).getHabitacion_Huesped().getPrecio_Habitacion() * huespedes.get(i).cantDias()* (0.75));
            }
            i=i+1;
        }
        return total;
    }

    public int cantidadEstadiaProlongada(ArrayList<Huesped> huespedes){
        int i=0;
        int cant=0;
        while(i<huespedes.size()){
            if(huespedes.get(i).cantDias()>30){
                cant=cant+1;
            }
            i=i+1;
        }
        return cant;
    }

    public ArrayList<Habitacion> habitacionesOcupadas(ArrayList<Habitacion> habitaciones){
        int i=0;
        int x=0;
        ArrayList<Habitacion> habitacionOcupadas = new ArrayList<>();
        while(i<13){
            if(habitaciones.get(i).getestado_Habitacion()){
                habitacionOcupadas.set(x, habitaciones.get(i));
                x=x+1;
            }
            i=i+1;
        }
        return habitacionOcupadas;
    }

    public ArrayList<Habitacion> habitacionesDisponibles(ArrayList<Habitacion> habitaciones){
        int i=0;
        int x=0;
        ArrayList<Habitacion> habitacionDisponibles = new ArrayList<>();
        while(i<13){
            if(!habitaciones.get(i).getestado_Habitacion()){
                habitacionDisponibles.set(x, habitaciones.get(i));
                x=x+1;
            }
            i=i+1;
        }
        return habitacionDisponibles;
    }

    public Huesped huespedEnDeterminadaHabitacion(int nHabitacion, ArrayList<Huesped> huespedes){
        int i=huespedes.size();
        while(i>=0){
            if(huespedes.get(i).getHabitacion_Huesped().getNum_Habitacion() == nHabitacion){
                return huespedes.get(i);
            }
            i=i-1;
        }
        return null;
    }

    public void modificarFechaSalida(int dniHuesped, int nuevoDia, int nuevoMes, int nuevoAnio, ArrayList<Huesped> huespedes){
        int i=huespedes.size();
        while(i>=0){
            if(huespedes.get(i).getDni_Huesped()==dniHuesped){
                huespedes.get(i).setsalida(nuevoDia, nuevoMes, nuevoAnio);
            }
            i=i-1;
        }

    }

    public double importeHuesped(int dniHuesped, ArrayList<Huesped> huespedes){
        int i=huespedes.size();
        double importe=0;
        while(i>=0){
            if(huespedes.get(i).getDni_Huesped()==dniHuesped){
                if(huespedes.get(i).cantDias()<30){
                    importe=(huespedes.get(i).cantDias() * huespedes.get(i).getHabitacion_Huesped().getPrecio_Habitacion());
                }else{
                    importe=(huespedes.get(i).getHabitacion_Huesped().getPrecio_Habitacion() * huespedes.get(i).cantDias() * (0.75));
                }
            }
            i=i-1;
        }
        return importe;
    }

    /*
    Recordar que los métodos representan el comportamiento de un ente,
    y el nombre de ese ente debe ser el nombre de la clase.

    Por ejemplo, los métodos de esta clase deben estar en una clase llamada "Hotel",

     */


}

