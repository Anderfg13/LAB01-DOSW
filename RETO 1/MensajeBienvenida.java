import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    
    public static String generarMensaje(List<Estudiante> estudiantes) {
      
        String informacionEstudiantes = estudiantes.stream()
            .map(estudiante -> estudiante.getNombre() + " estudiante de la escuela de " 
                + estudiante.getSemestre() + " semestre de " + estudiante.getEdad() + " años")
            .collect(Collectors.joining(" y "));
        
        String correos = estudiantes.stream()
            .map(Estudiante::getCorreo)
            .collect(Collectors.joining(" y "));
        
        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " 
            + informacionEstudiantes 
            + ", nuestros correos institucionales son " 
            + correos;
    }
}
