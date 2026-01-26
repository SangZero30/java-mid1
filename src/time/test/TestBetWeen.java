package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetWeen {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        System.out.println("시작날짜 : " + startDate);
        System.out.println("목표날짜 = " + endDate);
        Period period = Period.between(startDate, endDate);
        System.out.println("period = " + period);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("남은기간: "  + period.getYears() + " 년 " + period.getMonths() + " 개월 " + period.getDays() + " 일 " );
        System.out.println(" 디데이 : " + daysBetween  + " 일 남음");
    }
}
