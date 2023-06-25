/**
 * Make a program that prints and counts the three's multiples to the number introduced by keyboard.
 */

import java.util.Scanner;

public class E18_MultiplesThree {
    public static void multiples(int n){
        System.out.println("Three's multiples up to " + n);
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String arcs[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce up to where you want to count:");
        int number = sc.nextInt();

        multiples(number);
    }
}
