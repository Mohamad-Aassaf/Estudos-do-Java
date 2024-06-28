package ExerciciosRevisão;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o ID do funcionário? (Número)");
        int id = sc.nextInt();
        System.out.println("Qual seu número de horás trabalhadas? ");
        int horas = sc.nextInt();
        System.out.println("Qual o valor que ele recebe por hora?");
        Double valor = sc.nextDouble();

        System.out.println("ID do funcionário: " + id);
        System.out.printf("Salário total deste funcionário: %.2f R$", (valor * horas));

        sc.close();
    }
}
