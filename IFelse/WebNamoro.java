package IFelse;

import java.util.Scanner;

class WebNamoro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeD, amor;
        System.out.println("Digite 1 sua idade e 2 a idade da outra pessoa:");
        idadeD = sc.nextInt();
        amor = sc.nextInt();
        if (idadeD == amor){
            System.out.println("IDADE IGUAL");
        }
        else if (idadeD > amor){
            System.out.println("MAIS NOVA");
        }
        else if (amor > idadeD){
            System.out.println("MAIS VELHA");
        }
        else {
            System.out.println("ERRO");
        }
        sc.close();
    }
}
