package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Chrysanthemum;
import by.derzhanovich.learn.flower.Flower;

public class ChrysanthemumFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Chrysanthemum();
    }
}
