package POO;

import java.util.Locale;
import java.util.Scanner;
// importar a pasta com a classe, aqui não precisa pois está tudo na mesma

public class codeProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto();

        System.out.println("Entre com os parametros do produto: ");
        System.out.print("Nome: ");
        produto1.nome = sc.nextLine();

        System.out.print("Preço: ");
        produto1.preço = sc.nextDouble();

        System.out.print("Quantidade: ");
        produto1.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto1); // public String toString()

        System.out.println();
        System.out.println("Entre com o numero de produdos a serem adicionados: ");
        int quantidade = sc.nextInt();
        produto1.adicionarProduto(quantidade); // faz a atualização da quantidade dentro do objeto produto

        System.out.println("Dados Atualizados: " + produto1);

        System.out.println("Entre com o numero de produdos a serem removidos: ");
        quantidade = sc.nextInt();
        produto1.removerProduto(quantidade);

        System.out.println("Dados Atualizados: " + produto1);
        sc.close();
    }
}
