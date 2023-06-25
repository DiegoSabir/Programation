import java.util.InputMismatchException;

public class IncorrectDataException extends InputMismatchException {
    public IncorrectDataException() {
    }

    public IncorrectDataException(String s) {
        super(s);
    }
}
