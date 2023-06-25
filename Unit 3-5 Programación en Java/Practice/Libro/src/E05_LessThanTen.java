/**
 * Read from the keyboard a series of numbers until you get one less than ten.
 */

import java.util.Scanner;

public class E05_LessThanTen {
    public static void askForNumbers(){
        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.println("Introduce a number:");
            number = sc.nextInt();
        } while (number >= 10);
        System.out.println("END");
    }

    public static void main(String args[]){
        askForNumbers();
    }

}