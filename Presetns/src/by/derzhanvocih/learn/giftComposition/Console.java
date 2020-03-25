package by.derzhanvocih.learn.giftComposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    Scanner sc = new Scanner(System.in);

    public void menu(){
        start();
    }

    private void start(){
        Compose compose = new Compose();
        List<String> sweets = new ArrayList<>();
        System.out.println("Insert sweets which you want to put in your present: \n" +
                            "If you put enough of sweet press insert F for exit!");
        while (sc.nextLine().toUpperCase() != "F"){
            //sweets.add(new Sweets());
        }
    }
}
