import java.util.Scanner;
public class EXEMPLO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anos, meses , dias, idade;
        System.out.println("Digite abaixo à sua idade em anos, meses e dias que converterei tudo para dias.");

        anos = sc.nextInt();
        meses = sc.nextInt();
        dias = sc.nextInt();
        idade = anos * 365 + meses * 30 + dias;

        System.out.println("SEUS DIAS DE VIDA: " + idade);

        sc.close();
    }
}