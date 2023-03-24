package EungYong11;

import java.util.Scanner;

class PrintingThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}


class PrintingThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}


public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("아무거나 입력");
        Scanner scanner = new Scanner(System.in);

        // new PrintingThread().start();
        new Thread(() -> System.out.println("ggg")).start();
       
        

        scanner.nextLine();

    }
}
