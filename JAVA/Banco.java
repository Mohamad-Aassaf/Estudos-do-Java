import java.util.Locale;
import java.util.Scanner;

import util.configBanco;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        configBanco conta;

        System.out.println("Entre o com o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Entre com o titular da conta: ");
        sc.nextLine();
        String nomeConta = sc.nextLine();
        System.out.println("Terá algum deposito inicial? s/n");
        char resposta = sc.next().charAt(0); // lê o caractere da variavel resposta, 0 é a primeira letra
        
        if (resposta == 's') {
            System.out.println("Entre com o deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            // não pode declarar  a função dentro do if else pois irá limitará apenas aqui dentro, se precisar de fora do If dará problemas
            conta = new configBanco(numeroConta, nomeConta, depositoInicial);
        } 
        else {
            conta = new configBanco(numeroConta, nomeConta);
        }

        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre um valor de deposito: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);

        System.out.println("Dados atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor de saque: ");
        double retirar = sc.nextDouble();
        conta.retirar(retirar);

        System.out.println("Dados atualizados: ");
        System.out.println(conta);
        sc.close();
    }
}
