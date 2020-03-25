package by.derzhanvocih.learn.giftComposition;

public class Sweets {

    private String composition;


    public Sweets(String composition) {
        this.composition = composition;
    }


    public String getComposition() {
        return composition;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "composition='" + composition + '\'' +
                '}';
    }
}
