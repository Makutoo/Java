package Factory;

public class NoSuchICCException extends RuntimeException{
    public NoSuchICCException(String message) {
        super(message);
    }
}
