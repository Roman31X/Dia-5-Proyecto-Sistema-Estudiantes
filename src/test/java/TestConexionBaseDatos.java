import com.roman31x.conexion.Conexion;
import org.junit.Test;

public class TestConexionBaseDatos {
    @Test
    public void pruebaConexionBD(){
        var conexion = Conexion.getConexion();
        if(conexion != null){
            System.out.println("Conexión exitosa: "+conexion);
        }else{
            System.out.println("Error al conectar a la base de datos");
        }
    }
}
