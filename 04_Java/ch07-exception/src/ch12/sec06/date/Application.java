package ch12.sec06.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Date date = new Date(); // 舊버전

//        date.setYear(0);    // 1900
//        System.out.println("date = " + date);

        Calendar cal = Calendar.getInstance();
        cal.set(2026,4,23); // 0: 1월

//        System.out.println(cal.getTime());

        // Java Time 패키지
        // LocalTime

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalDate localDate1 = LocalDate.of(2025, 4, 23);
        System.out.println("localDate1 = " + localDate1);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    }
}
