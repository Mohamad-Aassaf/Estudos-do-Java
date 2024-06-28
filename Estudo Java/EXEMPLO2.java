import java.util.Scanner;
public class EXEMPLO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIni; // numeroIni = Número Inicial cujo é o número que servirá de base.
        System.out.println(
                "Por favor, informe um número e eu direi o seu sucessor e o seu antecessor");

        numeroIni = sc.nextInt();

        System.out.println("Número Base: " + numeroIni);
        System.out.printf("SUCESSOR: %d%n", numeroIni + 1);
        System.out.printf("ANTECESSOR: %d%n", numeroIni - 1);
        sc.close();
    }
}
