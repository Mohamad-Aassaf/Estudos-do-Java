package ExerciciosRevisão;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ae: ");
        String palavra = sc.next();

        if(ehPalindromo(palavra)){
            System.out.println(palavra + " é um palindromo, olha que bacana");
            sc.close();
            return;       
        } 
        System.out.println(palavra + " não é palindromo kkkkkkk");
        sc.close();
    }

    public static boolean ehPalindromo(String palavra) {
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(palavraInvertida);
    }
}
