package ExerciciosJAVAarray;

import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas:");

        int n = sc.nextInt();
        int pessoa = 1;

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double soma = 0, media = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + pessoa + "a pessoa.");

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            
            soma = soma += alturas[i];
            media = soma / n;
            pessoa++;
        }

        double nmenores = 0;

	    for (int i=0; i < n; i++) {
	        if (idades[i] < 16) {
	            nmenores++;
	        }
	    }
	    double percentualMenores = (nmenores / n) * 100.0;

        System.out.printf("A média de altura é de: %.2f%n", media);
        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");
        for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }

        sc.close();
    }
}