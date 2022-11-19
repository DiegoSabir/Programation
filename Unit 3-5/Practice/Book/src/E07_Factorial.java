/**
 * Make a program that calculates the factorial's number.
 */

import java.util.Scanner;

public class E07_Factorial {
    public static int calculateFactorial(int n){
        int factorial = 1;
        int counter = 1;
        do {
            factorial *= counter;
            counter++;
        } while(counter <= n);
        return factorial;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a number:");
        int number = sc.nextInt();

        System.out.println("The factorial's number is " + calculateFactorial(number));
    }
}