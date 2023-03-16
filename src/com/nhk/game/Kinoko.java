package com.nhk.game;

public class Kinoko implements Life {
    // 속성
    int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public char getSuffix() {
        return suffix;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    final int LEVEL = 10;
    // 구분하기 위해서 suffix 사용 예) 버섯 A, 버섯 B
    char suffix;

    public Kinoko(char suffix) {
        this.suffix = suffix;
    }

    public Kinoko() {

    }

    public void attack(Hero hero) {
        System.out.println("키노코 " + this.suffix + " 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }

    public void run() {
        System.out.println("괴물 버섯 " + this.suffix + "는 도망갔다!");

    }

    public void sleepGas(int sec) {}
}
