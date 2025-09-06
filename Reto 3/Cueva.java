package Reto3;

public class Cueva {
    
    public String StringBuffer(String mensaje) {
        return java.util.stream.IntStream.range(0, mensaje.length())
                .mapToObj(i -> String.valueOf(mensaje.charAt(mensaje.length() - 1 - i)))
                .collect(java.util.stream.Collectors.joining());
    }
}
