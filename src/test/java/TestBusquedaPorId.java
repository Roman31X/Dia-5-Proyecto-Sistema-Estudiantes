import com.roman31x.data.EstudianteDAO;
import com.roman31x.model.Estudiante;
import org.junit.Test;

public class TestBusquedaPorId {

    @Test
    public void BusquedaPorId(){
        var encontrado = new EstudianteDAO();
        var estudiante = new Estudiante(1);
        System.out.println("ID ESTUDIANTE ENVIADO: "+estudiante);
        var respuesta = encontrado.buscarEstudiantePorId(estudiante);
        if (respuesta){
            System.out.println("Estudiante encontrado: "+estudiante);
        }else{
            System.out.println("Estudiante no encontrado :´)");
        }
    }
}
