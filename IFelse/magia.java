package IFelse;

import java.util.Scanner;

class magia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magia;
        int inimigo = 20;
        do {
            System.out.println("O esqueleto está a sua frente, o que você quer fazer? Escolha de (1 até 3)");
            System.out.println("(1) Bola de Fogo");
            System.out.println("(2) Misseis Mágicos");
            System.out.println("(3) Respingo Ácido");
            magia = sc.nextInt();
            switch (magia) {
                case 1: {
                    System.out.println(
                            "Uma faixa brilhante pisca de seu dedo apontado para um ponto que você escolher dentro do alcance e floresce com um rugido baixo em uma explosão de chamas. Cada criatura em um raio de 6 metros deve realizar um teste de resistência de Destreza. Um alvo recebe 8d6 de dano de fogo se falhar na resistência, ou metade desse dano se obtiver sucesso. O fogo se espalha pelas esquinas. Acende objetos inflamáveis na área que não estão sendo usados ou carregados.");
                    int min = 8;
                    int max = 48;
                    System.out.println("Rolando 8d6!");
                    int teste = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    System.out.println(teste + " de dano!");
                    if (magia == 1) {
                        inimigo -= teste;
                        System.out.println("Inimigo ficou com " + inimigo + " de vida!");
                    } else {
                        System.out.println("ERRO!");
                    }
                    break;
                }
                case 2: {
                    System.out.println(
                            "Você cria três dardos brilhantes de força mágica. Cada dardo atinge uma criatura à sua escolha que você possa ver dentro do alcance. Um dardo causa 1d4 + 1 dano de força ao seu alvo. Todos os dardos atacam simultaneamente e você pode direcioná-los para atingir uma criatura ou várias.");
                    int min2 = 4;
                    int max2 = 13;
                    System.out.println("Rolando 3d4 + 1!");
                    int teste2 = (int) Math.floor(Math.random() * (max2 - min2 + 2) + min2);
                    System.out.println(teste2 + " de dano!");
                    if (magia == 2) {
                        inimigo -= teste2;
                        System.out.println("Inimigo ficou com " + inimigo + " de vida");
                    } else {
                        System.out.println("ERRO!");
                    }
                    break;
                }
                case 3: {
                    System.out.println(
                            "Você arremessa uma bolha de ácido. Escolha uma criatura que você possa ver dentro do alcance, ou escolha duas criaturas que você possa ver dentro do alcance que estejam a até 1,5 metro uma da outra. Um alvo deve ter sucesso em um teste de resistência de Destreza ou sofrerá 1d6 de dano de ácido.");
                    int min3 = 1;
                    int max3 = 6;
                    System.out.println("Rolando 1d6!");
                    int teste3 = (int) Math.floor(Math.random() * (max3 - min3 + 1) + min3);
                    System.out.println(teste3 + " de dano!");
                    if (magia == 3) {
                        inimigo -= teste3;
                        System.out.println("Inimigo ficou com " + inimigo + " de vida!");
                    } else {
                        System.out.println("ERRO!");
                    }
                    break;
                }
                default: {
                    System.out.println("Erro!");
                }
            }
        } while (inimigo > 0);
        System.out.println("O inimigo foi eliminado!");
        sc.close();
    }
}
