package com.roman31x.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion(){
        Connection conexion = null;

        // Describimos los datos de nuestra base de datos
        var baseDatos = "estudiantes_db";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "admin";

        //  Cargamos la clase del driver de mysql en memoria
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,password);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrió un error! : "+e.getMessage());
        }

        return conexion;
    }

}
