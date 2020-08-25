package com.company;
import java.util.ArrayList;

public class ProductoAlimenticio {
    private String nombre;
    private float precio;
    private String fecha_elaboracion;
    private String fecha_vencimiento;
    private float peso;


    public ProductoAlimenticio(String nombre, float precio, String fecha_elaboracion, String fecha_vencimiento, float peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_elaboracion = fecha_elaboracion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(String fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean pesoMayora5kg() {
        if (this.peso > 5.000f) {
            return true;
        } else {return false;}
    }

    public boolean productoVencido(String fecha_actual) {
        boolean vencido = false;
        int anio_vencimiento = this.anio(fecha_vencimiento);
        int mes_vencimiento = this.mes(fecha_vencimiento);
        int dia_vencimiento = this.dia(fecha_vencimiento);

        int anio_actual = this.anio(fecha_actual);
        int mes_actual = this.mes(fecha_actual);
        int dia_actual = this.dia(fecha_actual);

        if (anio_vencimiento < anio_actual){
            vencido = true;
            return vencido;
        }
        if (anio_vencimiento == anio_actual && mes_vencimiento < mes_actual){
            vencido = true;
            return vencido;
        }
        if (anio_vencimiento == anio_actual && mes_vencimiento == mes_actual && dia_vencimiento < dia_actual){
            vencido = true;
            return vencido;
        }
        return vencido;
    }

    public int anio(String fecha){
        int anio = 0;
        String anio_string="";
        for (int i = 6; i < fecha.length();i++){
            anio_string = anio_string + "" + fecha.charAt(i);
        }
        anio= stringToint(anio_string);
        return anio;
    }
    public int mes(String fecha){
        int mes = 0;
        String mes_string="";
        for (int i = 3;i < 5; i++){
            mes_string = mes_string + "" + fecha.charAt(i);
        }
        mes = stringToint(mes_string);
        return mes;
    }

    public int dia(String fecha){
        int dia = 0;
        String dia_string="";
        for (int i = 0 ;i < 2; i++){
            dia_string = dia_string + "" +fecha.charAt(i);
        }
        dia = stringToint(dia_string);
        return dia;
    }

    public int stringToint(String string_modificar){
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0;i <string_modificar.length(); i++){
            char caracter = string_modificar.charAt(i);
            int numero = charToint(caracter);
            numeros.add(numero);
        }
        int numero_retornar = arrayToint(numeros);
        return  numero_retornar;
    }
    public int arrayToint(ArrayList<Integer> numeros_transformar){
        int numero_retornar = 0;
        if (numeros_transformar.size() == 4) {
            int unidades_millar = 0;
            int centenas = 0;
            int decenas = 0;
            int unidades = 0;
            for (int i = 0; i < numeros_transformar.size(); i++) {
                if (i == 0) {
                    unidades_millar = numeros_transformar.get(i) * 1000;
                }
                if (i == 1) {
                    centenas = numeros_transformar.get(i) * 100;
                }
                if (i == 2) {
                    decenas = numeros_transformar.get(i) * 10;
                }
                if (i == 3) {
                    unidades = numeros_transformar.get(i);
                }
            }
            numero_retornar = unidades_millar + centenas + decenas + unidades;


        }
        if (numeros_transformar.size() == 2){
            int decenas = 0;
            int unidades = 0;
            for (int i = 0; i < numeros_transformar.size(); i++){
                if (i == 0){
                    decenas = numeros_transformar.get(i)*10;
                }
                if (i == 1){
                    unidades = numeros_transformar.get(i);
                }
            }
            numero_retornar= decenas + unidades;

        }
        return numero_retornar;
    }


    public int charToint(char caracter_transformar){
        int numero_retornar = 0;
        switch (caracter_transformar){
            case '0':
                numero_retornar=0;
                break;
            case '1':
                numero_retornar=1;
                break;
            case '2':
                numero_retornar=2;
                break;
            case '3':
                numero_retornar=3;
                break;
            case '4':
                numero_retornar=4;
                break;
            case '5':
                numero_retornar=5;
                break;
            case '6':
                numero_retornar=6;
                break;
            case '7':
                numero_retornar=7;
                break;
            case '8':
                numero_retornar=8;
                break;
            case '9':
                numero_retornar=9;
                break;
        }
        return numero_retornar;
    }
}