import java.util.Scanner;

public class EXEMPLO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double SalárioMensal, Reajuste, SalárioReajustado, SalárioFinal;
        System.out.println("Qual seu salário mensal atual?");
        SalárioMensal = sc.nextDouble();
        System.out.println("Qual será seu reajuste?");
        Reajuste = sc.nextDouble();
        SalárioReajustado = SalárioMensal / 100 * Reajuste;
        SalárioFinal = SalárioReajustado + SalárioMensal;
        System.out.printf("Seu novo salário será de: %.2f", SalárioFinal);
        sc.close();
    }
}