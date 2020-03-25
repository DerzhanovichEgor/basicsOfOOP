package by.derzhanovich.learn.treasure;

public class PricelessTreasure extends Treasure {
    private int cost;
    public PricelessTreasure(String description, String name) {
        super(description, name);
        this.cost = 999999999;
    }

    @Override
    public String toString() {
        return "Treasure - " +
                " name: " + super.getName() +
                ",\n description: " + super.getDescription();
    }

    @Override
    public int getCost() {
        return cost;
    }
}
