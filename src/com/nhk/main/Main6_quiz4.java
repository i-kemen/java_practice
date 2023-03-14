package com.nhk.main;

import java.util.Random;
import java.util.Scanner;

public class Main6_quiz4 {

    public static void main(String[] args) {
        // 반지름이 1인 원 안에 다트를 던져서 원주율 구하기.
        System.out.println("던질 횟수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        long tries = scanner.nextLong();
        int hits = 0;

        for (int i = 0; i < tries + 1; i++) {
            double x = (new Random().nextDouble() * 2) - 1             ;
            double y = (new Random().nextDouble() * 2) - 1;
            double answer = coor(x, y);
            if (answer <= 1) {
                hits += 1;
            }
        }
        // System.out.println(hits);
        double piEstimate =  (double) 4 * hits / tries;
        System.out.println(piEstimate);
    }


    // 좌표로부터 거리 구하는 메소드
    public static double coor(double x, double y) {
        // x = (new Random().nextDouble() * 2) - 1;
        // y = (new Random().nextDouble() * 2) - 1;
        double p = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return p;

    }
}
