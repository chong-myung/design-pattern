package com.design.pattern.create.fatcorymethod;

public class Slime extends Monster{

    public Slime() {
        this.name="슬라임";
        this.attackPower = 5;
        this.health = 90;
    }

    @Override
    public void attack(Player player) {
        System.out.println("슬라임이 튀어오릅니다!");
        player.takeDamage(attackPower);
    }
}
