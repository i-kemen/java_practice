package com.nhk;

import java.util.Arrays;

public class Main3_quiz {

    public static void main(String[] args) {
//        System.out.println("숫자를 입력하세요");
        int n = new java.util.Scanner(System.in).nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
//            System.out.println("문자열을 입력하세요");
            name[i] = new java.util.Scanner(System.in).nextLine();
        }
        System.out.print("Hello ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(name[i] + ".");
            } else {
                System.out.print(name[i] + ",");
            }
        }
    }
}

