package ExerciciosRevisão;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5]; // Para 5 nomes

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("\nNomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome + " (" + nome.length() + " letras)");
        }
        sc.close();
    }
}

