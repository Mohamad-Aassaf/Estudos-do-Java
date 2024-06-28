package ExerciciosJAVAarray;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer digitar? ");
        int n = sc.nextInt(); // tamanho do vetor

        double[] array = new double[n]; // declaraçao do vetor

        for(int i = 0; i < n; i++){ 
            array[i] = sc.nextDouble();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < n; i++){ // passará de novo por todos os numeros digitados
            if (array[i] < 0) { // caso o numero que ele passar for negativo, executará a condição
                System.out.println(array[i]);
            }
        }
        sc.close();
    }
}
