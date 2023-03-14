package com.nhk;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int numer3 = (numer1 * denom2 + numer2 * denom1);
        int denom3 = denom1 * denom2;

        for (int i = Math.min(numer3, denom3); i > 0; i--) {
            if (numer3 % i == 0 && denom3 % i == 0) {
               int p = i;
            
            }
        }

        return answer;
    }
}
