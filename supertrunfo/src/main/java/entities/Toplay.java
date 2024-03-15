package entities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author reis
 */
public class Toplay implements ActionsInterface {

    @Override
    public void chooseAttributeCard(DeskCards cards) {
    }

    @Override
    public void earnCard(DeskCards cards) {
    }

    @Override
    public void loseCard(DeskCards cards) {
    }

    @Override
    public void celebrateVictory() {
    }

    @Override
    public void regretDefeat() {
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
    public void defineWinner(DeskCards[] deskCardsHuman, DeskCards[] deskCardsMachine, int atribute, int indice) {

        switch (atribute) {
            case 1:
                if ((deskCardsHuman[indice].getHorsepower()) > deskCardsMachine[indice].getHorsepower()) {
                    System.out.println("Você ganhou, a máquina tinha " + deskCardsMachine[indice].getHorsepower() + " HP");
                    System.out.println("");
                    System.out.println(deskCardsHuman.length);
                    deskCardsHuman[deskCardsHuman.length -1] = deskCardsMachine[indice];
//                    deskCardsHuman[deskCardsHuman.length - 1] = deskCardsHuman[indice];
                    System.out.println(deskCardsHuman.length);

                } else {
                    System.out.println("Você perdeu, a máquina tinha " + deskCardsMachine[indice].getHorsepower() + " HP");
                    System.out.println("");
                    System.out.println(deskCardsMachine.length);
                    deskCardsMachine[deskCardsMachine.length - 1] = deskCardsHuman[indice];
//                    deskCardsMachine[deskCardsMachine.length - 1] = deskCardsMachine[indice];
                    System.out.println(deskCardsHuman.length);

                }
                break;

            case 2:
                System.out.println(deskCardsHuman[indice].getTorque());
                break;

            case 3:
                System.out.println(deskCardsHuman[indice].getCilynderCapacity());
                break;

            case 4:
                System.out.println(deskCardsHuman[indice].getAcceleration0a100());
                break;

            case 5:
                System.out.println(deskCardsHuman[indice].getMaxSpeed());
                break;
            default:
        }
    }

}
