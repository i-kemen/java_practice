package com.nhk.main;

import java.util.Arrays;
import com.nhk.logics.CalcLogic;

public class Main6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] heights = {170, 240, 300, 15, 320};
        Arrays.sort(heights);
        for (int height : heights) {
            System.out.println(height);
        }

        int a = 10;
        int b = 2;

        int total = CalcLogic.add(a, b);
        int delta = CalcLogic.minus(a, b);
        System.out.printf("%03.2f", 33333.141592);
    }

}
