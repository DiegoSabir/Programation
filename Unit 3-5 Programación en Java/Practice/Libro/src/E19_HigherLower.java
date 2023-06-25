/**
 * Make a program that prints the higher and lower number of a series of numbers entered by keyboard(
 * If you want to exit, introduce a negative number.
 */

import java.util.Scanner;

public class E19_HigherLower {

    public static void higherLower(){
        Scanner sc = new Scanner(System.in);

        int n;
        int higher = 0;
        int lower = 1000;

        do {
            System.out.println("Introduce a number");
            n = sc.nextInt();
            if (n >= 0){
                if (n > higher) {
                    higher = n;
                }
                if (n < lower){
                    lower = n;
                }
            }
        }while(n > 0);
        System.out.println("The higher number is " + higher + " and the lower is " + lower);
    }

    public static void main(String args[]){
        higherLower();
    }
}
