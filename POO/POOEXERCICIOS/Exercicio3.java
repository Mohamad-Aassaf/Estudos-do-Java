package POO.POOEXERCICIOS;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante3 aluno1 = new Estudante3();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = sc.nextLine();

        System.out.println("Digite as notas tiradas no semestre: ");
        aluno1.nota1 = sc.nextDouble();
        aluno1.nota2 = sc.nextDouble();
        aluno1.nota3 = sc.nextDouble();

        System.out.printf("Nota total: %.2f%n", aluno1.notaTotal());
        if (aluno1.notaTotal() < 60.0){
            System.out.println("FALHOU");
            System.out.printf("PONTOS FALTANDO: %.2f.%n", aluno1.pontosRestantes());
        } else {
            System.out.println("PASSOU! PARABÉNS!");
        }
        sc.close();
    }
}
