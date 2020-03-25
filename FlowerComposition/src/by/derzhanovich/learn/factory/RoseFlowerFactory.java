package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Rose;

public class RoseFlowerFactory implements FlowerFactory{
    @Override
    public Flower createFlower() {
        return new Rose();
    }
}
