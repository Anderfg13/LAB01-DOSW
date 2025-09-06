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
            int maximo = Collections.max(lista);
            int cantidad = lista.size();
            boolean isDivisible = (2 % maximo == 0) ? true : false;
            boolean esPar = (maximo % 2 == 0) ? true : false;
            boolean cantidadPar = (cantidad % 2 == 0) ? true : false;
            boolean cantidadImpar = (cantidad % 2 != 0) ? true : false;
            return "Número más pequeño: " + minimo +
                   ", Número más grande: " + maximo +
                   ", Cantidad de datos: " + cantidad +
                   ", 2 es divisible por el máximo: " + isDivisible +
                   ", Máximo es par: " + esPar +
                   ", Cantidad es par: " + cantidadPar +
                   ", Cantidad es impar: " + cantidadImpar;
        };

        System.out.println(calcular.apply(numeros));
    }
}
