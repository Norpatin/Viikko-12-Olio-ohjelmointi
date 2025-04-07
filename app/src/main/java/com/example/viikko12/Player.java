package com.example.viikko12;

public class Player {
    private int damage;
    private int score;
    public Player(int damage, int score) {
        this.damage = damage;
        this.score = score;
    }

    public void attack(Monster name) {
        name.takeDamage(damage);
        if (name.getLife() == 0) {
            score += 1;
        }
    }

    public int getScore() {
        return score;
    }
}
