package com.example.viikko12;

public class Skeleton extends Monster {
    private String[] names = {"Luuranko", "Kallo", "Sky"};
    public Skeleton() {
        super(1, "replece");
        int numberRandom = (int)(Math.random() * 51);
        this.maxLife = numberRandom;
        String nameRandom = names[(int)(Math.random() * names.length)];
        this.name = nameRandom;
        this.life = numberRandom;
    }

}
