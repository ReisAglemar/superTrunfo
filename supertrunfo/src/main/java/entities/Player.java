package entities;

/**
 *
 * @author reis
 */
public class Player implements ActionsInterface{
    
    private String nane;
    int id;

    public Player(String nane, int id) {
        this.nane = nane;
        this.id = id;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    
    
    
}
