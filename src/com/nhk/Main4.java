package com.nhk;

public class Main4 {

    public static void main(String[] args) {
        int[] scores = {20, 30, 50, 80, 90};

        int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[0];

        int average = sum / scores.length;


        // for (int i = 0; i < scores.length; i++) {
        // sum += scores[i];
        // }

        for (int score : scores) {
            sum += score;
        }
        
     
        

        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 100;
        
        
        a= null; // a가 바라보는 값들을 보지 않겠다, 참조 제거 
        System.out.println(b[0]);
        
        
        System.out.println("총점 : " + sum);
        System.out.println("총점 : " + average);
        
        
        
        
    }

}
