package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;
        class LocalPrinter implements Printer {
            int value = 0;


            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        //만약 locaVar의 값을 변경한다면? 다시 캡처해야하 나??
        //  localVar = 10; //컴파일 오류
        //  paramVar = 20; //컴파일 오류
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);

    }
}
