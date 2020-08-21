package com.company;

import sistemas.administracion.Hospital;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Hospital hospital1= new Hospital(new ArrayList<>(),new ArrayList<>(),"Hospital Pirovano",
                             new ArrayList<>(),new ArrayList<>(),150);

        Doctor doctor1 = new Doctor(23678456,"Jose","Rodriguez",45);
        Doctor doctor2 = new Doctor(356846,"Pablo","Ramirez",56);
        Doctor doctor3 = new Doctor(20345045,"Paola","Hernandez",40);

        hospital1.getDoctores_atendiendo().add(doctor1);
        hospital1.getDoctores_atendiendo().add(doctor2);
        hospital1.getDoctores_atendiendo().add(doctor3);

        Paciente paciente1 = new Paciente(44789123,"Juan","Sanchez",15);
        Paciente paciente2 = new Paciente(42789456,"Ramon","Sanchez",11);
        Paciente paciente3 = new Paciente(47789888,"Santiago","Sanchez",18);

        hospital1.agregar_paciente(paciente1);
        hospital1.agregar_paciente(paciente2);
        hospital1.agregar_paciente(paciente3);

        Paciente paciente4 = new Paciente(23789321,"Charly","Spinetta",60);
        Paciente paciente5 = new Paciente(24779123,"Luis","Cerati",55);
        Paciente paciente6 = new Paciente(22789654,"Gustavo","García",61);

        hospital1.getPacientes_siendo_atendidos().add(paciente4);
        hospital1.getPacientes_siendo_atendidos().add(paciente5);
        hospital1.getPacientes_siendo_atendidos().add(paciente6);

        Paciente paciente7 = new Paciente(30321456,"Lionel","Francescoli",30);
        Paciente paciente8 = new Paciente(23779123,"Diego","Messi",65);
        Paciente paciente9 = new Paciente(24951753,"Enzo","Maradona",59);

        hospital1.agregar_pacientes_atendidos(paciente7);
        hospital1.agregar_pacientes_atendidos(paciente8);
        hospital1.agregar_pacientes_atendidos(paciente9);

        int cant_camas = hospital1.cant_camas();
        System.out.println(cant_camas);

        System.out.println("----------------------------");

        String info_mostrar = hospital1.info_siendo_atendidos();
        System.out.println(info_mostrar);

        System.out.println("----------------------------");

        int cant_atendidos = hospital1.cant_pacientes_atendidos();
        System.out.println(cant_atendidos);

        System.out.println("----------------------------");
        hospital1.agregar_pacientes_atendidos(paciente3);
        hospital1.eliminar_pacientes_atendidos();

    }
}
