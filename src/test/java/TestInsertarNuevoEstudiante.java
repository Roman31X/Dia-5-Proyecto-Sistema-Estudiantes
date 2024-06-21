import com.roman31x.data.EstudianteDAO;
import com.roman31x.model.Estudiante;
import org.junit.Test;

public class TestInsertarNuevoEstudiante {

    @Test
    public void insertarNuevoEstudiante(){
        var nuevoEstudiante = new Estudiante("Pedro","Castillo","84585447","pedro@gmail.com");
        var insertar = new EstudianteDAO();
        var respuesta = insertar.agregarEstudiante(nuevoEstudiante);
        System.out.println("El estudiante fue agregado: "+respuesta);
        if(respuesta){
            System.out.println("Datos del estudiante: "+nuevoEstudiante);
        }else{
            System.out.println("Los datos no se insertaron en la base de datos");
        }
    }
}
