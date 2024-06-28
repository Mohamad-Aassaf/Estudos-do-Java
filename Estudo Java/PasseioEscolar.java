import java.util.Scanner;
public class PasseioEscolar {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double diaria, diariapromo,lucrosempromo,lucrocompromo,arrecadao;
      diaria = sc.nextDouble();
      diariapromo = diaria - ((22 * diaria)/100);
      lucrosempromo = (diaria * 30) * (42 * 0.40);
      lucrocompromo = (diariapromo * 30) * (42 * 0.70);
      arrecadao = lucrocompromo - lucrosempromo;
      System.out.println("Diaria com promoção: " + diariapromo);
      System.out.println("Lucro sem promoção: " + lucrosempromo);
      System.out.println("Lucro com promoção: " + lucrocompromo);
      System.out.println("Arrecadação: " + arrecadao);

      sc.close();
    }
}