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

    // Método para combinar mapas - prioriza Hashtable
    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> hashMap,
                                                   Hashtable<String, Integer> hashTable) {
        Map<String, Integer> resultado = new HashMap<>(hashMap);
        resultado.putAll(hashTable); // Hashtable sobrescribe en conflictos
        return resultado;
    }

    public static void imprimirConMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
            .collect(Collectors.toMap(
                entry -> entry.getKey().toUpperCase(),
                Map.Entry::getValue
            ))
            .forEach((clave, valor) -> 
                System.out.println("Clave: " + clave + " | Valor: " + valor));
    }
}