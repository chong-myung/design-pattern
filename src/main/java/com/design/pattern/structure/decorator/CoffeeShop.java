package com.design.pattern.structure.decorator;

public class CoffeeShop {

    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new Milk(coffee);
        coffee = new Syrup(coffee);
        coffee = new Whip(coffee);

        System.out.println("최종 설명: " + coffee.getDescription());
        System.out.println("최종 가격: " + coffee.getCost());
    }
}
