package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Freesia;

public class FreesiaFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Freesia();
    }
}
