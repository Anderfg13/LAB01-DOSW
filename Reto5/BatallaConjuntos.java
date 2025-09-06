import java.util.*;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    
    public Set<Integer> procesarHashSet() {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        
        System.out.println("HashSet original: " + hashSet);
        
        Set<Integer> resultado = hashSet.stream()
            .filter(num -> num % 3 != 0)
            .collect(Collectors.toSet());
        
        System.out.println("HashSet sin múltiplos de 3: " + resultado);
        return resultado;
    }
    
    public Set<Integer> procesarTreeSet() {
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
        Set<Integer> union = new TreeSet<>(); // TreeSet para orden automático
        union.addAll(hashSetProcesado);
        union.addAll(treeSetProcesado);
        
        System.out.println("=== RESULTADO FINAL ===");
        System.out.println("Unión ordenada: " + union);
        System.out.println();
        
        union.forEach(num -> System.out.println("Número en arena: " + num));
    }
    
    public static void main(String[] args) {
        BatallaConjuntos batalla = new BatallaConjuntos();
        
        System.out.println("=== BATALLA DE CONJUNTOS - RESULTADO FINAL ===\n");
        
        Set<Integer> resultadoHashSet = batalla.procesarHashSet();
        System.out.println();
        
        Set<Integer> resultadoTreeSet = batalla.procesarTreeSet();
        System.out.println();
        
        batalla.mostrarResultadoFinal(resultadoHashSet, resultadoTreeSet);
    }
}