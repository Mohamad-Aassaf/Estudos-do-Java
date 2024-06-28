import java.util.Scanner;
public class AcorridadeMarquinhos {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double p, c, v, r, pkm, Reabastecer, VoltasReabastecer, total;
      p = sc.nextDouble();
      c = sc.nextDouble();
      v = sc.nextDouble();
      r = sc.nextDouble();
      pkm = p/1000;
      VoltasReabastecer = (v/(r + 1));
      Reabastecer = VoltasReabastecer * pkm;
      total = Reabastecer / c;
      System.out.println(total);
      sc.close();
    }
}