package com.nhk.game;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    int num = 10;

    public static void solution() {}

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Main8 main = new Main8();
        System.out.println(main.num);
        
        List<Hero> list = new ArrayList<>();
        
        Hero hero = new Hero();
        hero.name = "아이폰";
        list.add(hero);
        System.out.println(list.size());
        
        hero = new Hero();
        hero.name = "갤럭시";
        list.remove(hero);
        System.out.println(list.size());
        
     

        // 가상 세계에 용사를 생성



        Main8.solution();


        Hero hero2 = new Hero("브록시가", 1000000);

        // 생성된 용사에게 최초의 HP 와 이름을 설정
        hero.hp = 100;
        hero.name = "타이";
        System.out.println(hero.name + " : " + hero.hp);

        Hero.money = 100;
        System.out.println(Hero.money);


        Kinoko kinoko1 = new Kinoko();
        kinoko1.hp = 50;
        kinoko1.suffix = 'A';

        Kinoko kinoko2 = new Kinoko();
        kinoko2.hp = 48;
        kinoko2.suffix = 'B';

        Cleric cleric = new Cleric("레오나");



        // 모험의 시작
        hero.slip();
        kinoko1.run();
        kinoko2.run();
        hero.run();
        // 클레릭 행위
        cleric.selfAid();

        cleric.pray(3);

    }
}
