package com.company;

public class Jugador {

        private String nombre;
        private String apellido;
        private int edad;
        private int dni;
        private int numero_camiseta;

        public Jugador(String nombre, String apellido, int edad, int dni, int numero_camiseta) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
                this.dni = dni;
                this.numero_camiseta = numero_camiseta;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public int getEdad() {
                return edad;
        }

        public void setEdad(int edad) {
                this.edad = edad;
        }

        public int getDni() {
                return dni;
        }

        public void setDni(int dni) {
                this.dni = dni;
        }

        public int getNumero_camiseta() {
                return numero_camiseta;
        }

        public void setNumero_camiseta(int numero_camiseta) {
                this.numero_camiseta = numero_camiseta;
        }
}
