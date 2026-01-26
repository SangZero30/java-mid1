package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        System.out.println("seoulTime = " + seoulTime);
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("londonTime = " + londonTime);
        ZonedDateTime newyorkTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("newyorkTime = " + newyorkTime);
    }
}
