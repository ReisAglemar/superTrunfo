package com.reis.supertrunfo;

import database.DataBase;
import entities.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author reis
 */
public class Supertrunfo {

    public static void main(String[] args) {

        final int NUNBER_OBJECTS = 14,
                MACHINE_ID = 2,
                HUMAN_ID = 1,
                ZERO = 0;

        Scanner inputScanner = new Scanner(System.in);
        DeskCards[] card = new DeskCards[NUNBER_OBJECTS];
        DataBase transferDataBase = new DataBase();
        Toplay toPlay = new Toplay();
        Player playerHuman = new Player();
        Player playerMachine = new Player();

        for (int i = 0; i < NUNBER_OBJECTS; i++) {

            card[i] = new DeskCards(transferDataBase.getMarkNameEngine()[i], transferDataBase.getHorsePower()[i],
                    transferDataBase.getCilynderCapacity()[i], transferDataBase.getMaxSpeed()[i],
                    transferDataBase.getTorque()[i], transferDataBase.getAceleration0a100()[i]);
        }

//        for (DeskCards deskCards : card) {
//            System.out.println(deskCards.toString());
//        }
        // shuffle card
        toPlay.shuffle(card);

        // half card
        DeskCards[] deskCardsHuman = toPlay.halfDeskCards(card, NUNBER_OBJECTS, HUMAN_ID);
        DeskCards[] deskCardsMachine = toPlay.halfDeskCards(card, NUNBER_OBJECTS, MACHINE_ID);

        //welcome
        System.out.println("""
                                             _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 
                                    >>>>>>>>|                               |>>>>>>>>
                                    >>>>>>>>|   BEM VINDO AO SUPER TRUNFO   |>>>>>>>>
                                    >>>>>>>>|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|>>>>>>>>
                           """);
        int jogar = 1;
        int opcao;

        //sets players
        playerHuman.newPlayer(inputScanner, HUMAN_ID);
        playerMachine.newPlayer(inputScanner, MACHINE_ID);

        //rules
        System.out.println(welcome(playerHuman, NUNBER_OBJECTS));

        do {

            System.out.println("""
                                    ----------------------------------------------------------
                                                Para jogar escolha um valor
                               
                                    O número 0 encerra o jogo;
                                    Os números de 1 a 5 escolhem um atributo de sua carta;
                                    O numero 6 informa a quantidade de cartas;
                                    O numero 7 informa as regras;
                           """);
            System.out.println(deskCardsHuman[ZERO]);
            System.out.println("");
            System.out.println("Escolha um atributo de sua carta.");
            opcao = inputScanner.nextInt();

            switch (opcao) {
                case 0://OK exit
                    System.out.println("");
                    System.out.println("Você escolheu SAIR");
                    jogar = 0;
                    break;

                case 1:
                    System.out.println("");
                    toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 1, ZERO);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println(deskCardsHuman[ZERO].getTorque());
                    break;

                case 3:
                    System.out.println("");
                    System.out.println(deskCardsHuman[ZERO].getCilynderCapacity());
                    break;

                case 4:
                    System.out.println("");
                    System.out.println(deskCardsHuman[ZERO].getAcceleration0a100());
                    break;

                case 5:
                    System.out.println("");
                    System.out.println(deskCardsHuman[ZERO].getMaxSpeed());
                    break;

                case 6://OK how many cards
                    System.out.println("Você " + toPlay.howManyCards(deskCardsHuman)
                            + " e a máquina " + toPlay.howManyCards(deskCardsMachine) + ".");
                    break;

                case 7: //OK help-me
                    System.out.println("");
                    System.out.println(helpMe(NUNBER_OBJECTS));
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        } while (jogar != 0);

    }

    public static String welcome(Player playerHuman, int numberObjects) {
        System.out.flush();
        return "\n" + playerHuman.getNane() + ", Atente-se as regras"
                + "\n\n" + "            ======= REGRAS DO JOGO ======="
                + "\n\n1- O jogo tem " + numberObjects + " cartas;"
                + "\n\n2- As cartas serão embaralhadas e dividas igualmente;"
                + "\n\n3- O jogo sempre começará por você;"
                + "\n\n4- Você vai ver apenas uma carta por vez e máquina também;"
                + "\n\n5- Ao ver a sua carta, você deve escolher um atributo, de 1 a 5;"
                + "\n\n6- O atributo que você escolher será comparado com o mesmo atributo"
                + "\nda carta que estará com máquina, quem tiver o maior valor ganha a rodada;"
                + "\n\n7- Quem perder terá sua carta tomada pelo vencedor;"
                + "\n\n8- O vencedor terá a vantagem de escolher o atributo na próxima rodada;"
                + "\n\n9- Ganha o jogo quem tiver mais cartas ao final do jogo."
                + "\n\n     ========= Que a luz esteja com você! =========\n";
    }

    public static String helpMe(int numberObjects) {
        return "\n\n" + "            ======= REGRAS DO JOGO ======="
                + "\n\n1- O jogo tem " + numberObjects + " cartas;"
                + "\n\n2- As cartas serão embaralhadas e dividas igualmente;"
                + "\n\n3- O jogo sempre começará por você;"
                + "\n\n4- Você vai ver apenas uma carta por vez e máquina também;"
                + "\n\n5- Ao ver a sua carta você deve escolher um atributo, de 1 a 5;"
                + "\n\n6- O atributo que você escolher será comparado com o mesmo atributo"
                + "\nda carta que estará com máquina, quem tiver o maior valor ganha a rodada;"
                + "\n\n7- Quem perder terá sua carta tomada pelo vencedo;"
                + "\n\n8- O vencedor terá a vantagem de escolher o atributo na próxima rodada;"
                + "\n\n9- Ganha o jogo quem tiver mais cartas quando o jogo for encerrado.\n";
    }
}
