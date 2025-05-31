package com.design.pattern.structure.decorator;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 500;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",우유";
    }
}
