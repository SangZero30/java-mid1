package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] s = fruits.split(",");
        for (String string : s) {
            System.out.println(string);
        }

        String joinedString = String.join("->", s);
        System.out.println(joinedString);
    }
}
