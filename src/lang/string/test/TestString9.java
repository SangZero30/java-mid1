package lang.string.test;

import java.util.SortedMap;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] part = email.split("@");
        String part1 = part[0];
        String part2 = part[1];
        System.out.println("ID : " + part1);
        System.out.println("Domain : " + part2);
    }
}
