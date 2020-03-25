package by.derzhanovich.learn.treasure;

public class Treasure {
    private int cost;
    private String description;
    private String name;

    public Treasure() {
    }

    public Treasure(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public Treasure(String description, String name, int cost) {
        this.cost = cost;
        this.description = description;
        this.name = name;
    }

    public int getCost() {

        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "cost=" + cost +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
