package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Anemone;
import by.derzhanovich.learn.flower.Flower;

public class AnemoneFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Anemone();
    }
}
