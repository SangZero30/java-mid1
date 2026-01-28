package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // x001
        InnerOuter.Inner inner = outer.new Inner(); //xx001 안에 Inner를 만들어
        inner.print();


        System.out.println("innerClass = " + inner.getClass());

    }
}
