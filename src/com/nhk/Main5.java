package com.nhk;

public class Main5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("메소드를 호출합니다");
        hello("김남훈");
        hello("복순");
        int[] numbers = {1, 2, 3};
        incrementArray(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
            int [] array = makeArray(3);
            for(int i : array) {
                System.out.println(i);
            }
        // printArray(numbers);
        int x = 10;
        int y = 20;
        int result = add(x, y);
        System.out.println(x + "+" + y + "=" + result);
            
        System.out.println("메소드 호출이 종료되었습니다");
        System.out.println(args[0]);
    }

    // void = 반환 값 없음
    public static int add(int x, int y) {
        int result = x + y;
        // System.out.println(x + "+" + y + "=" + result);
        // // %d = 정수
        // // %f = 실수
        // // %s = String
        // System.out.printf("%d + %d = %d\n");
        return result;
    }
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i <newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }


    public static void incrementArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]++;
        }
    }

    public static void hello(String name) {
        System.out.println(name + "씨 안녕하세요~");
    }

}
