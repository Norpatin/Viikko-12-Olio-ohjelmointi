package com.example.viikko12;

public abstract class Monster {
    private int maxLife;
    private String name;
    private int life;
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
