package com.nhk;

public class Main4_quiz4 {

    public static void main(String[] args) {
        // 3개짜리 int형 배열 numbers를 준비하시오. 이대 초기화는 각각 3,4,9로 합니다.
        int[] numbers = new int[] {3, 4, 9};

        // 화면에 1자리의 숫자를 입력 해 주세요 라고 표시합니다.
        System.out.println("1자리의 숫자를 입력 해 주세요");

        // int input = new java.util.Scanner(System.in).nextInt(); 대입합니다.
        int input = new java.util.Scanner(System.in).nextInt();

        // input 값이 3,4,9 중 하나와 같다면 "정답!" 이라고 표시합니다.
        for (int newNumbers : numbers) {
            if (input == newNumbers) {
                System.out.println("정답!");
            }
        }
    }
}
