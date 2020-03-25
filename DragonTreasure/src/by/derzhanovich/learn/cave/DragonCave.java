package by.derzhanovich.learn.cave;

import by.derzhanovich.learn.treasure.Treasure;

import java.util.List;

public class DragonCave {
    private List<Treasure> treasures;

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "treasures=" + treasures +
                '}';
    }
}
