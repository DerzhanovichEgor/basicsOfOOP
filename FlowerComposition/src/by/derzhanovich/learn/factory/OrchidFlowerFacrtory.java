package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Flower;
import by.derzhanovich.learn.flower.Orchid;

public class OrchidFlowerFacrtory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Orchid();
    }
}
