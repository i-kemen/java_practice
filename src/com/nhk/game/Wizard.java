package com.nhk.game;

public class Wizard implements Life{

    private String name;
    private int hp;
    private int mp;
    private Wand wand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 합니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }


    public int getMp() {
        return mp;
    }



    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp는 0 이상이어야 합니다.");
        }
        this.mp = mp;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사는 지팡이를 반드시 소유해야 합니다.");
        }
        this.wand = wand;
    }


    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
        System.out.println(hero.name + "의 HP를 10 회복했다!");
    }
}

