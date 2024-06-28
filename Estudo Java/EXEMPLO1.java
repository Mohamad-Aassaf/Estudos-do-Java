import java.util.Scanner;
import java.net.URI;
import java.awt.Desktop;

class EXEMPLO1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double av1, av2, av3, media; // av = avaliação
    System.out.println(
        "Digite abaixo as notas das 3 Avaliações realizadas uma abaixo da outra. Lembrando de usar virgulas ao invés de pontos.");

    av1 = sc.nextDouble();
    av2 = sc.nextDouble();
    av3 = sc.nextDouble();

    media = (av1 + av2 + av3) / 3;
    System.out.printf("A sua média foi %.1f%n", media);

    if (media >= 6) {
      System.out.println("Parabéns, você foi aprovado! Continue estudando!");
    } else if (media <= 5) {
      System.out.println(
          "Infelizmente você não conseguiu tirar a nota miníma(6), estude mais! Segue um link abaixo para estudos:");
      try {
        URI link = new URI("https://www.youtube.com/watch?v=GUIkwTSgDQM"); // Aula de Lógica Propocional
        Desktop.getDesktop().browse(link);
      } catch (Exception erro) {
      }
    }
    sc.close();
  }
}