package com.nhk.game;

public class SuperHero extends Hero {
    private boolean flying;

    public void fly() {
        flying = true;
    }



    @Override
    void run() {
        System.out.println("슈퍼히어로가 빠르게 달립니다.");
    }
}
