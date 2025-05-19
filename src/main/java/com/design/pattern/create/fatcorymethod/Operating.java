package com.design.pattern.create.fatcorymethod;

public class Operating {
    public static void main(String[] args) {
        Player player = new Player(100,100);
        // 슬라임 생성
        CaveSpawner spawner  = new CaveSpawner();
        Monster monster = spawner.createMonster();

        BattleService battleService = new BattleService();
        battleService.monsterAttackPlayer(monster,player);
        battleService.playerAttackMonster(monster,player);
        battleService.playerAttackMonster(monster,player);
    }


}
