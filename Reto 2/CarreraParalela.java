package Reto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class CarreraParalela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese números separados por espacio:");
        String linea = sc.nextLine();

        List<Integer> numeros = new ArrayList<>();
        for (String s : linea.split(" ")) {
            numeros.add(Integer.parseInt(s));
        }

        Function<List<Integer>, String> calcular = lista -> {
            int minimo = Collections.min(lista);
            int cantidad = lista.size();
            return "Número más pequeño: " + minimo + ", Cantidad de datos: " + cantidad;
        };

        String resultado = calcular.apply(numeros);
        System.out.println(resultado);
    }
}
