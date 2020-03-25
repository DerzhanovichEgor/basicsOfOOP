package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Tulip;

public class TulipFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Tulip();
    }
}
