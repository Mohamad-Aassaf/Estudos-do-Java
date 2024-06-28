package POO.POOEXERCICIOS;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo x;
        x = new Retangulo();

        System.out.println("Entre a largura primeiro e depois altura do retângulo: ");
        x.largura = sc.nextDouble();
        x.altura = sc.nextDouble();

        double area = x.areaRetangulo();
        double perimetro = x.perimetroRetangulo();
        double diagonal = x.diagonalRetangulo();

        System.out.printf("Area do retângulo: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        sc.close();
    }    
}
