package com.design.pattern.create.fatcorymethod;

public class BattleService {

    public void monsterAttackPlayer(Monster monster, Player player){
        monster.attack(player);
    }
    public void playerAttackMonster(Monster monster, Player player){
        player.attackMonster(monster);
    }
}
