package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Poppy;

public class PoppyFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Poppy();
    }
}
