package com.nhk;

public class Main3_6 {

    public static void main(String[] args) {
        // 연습문제 3-6
        System.out.println("[숫자 맞추기 게임]");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0~9 사이의 숫자를 입력하세요");
            int num = new java.util.Scanner(System.in).nextInt();
            /* 검토용 난수 출력 
             * System.out.println(ans); */
            if (num == ans) {
                System.out.println("정답!");
                break;
            } else {
                System.out.println("다릅니다");
            }
        }
        System.out.println("게임을 종료합니다");
    }
}

