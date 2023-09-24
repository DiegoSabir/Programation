/**
 * Make a program that asks for ten numbers and calculated how many positives have been introduced.
 */
import java.util.Scanner;

public class E06_CountPositives {
    public static int countPositives(){
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int number;

        for (int i=0; i < 10; i++){
            System.out.println("Introduce a number:");
            number = sc.nextInt();
            if (number > 0){
                positive++;
            }
        }
        return positive;
    }

    public static void main(String args[]){
        System.out.println("The user introduced " + countPositives() + " positive numbers.");
    }
}