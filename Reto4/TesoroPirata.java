import java.util.*;

public class TesoroPirata {
    
    // Método para Hashtable - sincronizado
    public static synchronized Hashtable<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> mapa = new Hashtable<>();
        for (Map.Entry<String, Integer> par : pares) {
            // Solo añade si la clave no existe (conserva primer valor)
            if (!mapa.containsKey(par.getKey())) {
                mapa.put(par.getKey(), par.getValue());
            }
        }
        return mapa;
    }
    
    // Método para combinar mapas (mismo nombre que en rama 1)
    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> hashMap, 
                                                   Hashtable<String, Integer> hashTable) {
        Map<String, Integer> resultado = new HashMap<>(hashMap);
        // Hashtable tiene prioridad en conflictos
        resultado.putAll(hashTable);
        return resultado;
    }

}