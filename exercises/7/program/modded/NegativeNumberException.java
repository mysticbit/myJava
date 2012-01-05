/*Creating my own exception: NegativeNumberException */

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {}

    public NegativeNumberException(String msg) {
        super(msg);
    }
}
        
