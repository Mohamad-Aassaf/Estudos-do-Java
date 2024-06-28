import java.util.Scanner;

public class GorjetadeGunther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Gorjeta, TotalConta, Total;
        System.out.println("Coloque abaixo o valor da conta e adicionarei a gorjeta");
        TotalConta = sc.nextDouble();
        Gorjeta = TotalConta / 100 * 10;
        Total = TotalConta + Gorjeta;
        System.out.printf("Total a pagar com gorjeta: R$ %.2f%n", Total);
        sc.close();
    }
}
