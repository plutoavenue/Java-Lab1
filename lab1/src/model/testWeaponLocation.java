package model;

import model.Weapon;
import model.Location;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class testWeaponLocation {
    @Test(dataProvider = "equalsWeaponObject")
    public void weaponEquals(Weapon weapon1, Weapon weapon2) {
        assertEquals(weapon1, weapon2);
    }

    @DataProvider
    public Object[][] equalsWeaponObject() {
        Location yordan = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();

        Location middleLine = new Location();
        middleLine.setPartName("Middle Line");
        Location lowLine = new Location();
        lowLine.setPartName("Low Line");

        Weapon sreyrMann1 = new Weapon.Builder()
                .withType(Weapon.Type.FIREARM)
                .withName("Steyr-Mannlicher STM-556")
                .withDamages(86)
                .withLevel(30)
                .withCost(9700)
                .withLocation(yordan)
                .build();

        Weapon sreyrMann2 = new Weapon.Builder()
                .withType(Weapon.Type.FIREARM)
                .withName("Steyr-Mannlicher STM-556")
                .withDamages(86)
                .withLevel(30)
                .withCost(9700)
                .withLocation(yordan)
                .build();

        Weapon swoard1 = new Weapon.Builder()
                .withType(Weapon.Type.BLADED)
                .withLevel(3)
                .withLocation(lowLine)
                .build();

        Weapon swoard2 = new Weapon.Builder()
                .withType(Weapon.Type.BLADED)
                .withLevel(3)
                .withLocation(lowLine)
                .build();

        return new Object[][]{{sreyrMann1, sreyrMann2}, {swoard1, swoard2}};
    }

    @Test(dataProvider = "notEqualsWeaponObject")
    public void weaponNotEquals(Weapon weapon1, Weapon weapon2) {
        assertNotEquals(weapon1, weapon2);
    }

    @DataProvider
    public Object[][] notEqualsWeaponObject() {
        Location yordan = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();

        Location middleLine = new Location();
        middleLine.setPartName("Middle Line");

        Location lowLine = new Location();
        lowLine.setPartName("Low Line");

        Weapon sreyrMann1 = new Weapon.Builder()
                .withType(Weapon.Type.FIREARM)
                .withName("Steyr-Mannlicher STM-556")
                .withDamages(86)
                .withLevel(30)
                .withCost(9700)
                .withLocation(yordan)
                .build();

        Weapon sreyrMann2 = new Weapon.Builder()
                .withType(Weapon.Type.FIREARM)
                .withName("Steyr-Mannlicher SSG-08")
                .withDamages(202)
                .withLevel(45)
                .withCost(30000)
                .withLocation(yordan)
                .build();

        Weapon swoard1 = new Weapon.Builder()
                .withType(Weapon.Type.BLADED)
                .withLevel(3)
                .withLocation(lowLine)
                .build();

        Weapon swoard2 = new Weapon.Builder()
                .withType(Weapon.Type.BLADED)
                .withLevel(3)
                .withLocation(middleLine)
                .build();

        return new Object[][]{{sreyrMann1, sreyrMann2}, {swoard1, swoard2}, {sreyrMann1, swoard1}};
    }

    @Test(dataProvider = "equalsLocationObject")
    public void locationEquals(Location location1, Location location2) {
        assertEquals(location1, location2);
    }

    @DataProvider
    public Object[][] equalsLocationObject() {
        Location yordan = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();

        Location yordanSecond = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();


        Location middleLine = new Location();
        middleLine.setPartName("Middle Line");
        Location maddleLineB = new Location.Builder()
                .withPartName("Middle Line")
                .build();

        Location lowLine = new Location();
        lowLine.setPartName("Low Line");
        Location lowLineB = new Location.Builder()
                .withPartName("Low Line")
                .build();

        return new Object[][]{{yordan, yordanSecond}, {middleLine, maddleLineB}, {lowLine, lowLineB}};
    }

    @Test(dataProvider = "notEqualsLocationObject")
    public void notLocationEquals(Location location1, Location location2) {
        assertNotEquals(location1, location2);
    }

    @DataProvider
    public Object[][] notEqualsLocationObject() {
        Location yordan = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();

        Location yordanSecond = new Location.Builder()
                .withKingdom("Yordan")
                .withMainRace(Location.Race.WITCHES)
                .withEnteringLevel(23)
                .withPartName("Ice Prisone")
                .build();


        Location middleLine = new Location();
        middleLine.setPartName("Middle Line");
        Location maddleLineB = new Location.Builder()
                .withPartName("Middle Line")
                .build();

        Location lowLine = new Location();
        lowLine.setPartName("Low Line");
        Location lowLineB = new Location.Builder()
                .withPartName("Low Line")
                .build();

        return new Object[][]{{yordan, middleLine}, {middleLine, yordanSecond}, {lowLine, maddleLineB}};
    }
}

