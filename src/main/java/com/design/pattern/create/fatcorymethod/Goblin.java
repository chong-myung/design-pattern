package com.design.pattern.create.fatcorymethod;

public class Goblin extends Monster{
    public Goblin() {
        this.name="고블린";
        this.attackPower = 10;
        this.health = 500;
    }

    @Override
    protected void attack(Player player) {
        System.out.println("고블린이 칼을 휘두릅니다!");
        player.takeDamage(attackPower);
    }

}
