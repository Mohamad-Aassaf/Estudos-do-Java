package ExerciciosJAVAarray;

import java.util.Scanner;

public class soma_Vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Quantos números você quer digitar: ");
        
            int n = sc.nextInt();
            double media = 0, soma = 0;
            int i;

            double[] vetor = new double[n];
            for(i = 0; i < n; i++){
                vetor[i] = sc.nextDouble();
                soma = soma += vetor[i];
                media = soma / n;
            }
            System.out.printf("\nSOMA = %.2f\n", soma);
            System.out.printf("MEDIA = %.2f\n", media);

            for (i = 0; i < n; i++) {
                System.out.printf("%.1f  ", vetor[i]);
            }

            sc.close();

        } catch (Exception e) {
            sc.close();
             System.out.printf("Erro: %", e.getMessage());
        }
    }
}
