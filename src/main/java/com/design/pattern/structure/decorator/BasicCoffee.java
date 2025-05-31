package com.design.pattern.structure.decorator;

public class BasicCoffee implements Coffee{
    @Override
    public int getCost() {
        return 2000;
    }

    @Override
    public String getDescription() {
        return "기본커피";
    }
}
