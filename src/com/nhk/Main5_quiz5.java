package com.nhk;

import java.util.Scanner;

public class Main5_quiz5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형 면적 구하기");
        System.out.println("밑변(cm)");
        double bottom = scanner.nextDouble();
        System.out.println("높이(cm)");
        double height = scanner.nextDouble();
        double triangleArea = calcTriangleArea(bottom, height);
        System.out.println("삼각형의 면적은 : " + triangleArea + "㎠");

        System.out.println("원의 면적 구하기");
        System.out.println("반지름(cm)");
        double radius = scanner.nextDouble();
        double circleArea = calCircleArea(radius);
        System.out.println("원의 면적은" + circleArea + "㎠");
    }

    public static double calcTriangleArea(double bottom, double height) {

        return bottom * height / 2;
    }

    public static double calCircleArea(double radius) {

        return Math.pow(radius, 2) * 3.14;
    }
}
