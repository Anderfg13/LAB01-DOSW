public class Cueva {

    //A.1 
    public String StringBuilder(String mensaje) {
        return java.util.stream.IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(java.util.stream.Collectors.joining(" "));
    }

}