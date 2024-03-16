package com.reis.supertrunfo;

import database.DataBase;
import entities.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author reis
 */
public class Supertrunfo {

    public static void main(String[] args) throws InterruptedException {

        final int NUNBER_OBJECTS = 14,
                MACHINE_ID = 2,
                HUMAN_ID = 1,
                ZERO = 0,
                PHRASES_wINNER = 45,
                PRASES_DEFEAT = 32,
                ATRIBUTES = 5;

        Scanner inputScanner = new Scanner(System.in);
        DeskCards[] card = new DeskCards[NUNBER_OBJECTS];
        String[] phrasesWinner = new String[PHRASES_wINNER];
        String[] phrasesDefeat = new String[PRASES_DEFEAT];
        DataBase transferDataBase = new DataBase();
        Toplay toPlay = new Toplay();
        Player playerHuman = new Player();
        Player playerMachine = new Player();

        for (int i = 0; i < NUNBER_OBJECTS; i++) {

            card[i] = new DeskCards(transferDataBase.getMarkNameEngine()[i], transferDataBase.getHorsePower()[i],
                    transferDataBase.getCilynderCapacity()[i], transferDataBase.getMaxSpeed()[i],
                    transferDataBase.getTorque()[i], transferDataBase.getAceleration0a100()[i]);
        }

        for (int i = 0; i < PHRASES_wINNER; i++) {
            phrasesWinner[i] = (transferDataBase.getPhrasesWinner()[i]);
        }

        for (int i = 0; i < PRASES_DEFEAT; i++) {
            phrasesDefeat[i] = (transferDataBase.getPhrasesDefeat()[i]);
        }

//        for (String phrases : phrasesWinner) {
//            System.out.println(phrases);
//        }
//
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
        int playing = 1;
        int option = 1137;

        //sets players
        playerHuman.newPlayer(inputScanner, HUMAN_ID);
        playerMachine.newPlayer(inputScanner, MACHINE_ID);

        //rules
        System.out.println(welcome(playerHuman, NUNBER_OBJECTS));

        do {

            System.out.println("    Se precisar de ajuda, use o número 7.\n");
            System.out.println("    Sua carta de vez é essa:\n");
            System.out.println(deskCardsHuman[ZERO]);

            if (option == 1137) {
                System.out.println("");
                System.out.println("    SUA VEZ DE JOGAR...");
                System.out.println("Escolha um atributo de sua carta.");
                option = inputScanner.nextInt();
            } else {
                System.out.println("");
                System.out.println("    A MÁQUINA ESTÁ JOGANDO...");
                System.out.println("Máquina escolhe o atributo " + option + " de sua carta.");
                TimeUnit.SECONDS.sleep(5);
            }

            switch (option) {
                case 0://OK exit
                    System.out.println("");
                    System.out.println("Você escolheu SAIR");
                    playing = 0;
                    break;

                case 1: // HP
                    System.out.println("");
                    toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 1, ZERO);

                    // 1 == human winner 
                    if (toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 1, ZERO) == 1) {
                        System.out.println("    VOCÊ GANHOU essa rodada. A máquina tinha " + deskCardsMachine[ZERO].getHorsepower() + " HP");
                        System.out.println("");
                        deskCardsHuman = toPlay.changeDeck(deskCardsHuman);
                        deskCardsHuman = toPlay.earnCard(deskCardsHuman, deskCardsMachine);
                        deskCardsMachine = toPlay.loseCard(deskCardsMachine);
                        System.out.println("    Máquina diz: " + toPlay.regretDefeat(phrasesDefeat, PRASES_DEFEAT) + "!\n\n\n");
                        option = 1137;
                        clearConsole();
                        System.out.println("======================= NOVA RODADA ==============================");
                        

                        // 0 == machine winner
                    } else {
                        System.out.println("    MÁQUINA GANHOU essa rodade ela tinha " + deskCardsMachine[ZERO].getHorsepower() + " HP");
                        System.out.println("");
                        deskCardsMachine = toPlay.changeDeck(deskCardsMachine);
                        deskCardsMachine = toPlay.earnCard(deskCardsMachine, deskCardsHuman);
                        deskCardsHuman = toPlay.loseCard(deskCardsHuman);
                        System.out.println("    Máquina diz: " + toPlay.celebrateVictory(phrasesWinner, PHRASES_wINNER) + "!\n\n\n");
                        System.out.println("    A máquina irá escolher o próximo atributo");
                        option = toPlay.chooseAttributeCard(ATRIBUTES);
                        clearConsole();
                        System.out.println("\n\n\n======================= NOVA RODADA ==============================");
                    }
                    break;

                case 2: // TORQUE
                    System.out.println("");
                    toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 2, ZERO);

                    // 1 == human winner 
                    if (toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 2, ZERO) == 1) {
                        System.out.println("    VOCÊ GANHOU essa rodada. A máquina tinha " + deskCardsMachine[ZERO].getTorque()+ " TORQUE");
                        System.out.println("");
                        deskCardsHuman = toPlay.changeDeck(deskCardsHuman);
                        deskCardsHuman = toPlay.earnCard(deskCardsHuman, deskCardsMachine);
                        deskCardsMachine = toPlay.loseCard(deskCardsMachine);
                        System.out.println("    Máquina diz: " + toPlay.regretDefeat(phrasesDefeat, PRASES_DEFEAT) + "!\n\n\n");
                        option = 1137;
                        clearConsole();
                        System.out.println("======================= NOVA RODADA ==============================");
                        

                        // 0 == machine winner
                    } else {
                        System.out.println("    MÁQUINA GANHOU essa rodade ela tinha " + deskCardsMachine[ZERO].getTorque()+ " TORQUE");
                        System.out.println("");
                        deskCardsMachine = toPlay.changeDeck(deskCardsMachine);
                        deskCardsMachine = toPlay.earnCard(deskCardsMachine, deskCardsHuman);
                        deskCardsHuman = toPlay.loseCard(deskCardsHuman);
                        System.out.println("    Máquina diz: " + toPlay.celebrateVictory(phrasesWinner, PHRASES_wINNER) + "!\n\n\n");
                        System.out.println("    A máquina irá escolher o próximo atributo");
                        option = toPlay.chooseAttributeCard(ATRIBUTES);
                        clearConsole();
                        System.out.println("\n\n\n======================= NOVA RODADA ==============================");
                    }
                    break;

                case 3: // ENGINE SIZE
                    System.out.println("");
                    toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 3, ZERO);

                    // 1 == human winner 
                    if (toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 3, ZERO) == 1) {
                        System.out.println("    VOCÊ GANHOU essa rodada. A máquina tinha " + deskCardsMachine[ZERO].getCilynderCapacity()+ " CILINDRADAS");
                        System.out.println("");
                        deskCardsHuman = toPlay.changeDeck(deskCardsHuman);
                        deskCardsHuman = toPlay.earnCard(deskCardsHuman, deskCardsMachine);
                        deskCardsMachine = toPlay.loseCard(deskCardsMachine);
                        System.out.println("    Máquina diz: " + toPlay.regretDefeat(phrasesDefeat, PRASES_DEFEAT) + "!\n\n\n");
                        option = 1137;
                        clearConsole();
                        System.out.println("======================= NOVA RODADA ==============================");
                        

                        // 0 == machine winner
                    } else {
                        System.out.println("    MÁQUINA GANHOU essa rodade ela tinha " + deskCardsMachine[ZERO].getCilynderCapacity()+ " CILINDRADAS");
                        System.out.println("");
                        deskCardsMachine = toPlay.changeDeck(deskCardsMachine);
                        deskCardsMachine = toPlay.earnCard(deskCardsMachine, deskCardsHuman);
                        deskCardsHuman = toPlay.loseCard(deskCardsHuman);
                        System.out.println("    Máquina diz: " + toPlay.celebrateVictory(phrasesWinner, PHRASES_wINNER) + "!\n\n\n");
                        System.out.println("    A máquina irá escolher o próximo atributo");
                        option = toPlay.chooseAttributeCard(ATRIBUTES);
                        clearConsole();
                        System.out.println("\n\n\n======================= NOVA RODADA ==============================");
                    }
                    break;

                case 4: // ACELL 0 A 100
                    System.out.println("");
                    toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 4, ZERO);

                    // 1 == human winner 
                    if (toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 4, ZERO) == 1) {
                        System.out.println("    VOCÊ GANHOU essa rodada. A máquina tinha " + deskCardsMachine[ZERO].getAcceleration0a100()+ " ACELERAÇÃO");
                        System.out.println("");
                        deskCardsHuman = toPlay.changeDeck(deskCardsHuman);
                        deskCardsHuman = toPlay.earnCard(deskCardsHuman, deskCardsMachine);
                        deskCardsMachine = toPlay.loseCard(deskCardsMachine);
                        System.out.println("    Máquina diz: " + toPlay.regretDefeat(phrasesDefeat, PRASES_DEFEAT) + "!\n\n\n");
                        option = 1137;
                        clearConsole();
                        System.out.println("======================= NOVA RODADA ==============================");
                        

                        // 0 == machine winner
                    } else {
                        System.out.println("    MÁQUINA GANHOU essa rodade ela tinha " + deskCardsMachine[ZERO].getAcceleration0a100()+ " ACELERAÇÃO");
                        System.out.println("");
                        deskCardsMachine = toPlay.changeDeck(deskCardsMachine);
                        deskCardsMachine = toPlay.earnCard(deskCardsMachine, deskCardsHuman);
                        deskCardsHuman = toPlay.loseCard(deskCardsHuman);
                        System.out.println("    Máquina diz: " + toPlay.celebrateVictory(phrasesWinner, PHRASES_wINNER) + "!\n\n\n");
                        System.out.println("    A máquina irá escolher o próximo atributo");
                        option = toPlay.chooseAttributeCard(ATRIBUTES);
                        clearConsole();
                        System.out.println("\n\n\n======================= NOVA RODADA ==============================");
                    }
                    break;

                case 5: // MAX SPEED
                    System.out.println("");
                    toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 5, ZERO);

                    // 1 == human winner 
                    if (toPlay.defineWinner(deskCardsHuman, deskCardsMachine, 5, ZERO) == 1) {
                        System.out.println("    VOCÊ GANHOU essa rodada. A máquina tinha " + deskCardsMachine[ZERO].getMaxSpeed()+ " VELOCIDADE MÁXIMA");
                        System.out.println("");
                        deskCardsHuman = toPlay.changeDeck(deskCardsHuman);
                        deskCardsHuman = toPlay.earnCard(deskCardsHuman, deskCardsMachine);
                        deskCardsMachine = toPlay.loseCard(deskCardsMachine);
                        System.out.println("    Máquina diz: " + toPlay.regretDefeat(phrasesDefeat, PRASES_DEFEAT) + "!\n\n\n");
                        option = 1137;
                        clearConsole();
                        System.out.println("======================= NOVA RODADA ==============================");
                        

                        // 0 == machine winner
                    } else {
                        System.out.println("    MÁQUINA GANHOU essa rodade ela tinha " + deskCardsMachine[ZERO].getMaxSpeed()+ " VELOCIDADE MAXIMA");
                        System.out.println("");
                        deskCardsMachine = toPlay.changeDeck(deskCardsMachine);
                        deskCardsMachine = toPlay.earnCard(deskCardsMachine, deskCardsHuman);
                        deskCardsHuman = toPlay.loseCard(deskCardsHuman);
                        System.out.println("    Máquina diz: " + toPlay.celebrateVictory(phrasesWinner, PHRASES_wINNER) + "!\n\n\n");
                        System.out.println("    A máquina irá escolher o próximo atributo");
                        option = toPlay.chooseAttributeCard(ATRIBUTES);
                        clearConsole();
                        System.out.println("\n\n\n======================= NOVA RODADA ==============================");
                    }
                    break;

                case 6://OK how many cards
                    System.out.println("    Você " + toPlay.howManyCards(deskCardsHuman)
                            + " e a máquina " + toPlay.howManyCards(deskCardsMachine) + ".\n");
                    option = 1137;
                    break;

                case 7: //OK help-me
                    System.out.println("");
                    System.out.println(welcome(playerHuman, NUNBER_OBJECTS));

                    //System.out.println(helpMe(NUNBER_OBJECTS));
                    option = 1137;
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");
                    option = 1137;
            }
        } while (playing != 0);

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
                + "\n\n\n\n" + "            ======= COMANDOS DO JOGO ======="
                + "\n\n- Para jogar escolha um valor entre 0 e 7."
                + "\n\n- O número 0 (zero) encerra o jogo."
                + "\n\n- Os números de 1 a 5 escolhem um atributo de sua carta."
                + "\n\n- O numero 6 informa a quantidade de cartas."
                + "\n\n- O numero 7 informa as regras."
                + "\n\n     ========= Que a luz esteja com você! =========\n\n\n";
    }

    public final static void clearConsole() {

        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");

            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Tratar Exceptions
        }
    }

}
