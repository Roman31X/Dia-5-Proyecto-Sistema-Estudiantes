package com.roman31x.aplicacion;

import com.roman31x.conexion.Conexion;

public class SistemaEstudiante {
    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if(conexion != null){
            System.out.println("Conexión exitosa: "+conexion);
        }else{
            System.out.println("Error al conectar a la base de datos");
        }
    }
}
