import java.util.Scanner;
public class Voltorbs {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o raio abaixo:");
      double raio = sc.nextDouble();
      double area = 3.14 * (raio*raio);
      System.out.printf("Area = %.2f%n", area);
      sc.close();
    }
}

