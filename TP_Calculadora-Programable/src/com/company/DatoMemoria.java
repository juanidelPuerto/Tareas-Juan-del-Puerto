package com.company;

public class DatoMemoria {

        private String nombrevariable;
        private int valor;


        public String getNombrevariable() {
            return nombrevariable;
        }

        public void setNombrevariable(String nombrevariable) {
            this.nombrevariable = nombrevariable;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public DatoMemoria(String nombrevariable, int valor) {
            this.nombrevariable = nombrevariable;
            this.valor = valor;
        }

         public DatoMemoria(String nombrevariable) {
        this.nombrevariable = nombrevariable;
        }
}

