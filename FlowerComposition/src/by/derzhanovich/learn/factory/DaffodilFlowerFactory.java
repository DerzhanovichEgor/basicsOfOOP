package by.derzhanovich.learn.factory;

import by.derzhanovich.learn.flower.Daffodil;
import by.derzhanovich.learn.flower.Flower;

public class DaffodilFlowerFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new Daffodil();
    }
}
