package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Lily;

public class LilyFlowerFactory implements  FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Lily();
    }
}
