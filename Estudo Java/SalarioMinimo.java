import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double SalarioMin, Salario, QuantidadeDeSalarios;
        System.out.println("Qual o seu salário?");
        Salario = sc.nextDouble();
        System.out.println("Qual é o salário mínimo?");
        SalarioMin = sc.nextDouble();
        QuantidadeDeSalarios = Salario / SalarioMin;
        System.out.printf("Salários mínimos = %.2f%n", QuantidadeDeSalarios);
sc.close();
    }
}
