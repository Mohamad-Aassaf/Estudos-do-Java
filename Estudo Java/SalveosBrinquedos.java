import java.util.Scanner;

public class SalveosBrinquedos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double ValorProduto, ProdutoDesconto, ValorFinal;
        System.out.println("Insira abaixo o valor do produto.");
        ValorProduto = sc.nextDouble();
        ProdutoDesconto = ValorProduto / 100 * 9; //9 é o Desconto que foi pedido para colocar no exemplo.
        ValorFinal = ValorProduto - ProdutoDesconto;
        System.out.println("Você conseguiu um desconto de 9%!");
        System.out.printf("Valor final do produto R$ %.2f%n", ValorFinal);
        System.out.printf("Valor original do produto: R$ %.2f%n", ValorProduto);
        System.out.printf("Valor do Desconto: R$ %.2f%n", ProdutoDesconto);

        sc.close();
    }
}