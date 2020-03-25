package by.derzhanvocih.learn.giftComposition;

public class GiftWrap {
    private String color;

    public GiftWrap() {
    }

    public GiftWrap(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "GiftWrap{" +
                "color='" + color + '\'' +
                '}';
    }
}
