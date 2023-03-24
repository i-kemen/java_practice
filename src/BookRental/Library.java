package BookRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {    //호텔
    BookList bookList = new BookList();
    List<Rent> rentlList = new ArrayList<>();   // 예약 목록
    List<MemberList> memberList = new ArrayList<>();       //회원 목록

    public void showAllMemberList() {
        for (MemberList member : memberList) {
            System.out.println(member);
        }
    }




    public Date transformDate(String date) {
        SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyy-mm-dd");

        // Date로 변경하기 위해서는 날짜 형식을 yyyy-mm-dd로 변경해야 한다.
        SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");

        java.util.Date tempDate = null;

        try {
            // 현재 yyyymmdd로된 날짜 형식으로 java.util.Date객체를 만든다.
            tempDate = beforeFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // java.util.Date를 yyyy-mm-dd 형식으로 변경하여 String로 반환한다.
        String transDate = afterFormat.format(tempDate);

        // 반환된 String 값을 Date로 변경한다.
        java.sql.Date d = java.sql.Date.valueOf(transDate);

        return d;
    }
}