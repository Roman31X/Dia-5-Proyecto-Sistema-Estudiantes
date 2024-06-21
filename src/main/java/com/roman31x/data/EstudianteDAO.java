package com.roman31x.data;

import com.roman31x.model.Estudiante;

import java.sql.*;
import java.util.*;
import static com.roman31x.conexion.Conexion.getConexion;

// DAO -> Data Access Object
public class EstudianteDAO {

    String sqlListar = "SELECT * FROM estudiante";

    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        try {
            ps = con.prepareStatement(sqlListar);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
            }
        }catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error a cerra la conexión: "+e.getMessage());
            }
        }
        return estudiantes;
    }
}
