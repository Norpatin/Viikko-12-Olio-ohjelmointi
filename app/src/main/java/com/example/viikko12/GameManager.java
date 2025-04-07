package com.example.viikko12;

public class GameManager {
    private static GameManager gameManager = null;
    private Player player;
    private Monster monster;
    //private String monsterType;

    public Player getPlayer() {
        return player;
    }
    public static GameManager getInstance() {
        if(gameManager == null){
            gameManager = new GameManager();
        }
       return gameManager;
    }
    public Monster generateMonster() {
        int numberRandom = (int)(Math.random() * 101);
        if ((numberRandom % 2) == 0) {
            Vampire monster = new Vampire();
        }
        else {
            Skeleton monster = new Skeleton();
        }
        return monster;
    }

    public Monster getLatestMonster() {
        return monster;
    }
}
