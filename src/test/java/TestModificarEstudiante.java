import com.roman31x.data.EstudianteDAO;
import com.roman31x.model.Estudiante;
import org.junit.Test;

public class TestModificarEstudiante {

    @Test
    public void modificarEstudiante(){
        var estudiante = new Estudiante(2,"Dina","Boularte","4455221188","dina@gmial.com");
        var opcion = new EstudianteDAO();
        var respuesta = opcion.modificarEstudiante(estudiante);
        if(respuesta){
            System.out.println("Se modifico el estudiante: "+estudiante);
        }else{
            System.out.println("Ocurrió un erro al modificar");
        }
    }
}
