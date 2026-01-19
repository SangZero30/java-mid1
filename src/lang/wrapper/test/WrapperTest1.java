package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int num = Integer.parseInt(str1);
        int num1 = Integer.parseInt(str2);

        int sum = num + num1;
        System.out.println("두수의 합 : " + sum);

    }
}
