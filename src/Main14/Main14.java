package Main14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main14 {
    // main() 메소드만 가지는 클래스 Main 을 정의하고, 이하의 순서로
    // **현재의 100일 후의 날짜** 를 “**서기 2011년 09월 24일”** 와 같은 형식으로 표시하시오.
    //
    // 1. 현재의 날짜를 Date 형으로 얻는다
    // 2. 얻은 날짜정보를 Calendar 에 설정한다
    // 3. Calendar 에서 **일(day)** 값을 얻는다.
    // 4. 얻은 값에 100을 더한 값을 Calendar 의 **일** 에 설정한다
    // 5. Calendar 의 날짜정보를 Date 형으로 변환한다
    // 6. SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, day + 100);

        Date futureDate = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String futureDateStr = dateFormat.format(futureDate);
        System.out.println("100일 후 날짜: " + futureDateStr);

    }

}


