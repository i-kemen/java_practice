package Main15;

public class Main15_q1 {
    // “NullPointerException 예외를 catch 하였습니다” 를 표시한다
    // “---- stack trace (여기부터) ----” 를 표시한다
    // stack trace 를 표시한다
    // “---- stack trace (여기까지) ----” 를 표시한다

    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 예외를 catch 하였습니다");
            System.out.println("---- stack trace (여기부터) ----");
            e.printStackTrace();
            System.out.println("---- stack trace (여기까지) ----");
        }
    }
}
