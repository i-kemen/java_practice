package BookRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Rent {
    private String memberName;
    private String bookName;
    private String checkoutDate;
    private String returnDate;
    private int renewCount = 0; // 대출 연장 횟수를 저장하는 변수 추가
    private static final int MAX_RENEW_COUNT = 1; // 최대 연장 횟수 상수 추가
    private static final int RENEW_PERIOD = 7; // 연장 기간 상수 추가

    //getter setter



    public Rent(String memberName, String bookName, String checkoutDate, String returnDate, int renewCount) {
        this.memberName = memberName;
        this.bookName = bookName;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.renewCount = renewCount;
    }

    public boolean renew() throws ParseException {
        if (renewCount < MAX_RENEW_COUNT) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(returnDate));
            calendar.add(Calendar.DATE, RENEW_PERIOD);
            this.returnDate = dateFormat.format(calendar.getTime());
            renewCount++;
            return true;
        }
        return false;
    }


}
