package exercicios;
// Java code for IntStream of(int... values)
// to get a sequential ordered stream whose
// elements are the specified values.
//font: https://www.geeksforgeeks.org/intstream-of-in-java/

//IntStream range(n to x) mostra um range paralelo e ordenado de valores
// a partir do valor inicial até a quantidade final de elementos solicitados

import java.util.stream.IntStream;

public class Intstream {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4).forEach(n -> System.out.println(n));

        IntStream.range(0,3).forEach(n -> System.out.println("Número = " + n));
    }
}
