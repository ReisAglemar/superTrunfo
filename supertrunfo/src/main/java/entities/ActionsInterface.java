package entities;

/**
 *
 * @author reis
 */
public interface ActionsInterface {
    
    public abstract void chooseAttributeCard(DeskCards cards);
    public abstract void earnCard(DeskCards cards);
    public abstract void loseCard(DeskCards cards);
    public DeskCards[] shuffle(DeskCards[] cards);
    public abstract void celebrateVictory();
    public abstract void regretDefeat();
    public abstract void howManyCards();
    public abstract void defineWinner();
}
