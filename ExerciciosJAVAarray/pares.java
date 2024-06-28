package ExerciciosJAVAarray;

import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você irá digitar? ");
        int n = sc.nextInt(); // usuario digita
        int[] numeros = new int[n]; //tamannho do array definido pelo usuario
        int pares = 0; // quantidade de pares = 0 pois não há numero digitado ainda

        for(int i = 0; i < n; i++){ // repetição for classica
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt(); //a variavel numeros(Cujo é o array)
            if(numeros[i] % 2 == 0){
                pares++;
            }
        }

        System.out.print("NUMEROS PARES: ");
        for(int i = 0; i < n; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
            }
        }
        
        System.out.println();
        System.out.println("Quantidade de pares: " + pares);
        sc.close();
    }
}

