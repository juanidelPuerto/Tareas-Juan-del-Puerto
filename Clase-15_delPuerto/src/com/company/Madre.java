package com.company;

import java.util.HashSet;

public class Madre extends Persona{
        private String empresa;
        private HashSet<Hijo> hijos;

        public Madre(){
            super();
            empresa="Apple";
            hijos = new HashSet<Hijo>();
        }

    public Madre(String nombre, int edad, int dni, int telefono, String direccion, String empresa, HashSet<Hijo> hijos) {
        super(nombre, edad, dni, telefono, direccion);
        this.empresa = empresa;
        this.hijos = hijos;
    }


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public HashSet<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(HashSet<Hijo> hijos) {
        this.hijos = hijos;
    }

    public HashSet<Hijo> getHijosMenores(){
            HashSet<Hijo> hijos_menores = new HashSet<>();
        for (Hijo i : this.getHijos()
             ) {
                if (i.getEdad()<18){
                    hijos_menores.add(i);
                }
        }
        return hijos_menores;
    }

}
