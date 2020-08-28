package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class ABMMascotas {
    private HashSet<Dueño> duenios;
    private HashSet<Mascota> mascotas;

    public ABMMascotas(HashSet<Dueño> duenios, HashSet<Mascota> mascotas) {
        this.duenios = duenios;
        this.mascotas = mascotas;
    }

    public HashSet<Dueño> getDuenios() {
        return duenios;
    }

    public void setDuenios(HashSet<Dueño> duenios) {
        this.duenios = duenios;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public boolean duenioRegistrado(int dni_consutar) {

        for (Dueño i : this.getDuenios()
        ) {
            if (i.getDni() == dni_consutar) {
                return true;
            }
        }
        return false;
    }

    public boolean mascotaExistente(String nombre_mascota) {
        for (Mascota i : this.getMascotas()
        ) {
            if (i.getNombre().equals(nombre_mascota)) {
                return true;
            }
        }
        return false;
    }

    public Dueño getDuenioByDni(int dni) {
        Dueño duenio_retornar = new Dueño("", 0, 0);
        for (Dueño i : this.getDuenios()
        ) {
            if (i.getDni() == dni) {
                duenio_retornar = i;
            }
        }
        return duenio_retornar;
    }

    public static void main(String[] args) {
        ABMMascotas sistema = new ABMMascotas(new HashSet<>(), new HashSet<>());
        Pez p1 = new Pez();
        boolean preguntar = true;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema ABM de mascotas");
        while (preguntar) {
            System.out.println("Ingrese su dni para iniciar sesion");
            int dni = ingreso.nextInt();
            boolean existe = sistema.duenioRegistrado(dni);
            if (existe) {
                System.out.println("Que desea hacer?");
                System.out.println("1) Saludar Mascota");
                System.out.println("2) Alimentar Mascota");
                System.out.println("3) Dar de Alta Mascota");
                System.out.println("4) Dar de baja Mascota");
                System.out.println("5) Salir del sistema");
                int opcion = ingreso.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre de la mascota que quiera saludar");
                        String nombre_mascota_saludar = ingreso.next();
                        for (Mascota i : sistema.getMascotas()
                        ) {
                            if (i.getNombre().equals(nombre_mascota_saludar)) {
                                System.out.println("Ingrese su nombre por favor,para poder saludar a su mascota");
                                String nombre_duenio_ingresado = ingreso.next();
                                i.saludar(nombre_duenio_ingresado);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre de la mascota que quiera alimentar");
                        String nombre_mascota_alimentar = ingreso.next();
                        for (Mascota i : sistema.getMascotas()
                        ) {
                            if (i.getNombre().equals(nombre_mascota_alimentar)) {
                                i.alimentar();
                                System.out.println("Mascota alimentada con exito");
                            }
                        }
                        break;

                        
                    case 3:
                        System.out.println("Ingrese el tipo de mascota que quiera ingresar");
                        String tipo_mascota_ingresar = ingreso.next();
                        switch (tipo_mascota_ingresar) {
                            case "Perro":
                                Mascota mascota_ingresar = new Perro();
                                boolean nombre_existente = false;
                                System.out.println("Que nombre desea ponerle a la mascota?");
                                String nombre_mascota_ingresar = ingreso.next();
                                nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                if (nombre_existente) {
                                    while (nombre_existente) {
                                        System.out.println("El nombre ingresado ya existe pruebe otro:");
                                        nombre_mascota_ingresar = ingreso.next();
                                        nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                    }
                                } else {
                                    mascota_ingresar.setNombre(nombre_mascota_ingresar);
                                    mascota_ingresar.setDueño(sistema.getDuenioByDni(dni));
                                    sistema.getMascotas().add(mascota_ingresar);
                                    System.out.println("Mascota ingresada con exito");
                                }
                                break;
                            case "Gato":
                                mascota_ingresar = new Gato();
                                nombre_existente = false;
                                System.out.println("Que nombre desea ponerle a la mascota?");
                                nombre_mascota_ingresar = ingreso.next();
                                nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                if (nombre_existente) {
                                    while (nombre_existente) {
                                        System.out.println("El nombre ingresado ya existe pruebe otro:");
                                        nombre_mascota_ingresar = ingreso.next();
                                        nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                    }
                                } else {
                                    mascota_ingresar.setNombre(nombre_mascota_ingresar);
                                    mascota_ingresar.setDueño(sistema.getDuenioByDni(dni));
                                    sistema.getMascotas().add(mascota_ingresar);
                                    System.out.println("Mascota ingresada con exito");
                                }
                                break;
                            case "Pajarito":
                                mascota_ingresar = new Pajarito();
                                nombre_existente = false;
                                System.out.println("Que nombre desea ponerle a la mascota?");
                                nombre_mascota_ingresar = ingreso.next();
                                nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                if (nombre_existente) {
                                    while (nombre_existente) {
                                        System.out.println("El nombre ingresado ya existe pruebe otro:");
                                        nombre_mascota_ingresar = ingreso.next();
                                        nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                    }
                                } else {
                                    mascota_ingresar.setNombre(nombre_mascota_ingresar);
                                    mascota_ingresar.setDueño(sistema.getDuenioByDni(dni));
                                    sistema.getMascotas().add(mascota_ingresar);
                                    System.out.println("Mascota ingresada con exito");
                                }
                                break;
                            case "Pez":
                                mascota_ingresar = new Pez();
                                nombre_existente = false;
                                System.out.println("Que nombre desea ponerle a la mascota?");
                                nombre_mascota_ingresar = ingreso.next();
                                nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                if (nombre_existente) {
                                    while (nombre_existente) {
                                        System.out.println("El nombre ingresado ya existe pruebe otro:");
                                        nombre_mascota_ingresar = ingreso.next();
                                        nombre_existente = sistema.mascotaExistente(nombre_mascota_ingresar);
                                    }
                                } else {
                                    mascota_ingresar.setNombre(nombre_mascota_ingresar);
                                    mascota_ingresar.setDueño(sistema.getDuenioByDni(dni));
                                    sistema.getMascotas().add(mascota_ingresar);
                                    System.out.println("Mascota ingresada con exito");
                                }
                                break;

                        }
                        break;
                    case 4:
                        System.out.println("Ingrese el nombre de la mascota que desea eliminar");
                        String nombre_mascota_eliminar = ingreso.next();
                        for (Mascota i : sistema.getMascotas()
                        ) {
                            if (i.getNombre().equals(nombre_mascota_eliminar)) {
                                sistema.getMascotas().remove(i);
                            }
                        }
                        System.out.println("Mascota eliminada exitosamente");
                        break;

                    case 5:
                        System.out.println("Gracias por usar nuestro sistema, vuelva pronto!");
                        preguntar = false;
                        break;
                }
            } else {
                System.out.println("No se encuentra registrado, quiere registrarse? y/n");
                String respuesta = ingreso.next();
                if (respuesta.equals("y")) {
                    System.out.println("Ingrese su dni");
                    int dni_ingresar = ingreso.nextInt();
                    System.out.println("Ingrese su nombre");
                    String nombre_ingresar = ingreso.next();
                    System.out.println("Ingrese su telefono");
                    int telefono_ingresar = ingreso.nextInt();
                    Dueño duenio_ingresar = new Dueño(nombre_ingresar, dni_ingresar, telefono_ingresar);
                    sistema.getDuenios().add(duenio_ingresar);
                    System.out.println("Registrado exitosamnete");
                }
            }


        }
    }
}






