package com.nhk.main;

import com.nhk.logics.MultiplicationLogic;

public class Main6_quiz2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                int k = MultiplicationLogic.multiple(j, i);
                System.out.printf("%2d * %d = %2d", i, j, k);
            }
            System.out.println();
        }
    }
}
