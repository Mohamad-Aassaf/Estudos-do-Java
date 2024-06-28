package POO.POOEXERCICIOS;

import java.util.Scanner;

public class Conversor {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("What is the dollar price? ");
double dollarPrice = sc.nextDouble();

System.out.print("How many dollars will be bought? ");
double amount = sc.nextDouble();

double result = ConversorMoeda.dollarToReal(amount, dollarPrice);

System.out.printf("Amount to be paid in reais = %.2f%n", result);
sc.close();
}
}