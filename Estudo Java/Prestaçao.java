import java.util.Scanner;
public class Prestaçao {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Double valor, taxa, total;
      int dias;
      System.out.println("Digite o valor, taxa e os dias abaixo:");
      valor = sc.nextDouble();
      taxa = sc.nextDouble();
      dias = sc.nextInt();
      total = valor + (valor * (taxa/100)* dias);
      System.out.println("O valor do aluguel é R$ " + total);
      sc.close();
    }
}