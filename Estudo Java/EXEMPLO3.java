import java.util.Scanner;

public class EXEMPLO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Quilogramas = 12.00, PesoPrato;
        System.out.println("Informe o Peso do Prato abaixo:");
        PesoPrato = sc.nextDouble();
        System.out.printf("Total a pagar: R$%.2f%n", Quilogramas * PesoPrato );

        sc.close();
    }
}
