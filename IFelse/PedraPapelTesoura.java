package IFelse;

import java.util.Scanner;

class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        System.out.println("Pedra(1), Papel(2) ou Tesoura(3)?");
        opcao = sc.nextInt();
        if (opcao == 3){
            System.out.println("PEDRA");
        }
        else if (opcao == 2){
            System.out.println("TESOURA");
        }
        else if (opcao == 1){
            System.out.println("PAPEL");
        }
        else {
            System.out.println("ERRO!");
        }
        sc.close();
    }
}