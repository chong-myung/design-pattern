package com.design.pattern.structure.decorator;

public class Syrup extends CoffeeDecorator{

    public Syrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 400;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",시럽";
    }
}
