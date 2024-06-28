import java.util.Scanner;

public class EXEMPLO8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados, alunos, pirulitos, balas, doces, reprovados;
        System.out.println("Responda as seguintes perguntas e lhe direi a quantidade de doces que terá que comprar para os alunos aprovados.");
        System.out.println("Quantos alunos há na turma?");
        alunos = sc.nextInt();
        System.out.println("Quantos alunos aprovaram ao fim de ano?");
        aprovados = sc.nextInt();

        pirulitos = aprovados * 2;
        balas =  aprovados * 2;
        doces = balas + pirulitos;

        System.out.println("Você terá que comprar " + doces + " doces.");
        System.out.println("Especificamente " + pirulitos + " pirulitos e " + balas + " balas.");
        
        reprovados = alunos - aprovados;
        System.out.println("Infelizmente " + reprovados + " alunos ficaram sem doces.");
        
        //Nota do Programador: Espero que essa história de doces seja verdade! haha

        sc.close();
    }
}