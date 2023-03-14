package com.nhk;

public class Main4_quiz3 {

    public static void main(String[] args) {
        // int[] counts = null;
        float[] heights = {171.3F, 175.0F};
        // System.out.println(counts[1]); // 예외발생
        // System.out.println(heights[2]); // 예외발생

        // 수정 예시
        System.out.println(heights[0]);
        System.out.println(heights[1]);
        for (int i = 0; i < heights.length; i++) {
            System.out.println(heights[i]);
        }

    }
}
