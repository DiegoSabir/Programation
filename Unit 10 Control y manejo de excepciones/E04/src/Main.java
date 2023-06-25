import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                showDate();
            }
            catch (IncorrectPositionException ex) {
                System.out.println(ex.getMessage());
            }
            catch (InputMismatchException ex) {
                throw new IncorrectDataException("ERROR IN DATA ENTRY");
            }
        } catch (IncorrectDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void showDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a string:");
        String string = sc.nextLine();
        System.out.println("Introduce a position:");
        int position = sc.nextInt();
        if (position < 0 || position > string.length()-1) {
            throw new IncorrectPositionException("ERROR: INCORRECT POSITION " + position + " ON THE STRING " + string);
        }
        System.out.println("Character Requested: " + string.charAt(position));
    }
}