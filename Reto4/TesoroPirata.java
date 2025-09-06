package Reto4;

import java.util.*;
import java.util.stream.Collectors;

public class TesoroPirata {
    
    // Método para HashMap - ignora duplicados (conserva primer valor)
    public static HashMap<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> pares) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> par : pares) {
            // Solo añade si la clave no existe (conserva primer valor)
            if (!mapa.containsKey(par.getKey())) {
                mapa.put(par.getKey(), par.getValue());
            }
        }
        return mapa;
    }
    
    // Método para combinar mapas
    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> hashMap, 
                                                   Hashtable<String, Integer> hashTable) {
        Map<String, Integer> resultado = new HashMap<>(hashMap);
        // Hashtable tiene prioridad en conflictos
        resultado.putAll(hashTable);
        return resultado;
    }
}