import java.util.*;
import java.util.stream.Collectors;

public class TesoroPirata {

    // Método para HashMap - ignora duplicados (conserva primer valor)
    public static HashMap<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> pares) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> par : pares) {
            if (!mapa.containsKey(par.getKey())) {
                mapa.put(par.getKey(), par.getValue());
            }
        }
        return mapa;
    }

    // Método para Hashtable - sincronizado
    public static synchronized Hashtable<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> mapa = new Hashtable<>();
        for (Map.Entry<String, Integer> par : pares) {
            if (!mapa.containsKey(par.getKey())) {
                mapa.put(par.getKey(), par.getValue());
            }
        }
        return mapa;
    }

    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> hashMap,
                                                   Hashtable<String, Integer> hashTable) {
        Map<String, Integer> resultado = new HashMap<>(hashMap);
        resultado.putAll(hashTable); // Hashtable sobrescribe en conflictos
        return resultado;
    }

    
    public static void procesarTesoro(HashMap<String, Integer> hashMap,
                                    Hashtable<String, Integer> hashTable) {
        Map<String, Integer> resultado = combinarMapas(hashMap, hashTable);

        resultado.entrySet().stream()
            .collect(Collectors.toMap(
                entry -> entry.getKey().toUpperCase(),
                Map.Entry::getValue,
                (existing, replacement) -> existing, // En caso de duplicados
                LinkedHashMap::new
            ))
            .entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry ->
                System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue()));
    }

    
    private static List<Map.Entry<String, Integer>> parseInput(String input) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        String[] pairs = input.split(" ");
        for (String pair : pairs) {
            String[] kv = pair.split(",");
            if (kv.length == 2) {
                try {
                    String key = kv[0].trim();
                    int value = Integer.parseInt(kv[1].trim());
                    list.add(new AbstractMap.SimpleEntry<>(key, value));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido en par: " + pair + ". Ignorando.");
                }
            } else {
                System.out.println("Formato inválido en par: " + pair + ". Ignorando.");
            }
        }
        return list;
    }

    // Método main para probar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los pares para HashMap (formato: clave1,valor1 clave2,valor2 ...): ");
        String inputHashMap = scanner.nextLine();
        List<Map.Entry<String, Integer>> datosHashMap = parseInput(inputHashMap);

        System.out.println("Ingresa los pares para Hashtable (formato: clave1,valor1 clave2,valor2 ...): ");
        String inputHashtable = scanner.nextLine();
        List<Map.Entry<String, Integer>> datosHashtable = parseInput(inputHashtable);

        HashMap<String, Integer> hashMap = crearHashMap(datosHashMap);
        Hashtable<String, Integer> hashTable = crearHashtable(datosHashtable);

        System.out.println("=== TESORO ENCONTRADO ===");
        procesarTesoro(hashMap, hashTable);

        scanner.close();
    }
}