package ExerciciosRevisão;
import java.util.*;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita um numero pra eu fatorar ae bundão: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
        sc.close();
    }
}
