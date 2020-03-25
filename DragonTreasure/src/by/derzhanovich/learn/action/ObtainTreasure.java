package by.derzhanovich.learn.action;

import by.derzhanovich.learn.cave.DragonCave;
import by.derzhanovich.learn.cave.DragonTreasure;
import by.derzhanovich.learn.treasure.Treasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ObtainTreasure {
    Scanner sc = new Scanner(System.in);

    public void consoleMenu() {
        DragonTreasure treasure = new DragonTreasure();
        DragonCave cave = new DragonCave();
        cave.setTreasures(treasure.fillCaveWithTreasure());


        System.out.println("You have found the Dragon's lair and his treasure,select one:\n" +
                           "1. - Look all treasures?");
        System.out.println("2. - Look 10 random treasures?");
        System.out.println("3. - Look at the most expensive treasure?");
        System.out.println("4. - Choose treasures on given amount?");
        System.out.println("5. - Quick peek at the priceless treasures");

                switch (check(sc.nextLine())) {
                    case "1":
                        seeAllTreasure(cave);
                        break;
                    case "2":
                        seeRandomTreasure(cave);
                        break;
                    case "3":
                        getTheMoreExpensiveTreasure(cave);
                        break;
                    case "4":
                        System.out.println("Enter sum: ");
                        long money = sc.nextInt();
                        chooseTreasure(money, cave);
                        break;
                    case "5":
                        printPricelessTre(cave);
                        break;
                    default:
                        System.out.println("You have chosen nothing, so look at this");
                        printPricelessTre(cave);
                }
    }


    private String check(String s){
        boolean exxit = true;
        while(exxit) {

            if (!s.matches("\\d")) {
                System.out.println("You have inserted wrong value, try again.");
                s = sc.nextLine();
            } else {exxit = false; } }

        return  s;
    }

    private void printPricelessTre(DragonCave cave){
        for (int i = 0; i < cave.getTreasures().size(); i++) {
            if(cave.getTreasures().get(i).getCost() == 999999999){
                System.out.println(cave.getTreasures().get(i));
            }
        }
    }
    public void seeAllTreasure(DragonCave cave){
        for (Treasure i : cave.getTreasures()) {
            System.out.println( i.getName() + ": \nprice: " + i.getCost());
        }
    }

    public void seeRandomTreasure(DragonCave cave){
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rnd.nextInt(cave.getTreasures().size());
            System.out.println(cave.getTreasures().get(n).getName() + ": " +cave.getTreasures().get(i).getDescription() +
                    "." +"\n price: " + cave.getTreasures().get(n).getCost());
        }
    }


    public void getTheMoreExpensiveTreasure(DragonCave cave){
         int max = 10;
         Treasure treasure = cave.getTreasures().get(0);
        for (int i = 0; i <cave.getTreasures().size() ; i++) {
              if(max < cave.getTreasures().get(i).getCost()){
                  max = cave.getTreasures().get(i).getCost();
                  treasure = cave.getTreasures().get(i);
              }
        }
        System.out.println(treasure.getName() + " \nprice: " + treasure.getCost());
    }

    public void chooseTreasure(long fixedCashAmount, DragonCave cave) {
        List<Treasure> chosenTreasures = new ArrayList<>();
        List<Treasure> myTreasure = new ArrayList<>();
        System.out.println("You can choose next treasures: \nYou have:" + fixedCashAmount);

        for (int i = 0; i < cave.getTreasures().size(); i++) {
            if (cave.getTreasures().get(i).getCost() <= fixedCashAmount) {
                chosenTreasures.add(cave.getTreasures().get(i));
                printTreasure(cave.getTreasures().get(i));
            }
        }

        while(fixedCashAmount > 0){
            String item = sc.nextLine();
            System.out.println("Insert treasure you want to obtain");


            for (int i = 0; i < chosenTreasures.size(); i++) {
                if(item.toLowerCase().equals(chosenTreasures.get(i).getName().toLowerCase())){
                    if(chosenTreasures.get(i).getCost()>fixedCashAmount){
                        System.out.println("You haven't got enough money. Try another one");
                    }

                    if(fixedCashAmount - chosenTreasures.get(i).getCost() < 0){
                        break;
                    }
                    fixedCashAmount -= chosenTreasures.get(i).getCost();
                    myTreasure.add(chosenTreasures.get(i));
                    System.out.println("You have " + fixedCashAmount + " left.");


                }
            }


        }
        System.out.println("You have chosen next treasures: ");
        for (Treasure t : myTreasure) {
            System.out.print(t.getName() + ", ");
        }
        }

    static private int count = 1;
    private void printTreasure(Treasure treasure){
        System.out.println(count++ + ". " + treasure.getName() + "- price: " + treasure.getCost());
    }

}
