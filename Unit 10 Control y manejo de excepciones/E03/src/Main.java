import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            year();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void year() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el año:");
        int y = sc.nextInt();
        if (y <= 0) {
            throw new IllegalArgumentException("The year cannot be negative");
        }
    }
}