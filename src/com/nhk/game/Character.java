package com.nhk.game;

public abstract class Character {
    private String name;
    private int hp;

    public Character(String name) {
        this.name = name;
        hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }



    public void run() {
        System.out.println(name + "은 도망쳤다!");
    }

    public abstract void attack(Kinoko kinoko);

}
