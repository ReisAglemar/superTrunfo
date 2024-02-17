package com.reis.supertrunfo;

import database.DataBase;
import entities.*;

/**
 *
 * @author reis
 */
public class Supertrunfo {

    public static void main(String[] args) {

        final int NUNBER_OBJECTS = 14;

        DeskCards[] card = new DeskCards[NUNBER_OBJECTS];
        DataBase transferDataBase = new DataBase();

        for (int i = 0; i < NUNBER_OBJECTS; i++) {

            card[i] = new DeskCards(transferDataBase.getMarkNameEngine()[i], transferDataBase.getHorsePower()[i],
                    transferDataBase.getCilynderCapacity()[i], transferDataBase.getMaxSpeed()[i],
                    transferDataBase.getTorque()[i], transferDataBase.getAceleration0a100()[i]);
        }

        for (DeskCards deskCards : card) {
            System.out.println(deskCards.toString());
        }
    }
}
