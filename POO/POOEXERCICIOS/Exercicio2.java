package POO.POOEXERCICIOS;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario2 funcionario1 = new Funcionario2();

        System.out.println("Digite os dados abaixo.");
        System.out.println("Nome: ");
        funcionario1.nome = sc.nextLine();

        System.out.println("Salário Bruto: ");
        funcionario1.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        funcionario1.imposto = sc.nextDouble();

        System.out.println("Empregado: " + funcionario1);

        System.out.println("Qual a porcentagem do aumento? ");
        double porcentagem = sc.nextDouble();
        funcionario1.aumentarSalario(porcentagem);

        System.out.println("Dados atualizados: " + funcionario1);
        sc.close();
    }
}
