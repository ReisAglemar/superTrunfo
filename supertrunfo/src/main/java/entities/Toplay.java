package entities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author reis
 */
public class Toplay implements ActionsInterface {

    @Override
    public int chooseAttributeCard(int bounds) {
        Random numberRandom = new Random();
        int atribute = numberRandom.nextInt(bounds) + 1;
        //int atribute = 1;
        return atribute;
    }

    @Override
    public DeskCards[] earnCard(DeskCards[] deskCardsWinner, DeskCards[] deskCardsLosser) {

        DeskCards[] deskCardsSwap = new DeskCards[deskCardsWinner.length + 1];

        for (int i = 0; i < deskCardsWinner.length; i++) {
            deskCardsSwap[i] = deskCardsWinner[i];
        }

        deskCardsSwap[deskCardsSwap.length - 1] = deskCardsLosser[0];

        return deskCardsSwap;
    }

    @Override
    public DeskCards[] changeDeck(DeskCards[] deskCardsWinner) {

        DeskCards[] deskCardsSwap = new DeskCards[deskCardsWinner.length];

        for (int i = 0; i < deskCardsWinner.length; i++) {

            if (i != deskCardsWinner.length - 1) {
                deskCardsSwap[i] = deskCardsWinner[i + 1];
            } else {
                deskCardsSwap[i] = deskCardsWinner[0];
            }
        }

        return deskCardsSwap;
    }

    @Override
    public DeskCards[] loseCard(DeskCards[] deskCardsLosser) {

        DeskCards[] deskCardsSwap = new DeskCards[deskCardsLosser.length - 1];

        for (int i = 0; i < deskCardsSwap.length; i++) {
            deskCardsSwap[i] = deskCardsLosser[i + 1];
        }

        return deskCardsSwap;
    }

    @Override
    public String celebrateVictory(String[] phrasesWinner, int prases) {

        Random numberRandom = new Random();

        String message = phrasesWinner[numberRandom.nextInt(prases)];

        return message;
    }

    @Override
    public String regretDefeat(String[] phrasesDefeat, int prases) {
        Random numberRandom = new Random();

        String message = phrasesDefeat[numberRandom.nextInt(prases)];

        return message;
    }

    @Override
    public DeskCards[] shuffle(DeskCards[] cards) {
        List<DeskCards> cardsList = Arrays.asList(cards);
        Collections.shuffle(cardsList);
        cardsList.toArray(cards);
        return cards;
    }

    @Override
    public DeskCards[] halfDeskCards(DeskCards[] cards, int NUNBER_OBJECTS, int id) {

        int halfDesk = NUNBER_OBJECTS / 2;

        if (id == 1) {
            return Arrays.copyOfRange(cards, 0, halfDesk);
        } else if (id == 2) {
            return Arrays.copyOfRange(cards, halfDesk, NUNBER_OBJECTS);
        } else {
            System.out.println("id inválido");
        }

        return new DeskCards[0];
    }

    @Override
    public String howManyCards(DeskCards[] cards) {

        int myCards = cards.length;
        return "tem " + myCards + " cartas";

    }

    @Override
    public int defineWinner(DeskCards[] deskCardsHuman, DeskCards[] deskCardsMachine, int atribute, int indice) {

        int defineWiner = 0;
        
        // 0 = machine winnwer
        // 1 = humana winnwer

        switch (atribute) {
            case 1: // HP
                if ((deskCardsHuman[indice].getHorsepower()) > deskCardsMachine[indice].getHorsepower() /*true*/) {
                    defineWiner = 1;

                } else {
                    defineWiner = 0;
                }
                break;

            case 2: // TORQUE
                if ((deskCardsHuman[indice].getTorque()) > deskCardsMachine[indice].getTorque()/*true*/) {
                    defineWiner = 1;

                } else {
                    defineWiner = 0;
                }
                break;

            case 3: // ENGINE SIZE
                if ((deskCardsHuman[indice].getCilynderCapacity()) > deskCardsMachine[indice].getCilynderCapacity()/*true*/) {
                    defineWiner = 1;

                } else {
                    defineWiner = 0;
                }
                break;

            case 4: // ACELL 0 A 100
                if ((deskCardsHuman[indice].getAcceleration0a100()) < deskCardsMachine[indice].getAcceleration0a100()/*true*/) {
                    defineWiner = 1;

                } else {
                    defineWiner = 0;
                }
                break;

            case 5: // MAX SPEED
                if ((deskCardsHuman[indice].getMaxSpeed()) > deskCardsMachine[indice].getMaxSpeed()/*true*/) {
                    defineWiner = 1;

                } else {
                    defineWiner = 0;
                }
                break;
            default:
        }
        return defineWiner;
    }

}
