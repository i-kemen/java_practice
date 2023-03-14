package com.nhk;

public class Main5_quiz2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        email("안녕하세요. 김남훈님.", "lynshu19@gmail.com", "하나카드를 사랑해주셔서 감사합니다.");
        email("lynshu19@gmail.com", "하나카드를 사랑해주셔서 감사합니다.");
    }

    // 연습문제 5-2
    public static void email(String title, String address, String text) {
        System.out.println(address + "로 " + "메일을 송신합니다.\n" + "제목 : " + title + "\n본문 : " + text);
    }

    // 연습문제 5-3 오버로드
    public static void email(String address, String text) {
        email("제목 없음", address, text);
    }
}
