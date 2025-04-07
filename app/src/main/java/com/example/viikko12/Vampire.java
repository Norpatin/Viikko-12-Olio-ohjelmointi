package com.example.viikko12;

public class Vampire extends Monster {

    private String[] names = {"Vampyyri", "Edgard", "Vinsent"};
    public Vampire() {
        super(1, "replece");
        //super((int)(Math.random() * 51), "");
        int numberRandom = (int)(Math.random() * 51);
        this.maxLife = numberRandom;
        String nameRandom = names[(int)(Math.random() * names.length)];
        this.name = nameRandom;
        this.life = numberRandom;

    }

}
