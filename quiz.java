import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        // grupo: eduardo, mohamad, mateus, lucca e rafael
        Scanner sc = new Scanner(System.in);

            int respotasCorretas = 0, pontos = 0, acertosConsecutivos = 0, resposta;

            System.out.println("Pergunta 1:");
            System.out.println(
                    "Qual é o jogo eletrônico mais vendido da franquia 'Grand Theft Auto'? \n1)Grand Theft Auto |||\n2)Grand Theft Auto: San Andreas\n3)Grand Theft Auto V\n4)Grand Theft Auto IV\n5)Grand Theft Auto: Vice City");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 2:");
            System.out.println(
                    "Em que ano foi lançado o jogo 'The legend of Zelda: Ocarina of Time'?\n1)1996\n2)1998\n3)2000\n4)2002\n5)1997");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 3:");
            System.out.println(
                    "Qual é o nome do protagonista do jogo 'Assassin's creed Origins' ?\n1)Ezio Auditore\n2)Connor Kenway\n3)Altair Ibn-La'Ahad\n4)Edward Kenway\n5)Bayek of Siwa");
            resposta = sc.nextInt();
            if (resposta == 5) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 4:");
            System.out.println(
                    "Qual é o jogo que apresenta um mundo aberto onde os jogadores podem explorar e sobreviver após um apocalipse zumbi?\n1)Dead Space\n2)Dead Island\n3)Left 4 Dead\n4)Dying Light\n5)Dead Rising");
            resposta = sc.nextInt();
            if (resposta == 4) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 5:");
            System.out.println(
                    "Qual é o nome da empresa de desenvolvimento de jogos eletrônicos responsável pela série 'Half-Life'? \n1)Valve Comporation\n2)Blizzard Entertainment\n3)Rockstar Games\n4)Bethesda Game Studios\n5)Eletronics Arts(EA)");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 6:");
            System.out.println(
                    "Qual é o jogo que apresenta um mundo de blocos e permite que os jogadores construam suas próprias criações? \n1)Roblox\n2)Minecraft\n3)Terraria\n4)Fortnite\n5)The Sims 4");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 7:");
            System.out.println(
                    "Qual é o jogo estilo FPS (First Person Shooter) conhecido por suas competições de esportes eletrônicos (eSports) com cinco jogadores em cada equipe? \n1)Dota 2\n2)Rocket League\n3)Overwatch\n4)Counter Strike:Global Offensive (CS:GO)\n5)League of Legends");
            resposta = sc.nextInt();
            if (resposta == 4) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 8:");
            System.out.println(
                    "Em qual jogo de plataforma o personagem principal é um ouriço azul que corre em alta velocidade? \n1)Super Mario Bros\n2)Crash Bandicoot\n3)Sonic the Hedgehog\n4)Donkey Kong Country\n5)Mega man");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 9:");
            System.out.println(
                    "Qual é o nome do protagonista no jogo 'The Witcher 3: Wild Hunt'?\n1)Geralt of Rivia\n2)Arthas Menethil\n3)Alloy\n4)Joel Miller\n5)Lara Croft");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 10:");
            System.out.println(
                    "Em que jogo de estratégia os jogadores constroem e gerenciam cidades desde a antiguidade até o futuro?\n1)Civilization VI\n2)SimCity\n3)CIties: Skylines\n4)Age of Empires ||\n5)Anno 1800");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 11:");
            System.out.println(
                    "Qual é o jogo de tiro em primeira pessoa que se passa durante uma invasão alienígena na terra\n1)Doom (2016)\n2)Halo: Combat Evolved\n3)Wolfenstein ||: the new Colossus\n4)Resistance: Fall of man\n5)XCOM 2");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 12:");
            System.out.println(
                    "Qual é o jogo de luta que apresenta personagens icônicos como Ryu, Chun-li e Ken?\n1)Mortal Kombat\n2)Tekken\n3)Street Fighter\n4)Super Smash Bros. Ultimate\n5)SoulCalibur VI");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 13:");
            System.out.println(
                    "Em quel jogo de RPG de ação os jogadores podem explorar uma vasta terra de fantasia chamada Skyrim \n1)Dark Souls\n2)The Witcher 3: Wild Hunt\n3)Diablo |||\n4)The Elder Scrolls V\n5)Dragon Age: Inquisition");
            resposta = sc.nextInt();
            if (resposta == 4) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 14:");
            System.out.println(
                    "Qual é o jogo em que os jogadores controlam um detetive em busca de um assassino em série chamado Origami Killer?\n1)L.A. Noire\n2)Heavy Rain\n3)Alan Wake\n4)Fahrenheit (Indigo Prophecy)\n5)Beyound: Two Souls");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 15:");
            System.out.println(
                    "Qual é o nome do jogo que apresenta um universo de ficção científica onde os jogadores podem escolher entre três facções para lutar pelo controle do sistema solar?\n1)No Man's Sky\n2)Destiny 2\n3)Star Wars: Knights of the Old Republic\n4)Warframe\n5)Mass Efect 2");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 16:");
            System.out.println(
                    "Em que jogo de plataforma o jogador assume o papel de um cavaleiro que deve explorar um vasto mundo em busca de desafios e inimigos para derrotar?\n1)Celeste\n2)Shovel Knight\n3)Hollow Knight\n4)Ori and the blind forest\n5)Cuphead");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 17:");
            System.out.println(
                    "Qual é o jogo que apresenta um mundo aberto pós-apocalíptico no qual o jogador pode enfrentar inimigos robóticos e humanos em um deserto devastado?\n1)Horizon Zero Dawn\n2)Far Cry 5\n3)Mad Max\n4)Borderlands 2\n5)The last of Us part II");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 18:");
            System.out.println(
                    "Qual é o nome do jogo de estratégia em tempo real que simula guerras históricas e batalhas épicas?\n1)Company of Heroes 2\n2)Starcraft II\n3)Total war: Three kingdoms\n4)Civilization VI\n5)Age of Empires 2");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 19:");
            System.out.println(
                    "Qual é o jogo que apresenta um mundo aberto em que o protagonista deve caçar e domar dinossauros\n1)Far Cry Primal\n2)Monster Hunter: World\n3)ARK: Survival Evolved\n4)Far Cry 3\n5)Turok: Dinossaur Hunter");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 20:");
            System.out.println(
                    "Em qual jogo de aventura e plataforma o protagonista é um guaxinim chamado Sly Cooper?\n1)Ratchet & Clank\n2)Sly Cooper and the Thievius Raccoonus\n3)A hat in Time\n4)Crash Bandicoot\n5)Spyro the dragon");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 21:");
            System.out.println(
                    "Qual é o nome do jogo que apresenta uma jogabilidade cooperativa em que jogadores interpretam dois irmãos em uma jornada emocionante?\n1)brothers: A tale of two sons\n2)A way out\n3)Unravel two\n4)It takes two\n5)Overcoocked 2");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 22:");
            System.out.println(
                    "Em qual jogo de RPG os jogadores exploram um mundo de fantasia medieval e podem se tornar um guerreiro, mago ou ladrão?\n1)Pillars of Eternity II: Deadfire\n2)Divinity: Original Sin ||\n3)Baldur's gate\n4)The witcher 3: Wild Hunt\n5)Dragon age: Inquisition");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 23:");
            System.out.println(
                    "Qual é o jogo em que o jogador controla um grupo de sobreviventes em uma cidade insfestada de zumbis?\n1)State of Decay 2\n2)Resident Evil 7: Biohazard\n3)Days gone\n4)The last of Us part II\n5)Dead Rising 4");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 24:");
            System.out.println(
                    "Qual é o nome do jogo em que o jogador pode assumir o papel de um Deus e controlar a vida dos habitantes de uma cidade?\n1)SimCity\n2)Cities: Skylines\n3)Age of Empires III\n4)Black & White\n5)Civilization IV");
            resposta = sc.nextInt();
            if (resposta == 4) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 25:");
            System.out.println(
                    "Em que jogo de ação e aventura o jogador assume o papel de uma jovem caçadora chamda Aloy em um mundo pós-apocalíptico habitado por máquinas?\n1)The Witcher 3: Wild Hunt\n2)Ghost of Tsushima\n3)Assassin's creed Odyssey\n4)Horizon zero Dawn\n5)Red dead Redemption 2");
            resposta = sc.nextInt();
            if (resposta == 4) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 26:");
            System.out.println(
                    "Qual é o jogo que apresenta um universo espacial onde os jogadores podem pilotar naves e explorar uma galáxia gerada proceduralmente?\n1)No man's Sky\n2)Elite dangerous\n3)Star citizen\n4)Mass Effect: Andromeda\n5)X4: foundations");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 27:");
            System.out.println(
                    "Em qual jogo de aventura o protagonista é um rapaz chamado Link que deve resgatar a princesa Zelda do vilão Ganondorf?\n1)The legend of Zelda: Twilight princess\n2)The legend of Zelda: Breath of the Wild\n3)The legend of Zelda: The wind Waker\n4)The legend of Zelda: Skyward sword\n5)The legend of Zelda: Alink to the past");
            resposta = sc.nextInt();
            if (resposta == 2) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 28:");
            System.out.println(
                    "Qual é o jogo de mundo aberto onde os jogadores podem construir fortalezas e se defender de zumbis?\n1)7 days to Die\n2)Rust\n3)The forest\n4)DayZ\n5)Conan Exiles");
            resposta = sc.nextInt();
            if (resposta == 1) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            System.out.println("Pergunta 29:");
            System.out.println(
                    "Em qual jogo os jogadores controlam em grupo de crianças com habilidades psíquicas em uma escola para talentosos?\n1)Life is strange\n2)Beyond: Two souls \n3)Psychonauts\n4)Indigo Prophecy (Fahrenheit)\n5)Life is strange 2");
            resposta = sc.nextInt();
            if (resposta == 3) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }
            separa();

            System.out.println("Pergunta 30:");
            System.out.println(
                    "Qual é o jogo em que os jogadores podem controlar uma equipe de espiões com habilidades únicas para realizar missões em todo o mundo?\n1)Splinter Cell: Blacklist\n2)Tom Clancy's Ghost Recon: Wildlands\n3)Hitman 2\n4)rainbow six Siege\n5)XCOM 2");
            resposta = sc.nextInt();
            if (resposta == 5) {
                respotasCorretas = respotasCorretas + 1;
                pontos = pontos + 10;
                System.out.println("Você acertou a pergunta e ganhou 10 pontos, sua pontuação é " + pontos + " pontos");
                acertosConsecutivos = acertosConsecutivos + 1;
                if (acertosConsecutivos == 3) {
                    pontos = pontos + 100;
                    System.out.println("Como você acertou 3 vezes consecutivas você ganhou +100 pontos!");
                    System.out.println("sua nova pontuação é " + pontos + " pontos");
                    acertosConsecutivos = 0;
                }
            } else {
                System.out.println("Resposta errada, sua pontuação é " + pontos);
                acertosConsecutivos = 0;
            }

            separa();

            if (respotasCorretas <= 5) {
                System.out.println(
                        "Parece que você não joga muito\nvocê acertou " + respotasCorretas + " respotas corretas");
            } else if (respotasCorretas > 5 && respotasCorretas <= 10) {
                System.out.println("Pelo menos você conhece alguns jogos\nvocê acertou " + respotasCorretas
                        + " respostas corretas");
            } else if (respotasCorretas > 10 && respotasCorretas <= 20) {
                System.out.println("você está na média, conhece alguns jogos mas não é um expert\nvocê acertou "
                        + respotasCorretas + " respostas corretas");
            } else if (respotasCorretas > 20 && respotasCorretas <= 25) {
                System.out
                        .println("Você é um verdadeiro Gamer\nvocê acertou " + respotasCorretas + " respotas corretas");
            } else if (respotasCorretas > 25) {
                System.out.println(
                        "Se você sabe tudo isso sobre jogos talvez você precise arrumar uma namorada\nvocê acertou "
                                + respotasCorretas + " respostas corretas");
            }
        sc.close();
    }

    public static void separa() {
        System.out.println(
                "===================================================================================================================");
    }
}
