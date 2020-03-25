package by.derzhanvocih.learn.presents;
import by.derzhanvocih.learn.giftComposition.GiftWrap;
import by.derzhanvocih.learn.giftComposition.Sweets;
import java.util.*;

public class Present {
        private GiftWrap wrap;
        private List<Sweets> sweets;

    public GiftWrap getWrap() {
        return wrap;
    }

    public List<Sweets> getSweets() {
        return sweets;
    }

    public void setWrap(GiftWrap wrap) {
        this.wrap = wrap;
    }

    public void setSweets(List<Sweets> sweets) {
        this.sweets = sweets;
    }
}
