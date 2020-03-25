package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Sunflower;

public class SunflowerFlowerFactory implements FlowerFactory{
    @Override
    public Flower createFlower() {
        return new Sunflower();
    }
}
