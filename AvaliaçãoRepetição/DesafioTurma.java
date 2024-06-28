package AvaliaçãoRepetição;

/* QUESTÃO 1

// FEITO POR MOHAMAD ASSAF

import java.util.Scanner;

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numerosLidos = 0;
        int paresNoIntervalo = 0;

        while (numerosLidos < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();
            numerosLidos++;

            if (numero % 2 == 0 && ((numero >= 10 && numero <= 50) || (numero >= 100 && numero <= 200))) {
                paresNoIntervalo++;
            }
        }

        System.out.println("Quantidade de números pares no intervalo [10, 50] ou [100, 200]: " + paresNoIntervalo);
        input.close();
    }
}
*/



/* QUESTÃO 2
import java.util.Scanner;

// FEITO POR MOHAMAD ASSAF

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste: ");
        int numCasosTeste = input.nextInt();

        int pessoasComNota10EIdade40Mais = 0;

        for (int i = 1; i <= numCasosTeste; i++) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = input.nextInt();

            System.out.print("Digite a nota atribuída ao filme: ");
            int nota = input.nextInt();

            if (idade >= 40 && nota == 10) {
                pessoasComNota10EIdade40Mais++;
            }
        }

        System.out.println("Número de pessoas com 40 anos ou mais que deram nota 10 ao filme: " + pessoasComNota10EIdade40Mais);
    }
}
*/

/* QUESTÃO 3
import java.util.Scanner;

// FEITO POR MOHAMAD ASSAF

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de golpes: ");
        int numeroDeGolpes = input.nextInt();

        for (int i = 1; i <= numeroDeGolpes; i++) {
            System.out.println("ORA! " + i);
        }
    }
}
*/
/*
import java.util.Scanner;

QUESTÃO 34
// FEITO POR MOHAMAD ASSAF

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o final do intervalo (número inteiro): ");
        int finalIntervalo = input.nextInt();

        System.out.println("Número | Quadrado | Raiz Quadrada");
        System.out.println("--------------------------------");

        for (int i = 1; i <= finalIntervalo; i++) {
            double quadrado = Math.pow(i, 2);
            double raizQuadrada = Math.sqrt(i);
            System.out.printf("%6d | %8.2f | %13.2f%n", i, quadrado, raizQuadrada);
        }
    }
} 
*/

/* QUESTÃO 95
import java.util.Scanner;
// MOHAMAD ASSAF
public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números desejada: ");
        int quantidadeNumeros = input.nextInt();

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int somaValores = 0;
        int quantidadeMaioresIguais20 = 0;
        int quantidadeMaioresIguais10 = 0;
        int quantidadeValoresEntre10e100 = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite um número: ");
            int numero = input.nextInt();

            if (numero > maiorValor) {
                maiorValor = numero;
            }

            if (numero < menorValor) {
                menorValor = numero;
            }

            somaValores += numero;

            if (numero >= 20) {
                quantidadeMaioresIguais20++;
            }

            if (numero >= 10) {
                quantidadeMaioresIguais10++;
            }

            if (numero >= 10 && numero <= 100) {
                quantidadeValoresEntre10e100++;
            }
        }

        double mediaValores = (double) somaValores / quantidadeNumeros;
        double porcentagemMaioresIguais10 = (double) quantidadeMaioresIguais10 / quantidadeNumeros * 100;
        double mediaValoresEntre10e100 = (double) somaValores / quantidadeValoresEntre10e100;

        System.out.println("Maior Valor: " + maiorValor);
        System.out.println("Menor Valor: " + menorValor);
        System.out.println("Soma dos Valores: " + somaValores);
        System.out.println("Média dos Valores: " + mediaValores);
        System.out.println("Quantidade de Números Maiores ou Iguais a 20: " + quantidadeMaioresIguais20);
        System.out.println("Porcentagem de Valores Maiores ou Iguais a 10: " + porcentagemMaioresIguais10 + "%");
        System.out.println("Média dos Valores Entre 10 e 100: " + mediaValoresEntre10e100);
    }
}
*/

/* 
// QUESTÃO 109 MOHAMAD ASSAF
public class DesafioTurma {
    public static void main(String[] args) {
        for (int i = 50; i >= 5; i--) {
            if (i % 2 == 1) { // Verifica se o número é ímpar
                System.out.println(i + " " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
*/

/*

QUESTÃO 16 MOHAMAD ASSAF

import java.util.Scanner;

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste: ");
        int numCasosTeste = input.nextInt();
        input.nextLine();

        String produtoMaiorEstoque = "";
        int maiorEstoque = 0;

        for (int i = 1; i <= numCasosTeste; i++) {
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = input.nextLine();

            System.out.print("Digite a quantidade produzida: ");
            int quantidadeProduzida = input.nextInt();

            System.out.print("Digite a quantidade vendida: ");
            int quantidadeVendida = input.nextInt();
            input.nextLine();

            int estoque = quantidadeProduzida - quantidadeVendida;

            System.out.println("Nome do Produto: " + nomeProduto);
            System.out.println("Quantidade em Estoque: " + estoque);

            if (estoque < 50) {
                System.out.println("Alert!!!");
            }

            if (estoque > maiorEstoque) {
                maiorEstoque = estoque;
                produtoMaiorEstoque = nomeProduto;
            }
        }

        System.out.println("Produto com maior quantidade em estoque: " + produtoMaiorEstoque);
        System.out.println("Quantidade em estoque: " + maiorEstoque);
    }
}
*/

/*
QUESTAO 150. MOHAMAD ASSAF
import java.util.Scanner;

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste: ");
        int numCasosTeste = input.nextInt();

        for (int i = 0; i < numCasosTeste; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();

            int produto = 1;
            int n = 1;

            while (produto < numero) {
                produto = n * (n + 1) * (n + 2);
                n++;
            }

            if (produto == numero) {
                System.out.println("SIM");
            } else {
                System.out.println("NO");
            }
        }
    }
}
 */

 /*
 QUESTÃO 148, MOHAMAD ASSAF
import java.util.Scanner;

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos números deseja processar: ");
        int numNumeros = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha

        int[] numeros = new int[numNumeros];

        for (int i = 0; i < numNumeros; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Tabuadas dos números:");

        for (int i = 0; i < numNumeros; i++) {
            System.out.println("Tabuada de " + numeros[i] + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = numeros[i] * j;
                System.out.println(numeros[i] + " x " + j + " = " + resultado);
            }
        }
    }
}
*/

/* 
// QUESTÃO 145, MOHAMAD ASSAF
import java.util.Scanner;

public class DesafioTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int divisor = input.nextInt();

        int quantidadeDivisiveis = 0;

        for (int i = 92; i <= 1478; i++) {
            if (i % divisor == 0) {
                quantidadeDivisiveis++;
            }
        }

        System.out.println("Quantidade de números divisíveis por " + divisor + " entre 92 e 1478: " + quantidadeDivisiveis);
    }
}
*/