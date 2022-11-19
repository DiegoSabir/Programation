/**
 * Make a program that gives 10 integer numbers that are entered by keyboard calculate:
 * - How many are even.
 * - How much is the even's addition,
 * - The odd's average.
 * - The total's addition.
 */

import java.util.Scanner;

public class E17_EvenOdd {
    public static void calculateNumbers(){
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int evenaddition = 0;
        int odd = 0;
        int oddaddition = 0;
        float oddaverage = 0;
        int totaladdition = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Introduce a number:");
            int n = sc.nextInt();

            totaladdition += n;

            if (n % 2 == 0){
                even++;
                evenaddition += n;
            }
            else{
                odd++;
                oddaddition += n;
            }
        }
        oddaverage = oddaddition / odd;

        System.out.println(even);
        System.out.println(evenaddition);
        System.out.println(oddaverage);
        System.out.println(totaladdition);
    }

    public static void main(String args[]){
        calculateNumbers();
    }
}
