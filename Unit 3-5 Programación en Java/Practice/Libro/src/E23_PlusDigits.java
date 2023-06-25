/**
 * Make a program that calculates the plus of the digits of a number introduced by keyboard
 */

import java.util.Scanner;

public class E23_PlusDigits {
    public static int plusDigits(int number){
        int plus = 0, rest;
        while (number != 0) {
            rest = number - (number/10) * 10;
            plus = plus + rest;
            number = number/10;
        }
        return plus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a number");
        int n = sc.nextInt();
        System.out.println("The plus of the digits of " + n + " is: " + plusDigits(n));
    }
}
