import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear lista de estudiantes usando Arrays.asList (que implementa List)
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Anderson Fabian Garcia Nieto", 19, "anderson.garcia-n@mail.escuelaing.edu.co", 6),
            new Estudiante("Christian Alfonso Romero Martinez", 20, "christian.romero-m@mail.escuelaing.edu.co", 6)
        );
        
        // Generar mensaje de bienvenida usando streams, map y collect
        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        
        // Imprimir el mensaje
        System.out.println(mensaje);
        

    }
}
