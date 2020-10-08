package model;

import model.Weapon;
import model.Location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Weapon swoard = new Weapon.Builder()
                .withType(Weapon.Type.BLADED)
                .withLevel(3)
                .build();

        Location yordan = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();

        Weapon sreyrMann1 = new Weapon.Builder()
                .withType(Weapon.Type.FIREARM)
                .withName("Steyr-Mannlicher STM-556")
                .withDamages(86)
                .withLevel(30)
                .withCost(9700)
                .withLocation(yordan)
                .build();
        Location middleLine = new Location();
        middleLine.setPartName("Middle Line");
        Location lowLine = new Location();
        lowLine.setPartName("Low Line");

        System.out.println(middleLine.equals(lowLine));
        System.out.println(swoard.toString());
        System.out.println(yordan.toString());
        System.out.println(sreyrMann1.toString());

    }
}

