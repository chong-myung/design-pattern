package com.design.pattern.create.fatcorymethod;

public class Player {
    private int health;
    private int attackPower;

    public Player(int health,int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println("플레이어가 " + amount + " 데미지를 입었습니다. 현재 체력: " + health);
        if (health <= 0) {
            System.out.println("플레이어가 사망했습니다!");
        }
    }

    public void attackMonster(Monster monster){
        monster.takeDamage(attackPower);
    }

    public int getHealth() {
        return health;
    }

}
