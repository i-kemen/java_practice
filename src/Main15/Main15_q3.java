package Main15;

public class Main15_q3 {

    public static void main(String[] args) {
        String s = "Three";
        int i;

        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            // 변환 오류가 발생한 경우 처리할 코드
            System.out.println("변환 오류가 발생했습니다.");
        }


    }

}
