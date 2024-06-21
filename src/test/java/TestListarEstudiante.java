import com.roman31x.data.EstudianteDAO;
import com.roman31x.model.Estudiante;
import org.junit.Test;

import java.util.List;

public class TestListarEstudiante {

    @Test
    public void pruebaListarEstudiante(){
        var estudianteDao = new EstudianteDAO();

        System.out.println("Lista de estudiantes en la base de datos");

        List<Estudiante> listaEstudiantesBD = estudianteDao.listarEstudiantes();

        listaEstudiantesBD.forEach(System.out::println);
    }
}
