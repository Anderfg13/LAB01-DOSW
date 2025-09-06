package Reto5;
import java.util.*;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    
    public Set<Integer> procesarHashSet() {
        // Crear HashSet con números aleatorios (sin orden específico)
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        
        System.out.println("HashSet original: " + hashSet);
        
        // Eliminar múltiplos de 3 usando stream().filter()
        Set<Integer> resultado = hashSet.stream()
            .filter(num -> num % 3 != 0)
            .collect(Collectors.toSet());
        
        System.out.println("HashSet sin múltiplos de 3: " + resultado);
        return resultado;
    }
    
    public Set<Integer> procesarTreeSet() {
        // TODO: Implementar por Estudiante B
        return new TreeSet<>();
    }
    
    public void mostrarResultadoFinal(Set<Integer> hashSetProcesado, Set<Integer> treeSetProcesado) {
        // TODO: Implementar en integración final
    }
    
    public static void main(String[] args) {
        BatallaConjuntos batalla = new BatallaConjuntos();
        
        System.out.println("=== BATALLA DE CONJUNTOS - TEST HASHSET ===\n");
        
        Set<Integer> resultadoHashSet = batalla.procesarHashSet();
        System.out.println("Resultado HashSet procesado: " + resultadoHashSet);
    }
}