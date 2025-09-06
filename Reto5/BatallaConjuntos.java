import java.util.*;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    
    public Set<Integer> procesarHashSet() {
        // TODO: Implementar por Estudiante A
        return new HashSet<>();
    }
    
    public Set<Integer> procesarTreeSet() {
        // Crear TreeSet con números aleatorios (orden natural automático)
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));
        
        System.out.println("TreeSet original: " + treeSet);
        
        // Eliminar múltiplos de 5 usando stream().filter()
        Set<Integer> resultado = treeSet.stream()
            .filter(num -> num % 5 != 0)
            .collect(Collectors.toSet());
        
        System.out.println("TreeSet sin múltiplos de 5: " + resultado);
        return resultado;
    }
    
    public void mostrarResultadoFinal(Set<Integer> hashSetProcesado, Set<Integer> treeSetProcesado) {
        // TODO: Implementar en integración final
    }
    
    public static void main(String[] args) {
        BatallaConjuntos batalla = new BatallaConjuntos();
        
        System.out.println("=== BATALLA DE CONJUNTOS - TEST TREESET ===\n");
        
        Set<Integer> resultadoTreeSet = batalla.procesarTreeSet();
        System.out.println("Resultado TreeSet procesado: " + resultadoTreeSet);
    }
}