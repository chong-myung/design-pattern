package com.design.pattern.create.fatcorymethod;

public class VolcanoSpawner extends MonsterSpawner{
    @Override
    protected Monster createMonster() {
        return new Dragon();
    }
}
