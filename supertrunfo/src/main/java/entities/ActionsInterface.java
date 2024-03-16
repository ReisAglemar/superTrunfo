package entities;

/**
 *
 * @author reis
 */
public interface ActionsInterface {

    public abstract int chooseAttributeCard(int bounds); // ok

    public DeskCards[] earnCard(DeskCards[] deskCardsWinner, DeskCards[] deskCardsLosser); // ok

    public DeskCards[] changeDeck(DeskCards[] deskCardsWinner); // ok

    public DeskCards[] loseCard(DeskCards[] deskCardsLosser); // ok

    public DeskCards[] shuffle(DeskCards[] cards); // ok

    public DeskCards[] halfDeskCards(DeskCards[] cards, int NUNBER_OBJECTS, int id); // ok

    public abstract String howManyCards(DeskCards[] cards); // ok

    public abstract String celebrateVictory( String[] phrasesWinner, int phrases); // ok

    public abstract String regretDefeat(String[] phrasesDefeat, int phrases); // ok

    public abstract int defineWinner(DeskCards[] deskCardsHuman, DeskCards[] deskCardsMachine, int atribute, int indice); // ok
}
