package com.company;

import java.util.ArrayList;

public class Calculadora {

        private Programa programa_cargado;
        private ArrayList<Integer> pila;
        private ArrayList<DatoMemoria> memoria;

        public Calculadora() {
            this.programa_cargado = new  Programa();
            this.pila = new ArrayList<Integer>();
            this.memoria = new ArrayList<DatoMemoria>();
        }


        public Programa getPrograma_cargado() {
            return programa_cargado;
        }

        public void setPrograma_cargado(Programa programa_cargado) {
            this.programa_cargado = programa_cargado;
        }

        public ArrayList<Integer> getPila() {
            return pila;
        }

        public void setPila(ArrayList<Integer> pila) {
            this.pila = pila;
        }

        public ArrayList<DatoMemoria> getMemoria() {
            return memoria;
        }

        public void setMemoria(ArrayList<DatoMemoria> memoria) {
            this.memoria = memoria;
        }


        public void agregarPrograma(Programa px){

            this.programa_cargado=px;
        }

    public DatoMemoria getDatoMemoriabyname(String nombredato) {
        for (DatoMemoria dato_i : memoria) {
            if (nombredato.equals(dato_i.getNombrevariable())) {
                return dato_i;
            }
        }
         DatoMemoria d = new DatoMemoria(nombredato);
        memoria.add(d);
        return d;
    }

        public void ejecutar( String rutinaaejecutar ){
            DatoMemoria dato;
            for (Rutina rutina_i : programa_cargado.getRutinas()) {
                if ((rutina_i.getNombre_rutina()).equals(rutinaaejecutar)){
                    for (Instruccion instruccion_i : rutina_i.getInstrucciones()) {
                        switch (instruccion_i.getNombreoperacion()){
                            case "add":
                                add();
                                break;
                            case "mul":
                                mul();
                                break;
                            case "sub":
                                sub();
                                break;
                            case "push":
                                push(instruccion_i.getValor());
                                break;
                            case "write":
                                dato = getDatoMemoriabyname(instruccion_i.getNombreVariable());
                                write(dato);
                                break;
                            case "read":
                                dato = getDatoMemoriabyname(instruccion_i.getNombreVariable());
                                read(dato);
                                break;
                        }
                    }
                }
            }

            memoria.clear();
            pila.clear();
        }


        public void add() {
            if (pila.size() == 0) {
                pila.add(0);
            }
            else if (pila.size() >1) {
                pila.add(pila.get(0) + pila.get(1));
                pila.remove(0);
                pila.remove(0);
            }
        }


        public void sub() {
            if (pila.size() == 0){
                pila.add(0);
            }
            else if (pila.size() >1) {
                pila.add(pila.get(0) - pila.get(1));
                pila.remove(0);
                pila.remove(0);
            }
        }

        public void mul() {
            if (pila.size() == 0) pila.add(0);
            else if (pila.size() >1) {
                pila.add(pila.get(0) * pila.get(1));
                pila.remove(0);
                pila.remove(0);
            }
        }

        public void push(Integer numx) {
            pila.add(numx);
        }

        public void write(DatoMemoria datox) {
            datox.setValor(pila.get(0));
            pila.remove(0);
        }

        public void read(DatoMemoria datox) {
            if(pila!=null) {
                pila.add(datox.getValor());
            }
        }

    }
