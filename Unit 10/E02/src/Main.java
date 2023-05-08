import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        int n1 = 0, n2 = 0;
        boolean validNumbers = true;
        do {
            sc = new Scanner(System.in);
            try {
                try {
                    System.out.println("Introduce the first number:");
                    n1 = sc.nextInt();

                    System.out.println("Introduce the second number:");
                    n2 = sc.nextInt();

                    validNumbers = true;
                }
                catch (InputMismatchException e){
                    throw new IncorrectDataException("ERROR");
                }
            }
            //InputMismatchException = Excepcion producida cuando la entrada de datos no coincide con el tipo de datos esperado.
            catch (InputMismatchException e) {
                System.out.println("The data introduced are not numbers");
                validNumbers = false;
            }
        }
        while (!validNumbers);

        System.out.println("Introduce the operation:");
        String operation = sc.next();

        switch (operation.toLowerCase()) {
            case "addition":
                result = addition(n1, n2);
                break;
            case "subtraction":
                result = subtraction(n1, n2);
                break;
            case "multiplication":
                result = multiplication(n1, n2);
                break;
            case "division":
                try {
                    result = division(n1, n2);
                }
                //ArithmeticException = Excepcion producida cuando se intenta realizar una operación aritmética no válida
                catch (ArithmeticException ex) {
                    System.out.println("A number cannot be divided by 0");
                }
                catch (Exception ex) {
                    System.out.println("ERROR " + ex.getMessage());
                }
                break;
            case "power":
                result = power(n1, n2);
                break;
        }
        System.out.println("Result: " + result);
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    public static double power(int number1, int number2) {
        return Math.pow(number1, number2);
    }
}