package entities;

/**
 *
 * @author reis
 */
public interface ActionsInterface {

    public abstract void chooseAttributeCard(DeskCards cards);

    public abstract void earnCard(DeskCards cards);

    public abstract void loseCard(DeskCards cards);

    public DeskCards[] shuffle(DeskCards[] cards); //ok

    public DeskCards[] halfDeskCards(DeskCards[] cards, int NUNBER_OBJECTS, int id); //ok

    public abstract String howManyCards(DeskCards[] cards); //ok

    public abstract void celebrateVictory();

    public abstract void regretDefeat();

    public abstract void defineWinner(DeskCards[] deskCardsHuman, DeskCards[] deskCardsMachine, int atribute, int indice);
}
