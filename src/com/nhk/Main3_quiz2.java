package com.nhk;

import java.util.Scanner;

public class Main3_quiz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "Hello ";
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < n; i++) {
            String inpt = sc.nextLine();
            ans += inpt;
            if (i < n - 1) {
                ans += ",";
            } else {
                ans += ".";
            }
        }
        System.out.println(ans);
    }
}
