package Main15;

import java.io.IOException;

public class Main15_q4 {

    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        try {
            throw new IOException("임의로 IOException을 발생시켰습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1); // 비정상 종료 코드 1
        }
    }
}
