package com.design.pattern.create.fatcorymethod;

public abstract class MonsterSpawner {

    public Monster spawn(){
        return createMonster();
    }

    protected abstract Monster createMonster();
}
