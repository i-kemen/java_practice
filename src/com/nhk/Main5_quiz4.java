package com.nhk;

import java.util.Scanner;

public class Main5_quiz4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double triangleArea = calcTriangleArea(3, 4);
        double circleArea = calCircleArea(5);
        System.out.println(triangleArea);
        System.out.println(circleArea);
    }

    public static double calcTriangleArea(double bottom, double height) {
        // 단순계산할떄는 굳이 변수 선언을 하지 않아도 됨
        return bottom * height / 2;
    }

    public static double calCircleArea(double radius) {
        // 단순계산할떄는 굳이 변수 선언을 하지 않아도 됨
        return (Math.pow(radius, 2) * 3.14);
    }
}
