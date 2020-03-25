package by.derzhanvocih.learn.giftComposition;

import by.derzhanvocih.learn.presents.Present;

import java.util.List;

public class Compose {
    private Present present;
    public void fillGift(List<Sweets> sweets) {
       present = new Present();
       present.setSweets(sweets);
    }

    public void wrapPresent(String color) {
        present.getWrap().setColor(color);
    }

}
