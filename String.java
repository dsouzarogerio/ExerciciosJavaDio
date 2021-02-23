package one.digitalinnovaiton.exercicios;

import java.util.Arrays;

public class String {

    public static void main(java.lang.String[] args) {
        System.out.println("A B C D E F G".toCharArray()); //Devolve os valores de cada caractere presentes na string

        System.out.println(Arrays.toString("Aula de Java".split(""))); //posiciona os elementos da array de strings

        System.out.println("Aula ".concat(" de Java")); //Concatenação de Strings

        System.out.println("1234 asda qw".replaceAll("[0-9]","#")); //substitui caracteres por outro
    }
}
