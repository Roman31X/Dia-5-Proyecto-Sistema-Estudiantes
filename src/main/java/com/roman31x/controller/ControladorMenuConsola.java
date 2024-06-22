package com.roman31x.controller;

import com.roman31x.data.EstudianteDAO;
import com.roman31x.model.Estudiante;

import java.util.Scanner;

public class ControladorMenuConsola {
    public static boolean ejecutarOpcion(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion){
            case 1 -> {
                System.out.println("|------------------------LISTA DE ESTUDIANTES--------------------|");
                var estudiantes = estudianteDAO.listarEstudiantes();
                estudiantes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("|----BUSCAR ESTUDIANTE POR ID----|");
                System.out.print("Ingrese ID: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if(encontrado){
                    System.out.println("Estudiante encontrado: "+ estudiante);
                }else{
                    System.out.println("Estudiante no encontrado: "+estudiante);
                }
            }
            case 3 -> {
                System.out.println("|----AGREGAR ESTUDIANTE----|");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Teléfono: ");
                var telefono = consola.nextLine();
                System.out.print("Email: ");
                var email = consola.nextLine();

                var nuevoEstudiante = new Estudiante(nombre,apellido,telefono,email);

                var respuesta = estudianteDAO.agregarEstudiante(nuevoEstudiante);

                if(respuesta){
                    System.out.println("Se agrego el estudiante: "+nuevoEstudiante);
                }else{
                    System.out.println("No se pudo agregar el estudiante: "+nuevoEstudiante);
                }
            }
            case 4 -> {
                System.out.println("|----MODIFICAR ESTUDIANTE----|");
                System.out.print("Ingrese ID Estudiante: ");
                var idEstudainte = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Teléfono: ");
                var telefono = consola.nextLine();
                System.out.print("Email: ");
                var email = consola.nextLine();

                var modificarEstudiante = new Estudiante(idEstudainte,nombre,apellido,telefono,email);

                var respuesta = estudianteDAO.modificarEstudiante(modificarEstudiante);

                if(respuesta){
                    System.out.println("Se modifico el estudiante: "+modificarEstudiante);
                }else{
                    System.out.println("No se pudo modificar el estudiante: "+modificarEstudiante);
                }
            }
            case 5 -> {
                System.out.println("|----ELIMINAR ESTUDIANTE----|");
                System.out.print("Ingrese ID Estudiante: ");
                var idEstudainte = Integer.parseInt(consola.nextLine());

                var eliminarEstudiante = new Estudiante(idEstudainte);

                var respuesta = estudianteDAO.eliminarEstudiante(eliminarEstudiante);

                if(respuesta){
                    System.out.println("Se elimino el estudiante con ID: "+idEstudainte);
                }else{
                    System.out.println("No se pudo eliminar el estudiante con ID: "+idEstudainte);
                }
            }
            case 6 -> {
                System.out.println("""
                        |------------------------------|
                        | GRACIAS POR USAR NUESTRA APP |
                        |       HASTA PRONTO!!!        |
                        |------------------------------|""");
                salir = true;
            }
            default -> {
                System.out.println("Opción fuera del menu de opciones");
            }
        }
        return salir;
    }
}
