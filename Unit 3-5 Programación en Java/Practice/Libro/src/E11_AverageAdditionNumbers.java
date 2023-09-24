/**
 * Make a program that asks for numbers until a zero is introduced.
 * It must print the addition and average of all entered numbers introduced.
 */

import java.util.Scanner;

public class E11_AverageAdditionNumbers {
    public static float additionNumbers(){
        Scanner sc = new Scanner(System.in);

        int number;
        int counter = 0;
        int addition = 0;
        float average;

        do {
            System.out.println("Introduce a number");
            number = sc.nextInt();
            addition += number;
            counter++;
        }
        while(number != 0);

        average = (float) addition / counter;

        return average;
    }


    public static void main(String args[]){
        System.out.println("Average: " + additionNumbers());
    }
}
