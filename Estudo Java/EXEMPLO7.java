import java.util.Scanner;

public class EXEMPLO7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double ValorProduto, ProdutoDesconto, ValorFinal;
        System.out.println("Insira abaixo o valor do produto.");
        ValorProduto = sc.nextDouble();
        ProdutoDesconto = ValorProduto / 100 * 9; //9 é o Desconto que foi pedido para colocar no exemplo.
        ValorFinal = ValorProduto - ProdutoDesconto;
        System.out.println("Você conseguiu um desconto de 9%! O produto está custando:" + ValorFinal);

        sc.close();
    }
}