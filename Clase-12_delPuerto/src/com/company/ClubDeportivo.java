package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class ClubDeportivo {
    private String nombre_club;
    private String fecha_fundacion;
    private Equipo equipo_futbol;
    private HashSet <Partido> partidos_jugados;


    public ClubDeportivo(String nombre_club, String fecha_fundacion, Equipo equipo_futbol, HashSet<Partido> partidos_jugados) {
        this.nombre_club = nombre_club;
        this.fecha_fundacion = fecha_fundacion;
        this.equipo_futbol = equipo_futbol;
        this.partidos_jugados = partidos_jugados;
    }

    public String getNombre_club() {
        return nombre_club;
    }

    public void setNombre_club(String nombre_club) {
        this.nombre_club = nombre_club;
    }

    public String getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(String fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public Equipo getEquipo_futbol() {
        return equipo_futbol;
    }

    public void setEquipo_futbol(Equipo equipo_futbol) {
        this.equipo_futbol = equipo_futbol;
    }

    public HashSet<Partido> getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(HashSet<Partido> partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }

    public HashSet  ingresarPartidosGanados(){
        HashSet<Partido>partidos_ganados = new HashSet<>();
        for (Partido i : this.getPartidos_jugados()
        ) {
            if (i.isGanado()){
                partidos_ganados.add(i);
            }

        }
        return partidos_ganados;
    }

    public HashSet ingresarPartidosPerdidos(){
        HashSet<Partido>partidos_perdidos = new HashSet<>();
        for (Partido i : this.getPartidos_jugados()
        ) {
            if (!i.isGanado()){
                partidos_perdidos.add(i);
            }

        }
        return partidos_perdidos;
    }

    public void mostrarPartidos(HashSet<Partido> partidos_mostrar){
        String salida= "";
        for (Partido i : partidos_mostrar
        ) {
            salida = salida + "|Fecha: " + i.fecha + " " + "Ganado: " + i.ganado;
        }
        System.out.println(salida);
    }
    public void mostrarJugadores(){
        String salida = "";
        for (Jugador i : this.getEquipo_futbol().getJugadores()
             ) {
            salida = salida + " |Nombre: " + i.getNombre() + " Apellido: " + i.getApellido() + " Edad: " + i.getEdad() + " Dni: " + i.getDni() + " Numero: "+ i.getNumero_camiseta();
        }
        System.out.println(salida);
    }
    public static void main(String[] args) {
            Equipo Equipo_futbol = new Equipo("River Plate Primera",new HashSet<>(),"Marcelo","Gallardo");
            ClubDeportivo Club = new ClubDeportivo("Club atletico River Plate", "25/05/1901",Equipo_futbol,new HashSet<>());
            boolean preguntar=true;
            Scanner ingreso_opcion = new Scanner(System.in);


            Jugador jugador1 = new Jugador("Leonardo","Ponzio",35,30567893,5);
            Jugador jugador2 = new Jugador("Rodrigo","Mora", 36,30456789,2);
            Jugador jugador3 = new Jugador("Rafael","Borre",22,40123456,15);
            Jugador jugador4 = new Jugador("Gonzalo","Martinez",28,31267458,11);
            Jugador jugador5 = new Jugador("Juan","Quintero",29,32789654,10);
            Jugador jugador6 = new Jugador("Jonathan","Maidana",32,34321765,2);
            Jugador jugador7 = new Jugador("Milton","Casco",34,36543987,3);
            Jugador jugador8 = new Jugador("Lucas","Pratto",35,39456798,9);
            Jugador jugador9 = new Jugador("Enzo","Francescoli",39,35876312,8);
            Jugador jugador10 = new Jugador("Franco","Armani",37,37098435,1);
            Jugador jugador11 = new Jugador("Lucas","Martinez",28,40687543,4);
            Jugador jugador12= new Jugador("Enzo","Perez",31,39660222,7);
            Jugador jugador13 = new Jugador("Roberto","Bologna",34,34110543,32);
            Jugador jugador14 = new Jugador("Bruno","Zuculini",29,38332111,6);
            Club.getEquipo_futbol().getJugadores().add(jugador1);
            Club.getEquipo_futbol().getJugadores().add(jugador2);
            Club.getEquipo_futbol().getJugadores().add(jugador3);
            Club.getEquipo_futbol().getJugadores().add(jugador4);
            Club.getEquipo_futbol().getJugadores().add(jugador5);
            Club.getEquipo_futbol().getJugadores().add(jugador6);
            Club.getEquipo_futbol().getJugadores().add(jugador7);
            Club.getEquipo_futbol().getJugadores().add(jugador8);
            Club.getEquipo_futbol().getJugadores().add(jugador9);
            Club.getEquipo_futbol().getJugadores().add(jugador10);
            Club.getEquipo_futbol().getJugadores().add(jugador11);
            Club.getEquipo_futbol().getJugadores().add(jugador12);
            Club.getEquipo_futbol().getJugadores().add(jugador13);
            Club.getEquipo_futbol().getJugadores().add(jugador14);

            Partido partido1=new Partido("25/04/2019",new HashSet<>(),true);
            Partido partido2=new Partido("01/05/2019", new HashSet<>(),false);
            Partido partido3=new Partido("09/12/2019",new HashSet<>(),true);

            partido1.getJugadores_citados().add(jugador1);
            partido1.getJugadores_citados().add(jugador10);
            partido1.getJugadores_citados().add(jugador12);
            partido1.getJugadores_citados().add(jugador11);
            partido1.getJugadores_citados().add(jugador9);
            partido1.getJugadores_citados().add(jugador8);
            partido1.getJugadores_citados().add(jugador7);
            partido1.getJugadores_citados().add(jugador6);
            partido1.getJugadores_citados().add(jugador5);
            partido1.getJugadores_citados().add(jugador3);
            partido1.getJugadores_citados().add(jugador4);

            partido2.getJugadores_citados().add(jugador1);
            partido2.getJugadores_citados().add(jugador13);
            partido2.getJugadores_citados().add(jugador12);
            partido2.getJugadores_citados().add(jugador5);
            partido2.getJugadores_citados().add(jugador9);
            partido2.getJugadores_citados().add(jugador8);
            partido2.getJugadores_citados().add(jugador7);
            partido2.getJugadores_citados().add(jugador6);
            partido2.getJugadores_citados().add(jugador2);
            partido2.getJugadores_citados().add(jugador3);
            partido2.getJugadores_citados().add(jugador4);

            partido3.getJugadores_citados().add(jugador1);
            partido3.getJugadores_citados().add(jugador10);
            partido3.getJugadores_citados().add(jugador11);
            partido3.getJugadores_citados().add(jugador5);
            partido3.getJugadores_citados().add(jugador9);
            partido3.getJugadores_citados().add(jugador8);
            partido3.getJugadores_citados().add(jugador7);
            partido3.getJugadores_citados().add(jugador6);
            partido3.getJugadores_citados().add(jugador2);
            partido3.getJugadores_citados().add(jugador3);
            partido3.getJugadores_citados().add(jugador14);

            Club.getPartidos_jugados().add(partido1);
            Club.getPartidos_jugados().add(partido2);
            Club.getPartidos_jugados().add(partido3);
            System.out.println("---------------------------------------");
            System.out.println("Binevenido al Club Atletico River Plate");
            System.out.println("---------------------------------------");
            while (preguntar){
                System.out.println("¿Que desea realizar?");
                System.out.println("1) Consultar Partidos Ganados.");
                System.out.println("2) Consultar Partidos Perdidos.");
                System.out.println("3) Ver la informacion de nuestro Jugadores.");
                System.out.println("4) Consultar Informacion de nuestro DT.");
                System.out.println("5) Salir del sistema.");
                System.out.println("Ingrese el número para elegir la opción.");
                int opcion_elegida = ingreso_opcion.nextInt();
                switch (opcion_elegida){
                    case 1:
                        System.out.println("Partidos Ganados: ");
                        HashSet <Partido> partidos_ganados_club= new HashSet<>();
                        partidos_ganados_club = Club.ingresarPartidosGanados();
                        Club.mostrarPartidos(partidos_ganados_club);
                        break;
                    case 2:
                        System.out.println("Partidos Perdidos: ");
                        HashSet <Partido> partidos_perdidos_club= new HashSet<>();
                        partidos_perdidos_club = Club.ingresarPartidosPerdidos();
                        Club.mostrarPartidos(partidos_perdidos_club);
                        break;
                    case 3:
                        System.out.println("Nuestros Jugadores son: ");
                        Club.mostrarJugadores();
                        break;

                    case 4:
                        System.out.println("Nuestro DT se llama: " + Club.getEquipo_futbol().getNombre_dt() + " " + Club.getEquipo_futbol().getApellido_dt());
                        break;

                    case 5:
                        System.out.println("Gracias por utilizar nuestro sistema.");
                        System.out.println("Vuelva pronto!");
                        preguntar = false;
                        break;
                }
            }




    }




}
