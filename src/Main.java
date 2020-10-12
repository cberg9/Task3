

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printHeroDetails
            (ArrayList<Hero> l) {
        for (Hero i : l) {
            System.out.println(i.getName() + " Details:");
            if (i instanceof Mage) {
                System.out.println(i.displayStats());
                System.out.println();

            } else if (i instanceof Ranger) {
                System.out.print(i.displayStats());
                System.out.println();

            } else if (i instanceof Warrior) {
                System.out.print(i.displayStats());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Item> weaponList = new ArrayList<>();
        ArrayList<Hero> heroList = new ArrayList<>();
        ArrayList<Item> armorList = new ArrayList<>();

        Mage mage1 = null;
        Ranger ranger1 = null;
        Warrior warrior1 = null;

        System.out.println("Name of the character?");
        String inputName = scan.next();

        System.out.println("Chose your character:");
        System.out.println("1. Mage!");
        System.out.println("2. Ranger!");
        System.out.println("3. Warrior!");
        int inputChoice = scan.nextInt();

        if (inputChoice == 1) {
            mage1 = new Mage(inputName);
            heroList.add(mage1);
        } else if (inputChoice == 2) {
            ranger1 = new Ranger(inputName);
            heroList.add(ranger1);
        } else if (inputChoice == 3) {
            warrior1 = new Warrior(inputName);
            heroList.add(warrior1);

        }

        printHeroDetails(heroList);

        int anotherChoice;
        int giveExp;

        do {
            System.out.println();
            System.out.println("=======================");
            System.out.println("1. Add some random weapons and armor");
            System.out.println("2. Give xp to Hero");
            System.out.println("3. Equip weapon");
            System.out.println("4. Equip Armor");
            System.out.println("5. Item stats");
            System.out.println("6. View current stats");
            System.out.println("7. Quit");
            Scanner scanner = new Scanner(System.in);
            anotherChoice = scanner.nextInt();
            if (anotherChoice == 1) {
                Weapon axeofthegreat = new Weapon("Axe of the great", "axe", 10, 15,0, true, false);
                Weapon longbowofthelonewolf = new Weapon("Long Bow of the Lone Wolf", "bow", 10, 0,5, false, true);
                Armor clothleggingsofthemagi = new Armor("Cloth Leggings of the Magi", 1, 36, 6, 13, false, false, true, false, false, true);
                weaponList.add(axeofthegreat);
                weaponList.add(longbowofthelonewolf);
                armorList.add(clothleggingsofthemagi);
                for (Item i : weaponList) {
                    System.out.println(i.getItemName() + ", was added");
                }
                for (Item i : armorList) {
                    System.out.println(i.getItemName() + ", was added");
                }

            } else if (anotherChoice == 2) {
                System.out.print("How much xp do you want to give?");
                giveExp = scanner.nextInt();

                if (mage1 != null && ranger1 == null || mage1 != null && warrior1 == null) {
                    mage1.gainXp(giveExp);
                    System.out.println("Level " +mage1.getLevel());
                    System.out.println(mage1.getXpNextLvl()+"to next level.");

            }
                if (ranger1 != null && mage1 == null || ranger1 != null && warrior1 == null) {
                    ranger1.gainXp(giveExp);
                    System.out.println("Level " +ranger1.getLevel());
                    System.out.println(ranger1.getXpNextLvl()+"to next level.");
                    }
                    if (warrior1 != null && ranger1 == null || warrior1 != null && ranger1 == null) {
                        warrior1.gainXp(giveExp);
                        System.out.println("Level " +warrior1.getLevel());
                        System.out.println(ranger1.getXpNextLvl()+"to next level.");

                        }

        } else if (anotherChoice == 3) {

        } else if (anotherChoice == 4) {

        } else if (anotherChoice == 5) {

        } else if (anotherChoice == 6) {
                printHeroDetails(heroList);
        }

    }while(anotherChoice< 7);{
        System.out.println("Goodbye!");
    }
}

}












