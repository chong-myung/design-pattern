package com.design.pattern.structure.decorator;

public class Whip extends CoffeeDecorator{

    public Whip(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 700;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",휘핑";
    }
}
