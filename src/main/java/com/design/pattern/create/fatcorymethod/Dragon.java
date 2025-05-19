package com.design.pattern.create.fatcorymethod;

public class Dragon extends Monster {
    public Dragon() {
        this.name="드래곤";
        this.attackPower = 20;
        this.health = 2000;
    }

    @Override
    protected void attack(Player player) {
        System.out.println("드래곤이 불을 뿜습니다!");
        player.takeDamage(attackPower);
    }
}
