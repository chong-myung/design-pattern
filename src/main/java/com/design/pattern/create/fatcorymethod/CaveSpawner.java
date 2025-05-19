package com.design.pattern.create.fatcorymethod;

public class CaveSpawner extends MonsterSpawner{

    @Override
    protected Monster createMonster() {
        return new Goblin();
    }
}
