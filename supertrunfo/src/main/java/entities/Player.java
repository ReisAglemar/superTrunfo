package entities;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class Player {

    private String nane;
    private int id;
    private DeskCards cards;

    public Player() {
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public String getId() {
        return "Jogador -" + id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeskCards getCards() {
        return cards;
    }

    public void setCards(DeskCards cards) {
        this.cards = cards;
    }

    public void newPlayer(Scanner inputScanner, int humanOrMachine) {
        
        if (humanOrMachine == 1 ){
        System.out.println("");
        System.out.println("    Para jogar insira seu nome abaixo. ");
        System.out.println("");
        setNane(inputScanner.nextLine());
        setId(humanOrMachine);
        } else {
            setNane("Thinkpad T14 Opresor");
            setId(humanOrMachine);
        }
    }
}
