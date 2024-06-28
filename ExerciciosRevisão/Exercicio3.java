package ExerciciosRevisão;

import java.util.*;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jailson Mendes pede pra você a peça, digite as informações dela:");
        System.out.println("Qual o código da peça?");
        int numPeca = sc.nextInt();
        System.out.println("Quantas peças você quer? ");
        int quantPeca = sc.nextInt();
        System.out.println("Qual o valor unitário da peça? ");
        int precoPeca = sc.nextInt();

        System.out.println("Jailson Mendes pede pra você OUTRA peça, digite as informações dela:");
        System.out.println("Qual o código da peça?");
        int numPeca2 = sc.nextInt();
        System.out.println("Quantas peças você quer? ");
        int quantPeca2 = sc.nextInt();
        System.out.println("Qual o valor unitário da peça? ");
        int precoPeca2 = sc.nextInt();

        System.out.println("Código da peça 1: " + numPeca);
        System.out.println("Código da peça 2: " + numPeca2);
        System.out.println("Valor a pagar pelas peças 1: " + (quantPeca * precoPeca));
        System.out.println("Valor a pagar pelas peças 2: " + (quantPeca2 * precoPeca2));
        System.out.println("Valor total: " + ((quantPeca * precoPeca) + (quantPeca2 * precoPeca2)) );

        sc.close();;
    }
}
