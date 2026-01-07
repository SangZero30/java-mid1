package lang.immutable.ex;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate myDate = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate myDate1 = myDate;
        System.out.println("date = " + myDate);
        System.out.println("date = " + myDate1);
        System.out.println("2025 -> date1");
        myDate1= myDate1.withYear(2025);
        System.out.println("date= " + myDate);
        System.out.println("date1= " + myDate1);
    }
}
