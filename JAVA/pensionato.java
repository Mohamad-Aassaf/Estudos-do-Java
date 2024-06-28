import java.util.Scanner;

import util.configPensionato;

public class pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados?");
        int q = sc.nextInt();

        configPensionato[] alugar = new configPensionato[10];

        for(int i = 1; i <= q; i++){
            System.out.println();
            System.out.println("Quarto: #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine(); // limpa o buffer
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            alugar[numeroQuarto] = new configPensionato(nome, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < 10; i++){
            if(alugar[i] != null){
                System.out.println(i + ":" + alugar[i]);
            }
        }
        sc.close();
    }
}
