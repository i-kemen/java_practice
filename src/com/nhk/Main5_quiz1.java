package com.nhk;

public class Main5_quiz1 {

    public static void main(String[] args) {

        System.out.println("자기소개를 합니다.");
        introduceOneself("김남훈", 32, 175.5, "남자");
    }

    public static void introduceOneself(String name, int age, double height, String gender) {
        System.out.print("안녕하세요!" + "저는 " + name + "입니다.\n" + "나이는 " + age + ", 키는 " + height
                + ", 성별은 " + gender + "입니다.");
    }
}
