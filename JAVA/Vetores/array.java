package Vetores;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt(); // tamanho do array
        double[] array = new double[n]; // declaração do array

        for(int i = 0; i < n; i++){  // for para digitar os valores do array
            array[i] = sc.nextInt();
        }

        double soma = 0;

        for(int i = 0; i < n; i++){ // for que passa por todos os valores digitados no array e soma
            soma += array[i];
        }

        double media = soma / n;
        System.out.println("A média  de altura é: " + media);

        // array = nome da váriavel do vetor; n = tamanho do array fornecido pelo usuario; i = variavel que passa pelas casas do array
        sc.close();
    }
}
