/**
 * Make a program that, given a three-digit number, finds out if it’s an Armstrong number.
 */

import java.util.Scanner;

public class E07_ArmstrongNumber {
    public static int armstrongNumber(int n){
        int digit1 = n / 100;
        int digit2 = (n - 100 * digit1) / 10;
        int digit3 = n - 100 * digit1 - 10 * digit2;
        int dat = (int)Math.pow(digit1, 3) + (int)Math.pow(digit2, 3) + (int)Math.pow(digit3, 3);
        if (dat == n) {
            return 1;
        }
        return 0;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a number:");
        int number = sc.nextInt();

        if (armstrongNumber(number) == 1) {
            System.out.println("The number " + number + " is Armstrong");
        }
        else {
            System.out.println("The number " + number + " not is Armstrong");
        }
    }
}