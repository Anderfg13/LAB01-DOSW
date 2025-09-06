public class Cueva {

    //A.1 
    public String StringBuilder(String mensaje) {
        return java.util.stream.IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(java.util.stream.Collectors.joining(" "));
    }

    //B.1 
    public String StringBuffer(String mensaje) {
        return java.util.stream.IntStream.range(0, mensaje.length())
                .mapToObj(i -> String.valueOf(mensaje.charAt(mensaje.length() - 1 - i)))
                .collect(java.util.stream.Collectors.joining());
    }

    public String StringEco(String mensaje) {
        return StringBuilder(StringBuffer(mensaje));
    }
}