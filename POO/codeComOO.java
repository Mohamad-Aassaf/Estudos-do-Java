package POO;
import java.util.Locale;
import java.util.Scanner;
// importar a pasta com a classe, aqui não precisa pois está tudo na mesma

// Ler triangulo x e y

public class codeComOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo(); // Chama a classe Triangulo
        y = new Triangulo();

        System.out.println("Entre as medidas do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre as medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area(); // Chama o calculo na classe triangulo para as variaveis
        double areaY = y.area();

        System.out.printf("Area do Triangulo X: %.4f%n ", areaX); // Print f pois é formatado: %.4f%n mostra 4 casas decimais e pula uma linha
        System.out.printf("Area do Triangulo Y: %.4f%n ", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é : X");
        } else {
            System.out.println("Maior área é : Y");
        }
        sc.close();
    }
}
