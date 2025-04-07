package com.example.viikko12;

import java.util.ArrayList;

public abstract class Monster {
    protected int maxLife;
    protected String name;
    private int life;

    private ArrayList<Monster> monsters = new ArrayList<>();
    public Monster(int MaxLife, String Name) {
        maxLife = MaxLife;
        name = Name;
    }

    protected Monster() {
    }

    public void takeDamage(int damage) {
        life -= damage;
        if (life <= 0){
            life = 0;
        }
    }
    public int getLife(){
        return life;
    }
    public String getName(){
        return name;
    }
    public int getMaxLife(){
        return maxLife;
    }

}
