package exception.ex0.basic.checked;

public class Service {
    Client client = new Client();

    /*
     * 예외를 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckException e) {
            //예외 처리 로직
            System.out.println("예외 처리 , manager = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /*
     *체크를 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 덙지라면 throws 예외를 메서드에 필수로 선언해야 한다.
     */
    public void catchThrow() throws MyCheckException{
        client.call();
    }
}
