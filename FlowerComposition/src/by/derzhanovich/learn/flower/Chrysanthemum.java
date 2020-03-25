package by.derzhanovich.learn.flower;

import java.util.Objects;

public class Chrysanthemum extends Flower {
    private String name;

    public Chrysanthemum() {
        name = "Chrysanthemum";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chrysanthemum";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chrysanthemum)) return false;
        if (!super.equals(o)) return false;
        Chrysanthemum that = (Chrysanthemum) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name);
    }
}
