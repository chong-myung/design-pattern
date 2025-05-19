package com.design.pattern.create.fatcorymethod;

public class ForestSpawner extends MonsterSpawner{
    @Override
    protected Monster createMonster() {
        return new Slime();
    }
}
