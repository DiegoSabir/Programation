/**
 * Make a program allows you to guess a number.
 * The program generates a random number from one to one hundred.
 * It then asks for numbers and answers whether the number to guess is higher or less than the number introduced.
 * There are 10 attempts to hit the number.
 * When you get the number right, the program tells you how many attempts you’ve made.
 * When the attempts are over, the number is displayed.
 */

import java.util.Scanner;

public class E13_GuessNumbers {
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);

        int attempts = 10;
        int secretnumber = (int)(Math.random()*101);
        int n;

        do {
            System.out.println("Introduce a number:");
            n = sc.nextInt();
            attempts--;
            if (n > secretnumber){
                System.out.println("The number introduced is higher than the secret number");
                System.out.println("You have " + attempts + " attempts left");
            }
            else if (n < secretnumber){
                System.out.println("The number introduced is less than the secret number");
                System.out.println("You have " + attempts + " attempts left");
            }
            else{
                System.out.println("¡CORRECT NUMBER!");
                System.out.println("YOU HAVE SUCCESSFUL IN " + (10 - attempts) + " ATTEMPTS");
            }

        }while(attempts != 0 && n != secretnumber);
    }

    public static void main(String args[]){
        guessNumber();
    }
}
