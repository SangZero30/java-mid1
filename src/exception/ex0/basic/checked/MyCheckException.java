package exception.ex0.basic.checked;

/* Exception을 상속받은 예외는 체크 예외가 된다.

*/
public class MyCheckException extends Exception{
    public MyCheckException(String message) {
        super(message);
    }
}
