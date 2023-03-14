package com.nhk.game;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    // 연습문제 9-1
    static final int maxHp = 50;
    static final int maxMp = 10;

    // 연습문제 9-2
    // 이 클래스는 new Cleric(“아서스", 40, 5) 와 같이, 이름, HP, MP 를 지정하여 인스턴스화 할 수 있다
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;
    }

    // 이 클래스는 new Cleric(“아서스", 35) 와 같이, 이름과 HP만으로 지정하여 인스턴스화 할 수 있다. 이 때, MP는 최대 MP와 같은 값이 초기화 된다
    Cleric(String name, int hp) {
        this(name, hp, maxMp);
    }

    // 이 클래스는 new Cleric(“아서스") 와 같이 이름만을 지정하여 인스턴스화 할 수 있다. 이 때, HP 와 MP 는 최대 HP와 최대 MP로 초기화 된다
    Cleric(String name) {
        this(name, maxHp, maxMp);
    }

    // 이 클래스는 new Cleric() 과 같이 이름을 지정하지 않는 경우에는 인스턴스화 할 수 없다고 한다. (이름이 없는 성직자는 존재 할 수 없음)
    // 생성자는 가능한 한 중복되는 코드가 없도록 작성한다



    void selfAid() {
        this.mp -= 5;
        this.hp = maxHp;
    }

    int pray(int sec) {


        // 그냥 회복량
        int recoverAmount = sec + new java.util.Random().nextInt(3);
        this.mp += recoverAmount;

        int recoveredMP = (this.mp > maxMp) ? maxMp - (this.mp - recoverAmount) : recoverAmount;

        this.mp = Math.min(this.mp, maxMp);
        // System.out.println(recoveredMP);
        return recoveredMP;
    }
}
