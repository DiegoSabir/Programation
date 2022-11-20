/**
 * Make a program that introduce two numbers by keyboard.
 * Print the numbers between them, count how many there are and how many are even.
 * Calculate the odd's product.
 */

import java.util.Scanner;

public class E20_EvenOddRange {
    public static void evenOddRange(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the initial number:");
        int n1 = sc.nextInt();
        System.out.println("Introduce the final number:");
        int n2 = sc.nextInt();
        int count = 0;
        int even = 0;
        int odd = 1;

        for(int i = n1; i <= n2; i++ ){
            System.out.println(i);
            count++;
            if (i % 2 == 0){
                even++;
            }
            else{
                odd *= i;
            }
        }
        System.out.println("There are " + count + " numbers between them");
        System.out.println("There are " + even + " even numbers");
        System.out.println("The odd's product is " + odd);
    }
    public static void main(String args[]){
       evenOddRange();
    }
}
