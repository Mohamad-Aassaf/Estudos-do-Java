import java.util.Scanner;

public class EXEMPLO4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double CotaçãoDolar, VocêQuerLevar;
        System.out.println("Qual à cotação do Dolar Americano para Real atualmente (22/05/2023)?");
        CotaçãoDolar = sc.nextDouble();
        System.out.println("Quantos Doláres você quer guardar? O valor será passado em Reais.");
        VocêQuerLevar = sc.nextDouble();
        System.out.printf("Em reais, você deseja guardar: R$ %.2f%n ", VocêQuerLevar * CotaçãoDolar);
        sc.close();
    }
}
