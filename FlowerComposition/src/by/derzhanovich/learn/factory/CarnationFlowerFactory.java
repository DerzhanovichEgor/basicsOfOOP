package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Carnation;
import by.derzhanovich.learn.flower.Flower;

public class CarnationFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Carnation();
    }
}
