package Arrays;

import java.util.Scanner;

public class Questão102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcoes = 0;
        int program = 1;
        String teste;

        System.out.println("AGENDA DE CONTATOS:");
        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println(" a) Cadastrar um contato; \n b) Buscar um contato pelo nome; \n c) Mostrar aniversáriantes do mês; \n d) Buscar contato pelo telefone; \n e) Mostrar total de cadastros; \n f) Atualizar dados de um cadastro;");
        switch (opcoes) {
            case 'a':
                
            break;
            case 'b':

            break;
            case 'c':

            break;
            case 'd':
            
            break;
            case 'e':

            break;
            case 'f':

            break;
            default:
                break;
        }
        System.out.println("Fazer de novo? S/N");
        teste = sc.next();
        if (teste == "S" || teste == "s"){
            program = 1;
        } else if (teste == "N" || teste == "n") {
            program = 0;
        }
    } while (program == 1);
        sc.close();
    }
}