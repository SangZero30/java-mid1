package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        String arrJoin = "";
        for (String string : arr) {
            arrJoin += string;
        }
        System.out.println(arrJoin.length());
    }
}
