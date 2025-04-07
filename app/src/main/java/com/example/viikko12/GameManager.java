package com.example.viikko12;

public class GameManager {
    private static GameManager gameManager = null;
    private Player player;

    public Player getPlayer() {
        return player;
    }
    public static GameManager getInstance() {
        if(gameManager == null){
            gameManager = new GameManager();
        }
       return gameManager;
    }

}
