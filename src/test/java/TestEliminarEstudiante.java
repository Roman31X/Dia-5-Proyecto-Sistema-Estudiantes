import com.roman31x.data.EstudianteDAO;
import com.roman31x.model.Estudiante;
import org.junit.Test;

public class TestEliminarEstudiante {

    @Test
    public void eliminarEstudiante(){
        var estudiante = new Estudiante(2);
        var opcion = new EstudianteDAO();
        var respuesta = opcion.eliminarEstudiante(estudiante);
        if(respuesta){
            System.out.println("Se elimino el estudiante con ID: "+estudiante.getIdEstudiante());
        }else{
            System.out.println("No se elimino estudiante con ID: "+estudiante.getIdEstudiante());
        }
    }
}
