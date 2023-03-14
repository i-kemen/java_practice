package com.nhk.game;

public class Kinoko {
    // 속성
    int hp;
    final int LEVEL = 10;
    // 구분하기 위해서 suffix 사용 예) 버섯 A, 버섯 B
    char suffix;

    void attack() {}

    void run() {
        System.out.println("괴물 버섯 " + this.suffix + "는 도망갔다!");

    }

    void sleepGas(int sec) {}
}
