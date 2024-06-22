package com.roman31x.aplicacion;

import com.roman31x.data.EstudianteDAO;
import java.util.Scanner;

import static com.roman31x.controller.ControladorMenuConsola.ejecutarOpcion;
import static com.roman31x.view.MenuConsola.mostrarMenu;

public class SistemaEstudiante {
    public static void main(String[] args) {

        var salir = false;
        var consola = new Scanner(System.in);

        var estudianteDAO = new EstudianteDAO();
        while (!salir){
            try{
                mostrarMenu();
                salir = ejecutarOpcion(consola, estudianteDAO);
            }catch (Exception e){
                System.out.println("Ocurrió un erro al ejecutar operación: "+e.getMessage());
            }
            System.out.println();
        }

    }
}
