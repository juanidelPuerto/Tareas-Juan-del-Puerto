package com.company;

public class Huesped{
    private String nombre_Huesped;
    private String apellido_Huesped;
    private entrada = new Fecha();
    private salida = new Fecha();
    private int edad_Huesped;
    private int dni_Huesped;
    private Habitacion habitacion_Huesped;

    /*
    las inicializaciones de los atributos deben ir dentro
    de los constructores

    Falta definir el tipo de dato correspondiente a las variables
    llamadas "entrada" y "salida"e
     */

    public String getNombre_Huesped() {return nombre_Huesped;}

    public String getApellido_Huesped() {return apellido_Huesped;}


    public int getEdad_Huesped() {return edad_Huesped;}

    public int getDni_Huesped() {return dni_Huesped;}

    public Fecha getentrada() {return entrada;}

    public Fecha getsalida() {return salida;}

    public Habitacion getHabitacion_Huesped() {return habitacion_Huesped;}

    public void setNombre_Huesped(String nombre_Huesped) {this.nombre_Huesped = nombre_Huesped;}

    public void setApellido_Huesped(String apellido_Huesped) {this.apellido_Huesped = apellido_Huesped;}

    public void setEdad_Huesped(int edad_Huesped) {this.edad_Huesped = edad_Huesped;}

    public void setDni_Huesped(int dni_Huesped) {this.dni_Huesped = dni_Huesped;}

    public void setentrada(int dia, int mes, int anio){
        this.entrada.setDia(dia);
        this.entrada.setMes(mes);
        this.entrada.setAnio(anio);
    }


    public void setsalida(int dia, int mes, int anio) {
        this.salida.setDia(dia);
        this.salida.setMes(mes);
        this.setAnio(Anio);
        /*
        esto no compila porque "Anio" es un variable
        no definida. La palabra correcta a utilizar es "anio",
        que es el nombre de la variable ingresada.


         */
    }

    public void setHabitacion_Huesped(Habitacion habitacion_Huesped) {this.habitacion_Huesped = habitacion_Huesped;}

    public int cantDias(){

        Fecha fechaEntrada;
        fechaEntrada=this.entrada;
        Fecha fechaSalida;
        fechaSalida=this.salida;

        int cantDias=1;

        while(fechaEntrada.getDia() != fechaSalida.getDia() ||  fechaEntrada.getMes() != fechaSalida.getMes() || fechaEntrada.getAnno() != fechaSalida.getAnio()) {
            if (fechaEntrada.getMes() == 1 ||  fechaEntrada.getMes() == 3  || fechaEntrada.getMes() == 5 || fechaEntrada.getMes() == 7 || fechaEntrada.getMes() == 8 || fechaEntrada.getMes() == 10 ||  fechaEntrada.getMes() == 12) {
                if (fechaEntrada.getDia() == 31) {
                    if (fechaEntrada.getMes() == 12) {
                        fechaEntrada.setMes(1);
                        fechaEntrada.setDia(1);
                        fechaEntrada.setAnio(fechaEntrada.getAnio()+1);
                        cantDias=cantDias+1;
                    }
                    else {
                        fechaEntrada.setMes(fechaEntrada.getMes()+1);
                        fechaEntrada.setDia(1);
                        cantDias=cantDias+1;
                    }
                }
                else {
                    fechaEntrada.setDia(fechaEntrada.getDia()+1);
                    cantDias=cantDias+1;
                }
            }
            else if ((fechaEntrada.getMes() == 4 || fechaEntrada.getMes() == 6 || fechaEntrada.getMes() == 9 || fechaEntrada.getMes() == 11)) {
                if(fechaEntrada.getDia()==30){
                    fechaEntrada.setMes(fechaEntrada.getMes()+1);
                    fechaEntrada.setDia(1);
                    cantDias=cantDias+1;
                }
                else{
                    fechaEntrada.setDia(fechaEntrada.getDia()+1);
                    cantDias=cantDias+1;
                }
            }
            else{
                if(fechaEntrada.getDia()==28  &&  fechaEntrada.getAnio() % 4  !=  0 || fechaEntrada.getDia()==29  &&  fechaEntrada.getAnio() % 4  ==  0){
                    fechaEntrada.setDia(1);
                    fechaEntrada.setMes(fechaEntrada.getMes()+1);
                    cantDias=cantDias+1;
                }
            }
        }
        return cantDias;
    }

    /*
    Hola, Del Puerto!

    Recordar:
    - aplicar el concepto "alta cohesión"
    en todos los métodos.

    - verificar que las clases compilen.
     */
}