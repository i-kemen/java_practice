package com.nhk;

public class Test2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int numer1 = 5;
        int numer2 = 7;
        int denom1 = 4;
        int denom2 = 8;

        int numer3 = (numer1 * denom2 + numer2 * denom1);
        int denom3 = denom1 * denom2;
        int[] arr = new int[Math.min(numer3, denom3)];

        
            if (numer3 % i == 0 && denom3 % i == 0) {
                // mx =
                // System.out.println(i);
                // //1번 방법
                // break;
                // 2번 배열로 담기
                arr[idx++] = i;



                // if(i > mx) mx = i;


            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        // mx
        // System.out.println(mx);
    }
}
