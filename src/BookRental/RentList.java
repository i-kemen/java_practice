package BookRental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

public class RentList {
    public Date dateToDelete;

    List<Rent> rentlList = new ArrayList<>();

    public RentList() {
        this.rentlList.add(new Rent("김남훈", "오준석의 생존코딩", "2023-03-20", "2023-03-27", 0));
    }
}

