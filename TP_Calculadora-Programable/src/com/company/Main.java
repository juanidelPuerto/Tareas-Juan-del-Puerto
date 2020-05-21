package com.company;

public class Main {

    public static void main(String[] args) {


        Programa p = new Programa();

        p.agregarInstruccion("rutina1", new Instruccion("push", 2));
        p.agregarInstruccion("rutina1", new Instruccion("add"));
        p.agregarInstruccion("rutina1", new Instruccion("write", "y"));
        p.agregarInstruccion("rutina1", new Instruccion("read", "x"));
        p.agregarInstruccion("rutina2", new Instruccion("read", "x"));
        p.agregarInstruccion("rutina2", new Instruccion("mul"));
        p.agregarInstruccion("rutina2", new Instruccion("write", "x"));
        p.agregarInstruccion("rutina2", new Instruccion("push", 2));
        p.agregarInstruccion("rutina3", new Instruccion("read", "x"));
        p.agregarInstruccion("rutina3", new Instruccion("push", 131));
        p.agregarInstruccion("rutina3", new Instruccion("add"));
        p.agregarInstruccion("rutina3", new Instruccion("push", 10));
        Calculadora calc = new Calculadora();

        calc.agregarPrograma(p);

        calc.ejecutar("rutina1");
        calc.ejecutar("rutina2");
        calc.ejecutar("rutina3");

    }
}
