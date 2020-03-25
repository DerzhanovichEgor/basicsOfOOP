package by.derzhanovich.learn.flower;

import java.util.Objects;

public class Carnation extends Flower{
    private String name;

    public Carnation() {
        name = "Carnation";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Carnation";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carnation)) return false;
        if (!super.equals(o)) return false;
        Carnation carnation = (Carnation) o;
        return Objects.equals(name, carnation.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name);
    }
}
