public class DivisionZeroException extends ArithmeticException{
    public DivisionZeroException() {
    }

    public DivisionZeroException(String s) {
        super(s);
        System.out.println("ERROR: DIVISION BY 0");
    }
}
