package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.of(2024, 1, 1);
        System.out.println("dt = " + dt);
        for (int i = 0; i < 5; i++) {
            //LocalDate nextDate = dt.plus(2 * i, ChronoUnit.WEEKS);
            LocalDate nextDate = dt.plusWeeks(2 * i);
            System.out.println("날짜 " + (i+ 1) +": " + nextDate);
        }
    }
}
