package by.derzhanovich.learn.flower;

import java.util.Objects;

public class Anemone extends Flower {
    private String name;

    public Anemone() {
        name = "Anemone";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Anemone";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Anemone)) return false;
        if (!super.equals(o)) return false;
        Anemone anemone = (Anemone) o;
        return Objects.equals(name, anemone.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name);
    }
}
