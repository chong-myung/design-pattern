package com.design.pattern.create.fatcorymethod;

public abstract class Monster  {

    protected String name;
    protected int attackPower;
    protected int health;


    public void takeDamage(int amount){
        health -= amount;
        System.out.println(name+"이(가) " + amount + " 데미지를 입었습니다. 현재 체력: " + health);
        if (health <= 0) {
            System.out.println(name+"이(가) 죽었습니다.");
        }
    }
    protected abstract void attack(Player player);
}
