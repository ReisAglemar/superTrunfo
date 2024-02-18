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
    public void howManyCards() {
    }

    @Override
    public void defineWinner() {
    }

    @Override
    public DeskCards[] shuffle(DeskCards[] cards){
        List<DeskCards> cardsList = Arrays.asList(cards);
        Collections.shuffle(cardsList);       
        cardsList.toArray(cards);
        return cards;      
    }
}
