package com.nhk.game;

public class Hero {

    // field variable
    // global variable
    // member variable
    // property
    // 국룰은 필드나 멤버, 여기서는 String name과 int hp가 해당
    String name;

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

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Hero.money = money;
    }

    int hp;
    Sword sword;



    static int money;



    // this는 명시적으로 가리키는 것

    // 기본 생성자 primary constructor
    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    Hero(int hp) {
        this("noname", hp);
    }


    void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + "입니다");
    }

    void attack() {
        System.out.println(this.name + "는 공격했다!");
        System.out.println("적에게 5포인트의 데미지를 주었다!");
    }

    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }


    void sit(int sec) {}

    void slip() {}

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
}
