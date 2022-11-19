/**
 * Write a program that calculates the addition of the first N positive integers.
 * Make methods with different loop.
 */

import java.util.Scanner;

public class E04_AdditionIntegers {
    public static int calculateAdditionDoWhile(int n){
        int addition = 0;
        int counter = 1;
        do {
            addition += counter;
            counter++;
        }while(counter <= n);
        return addition;
    }

    public static int calculateAdditionWhile(int n){
        int addition = 0;
        int counter = 1;
        while (counter <= n){
            addition += counter;
            counter++;
        }
        return addition;
    }

    public static int calculateAdditionFor(int n){
        int addition = 0;
        for (int counter = 1; counter <= n; counter++){
            addition += counter;
        }
        return addition;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce until number calculate:");
        int number = sc.nextInt();

        System.out.println("The addition's result is " + calculateAdditionDoWhile(number));
        System.out.println("The addition's result is " + calculateAdditionWhile(number));
        System.out.println("The addition's result is " + calculateAdditionFor(number));
    }
}
