/**
 * Write a program that reads three entered numbers and indicates which is the higher of them.
 */
import java.util.Scanner;

public class E02_GetHigherThanThree {
    public static int getHigher(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3){
            return n1;
        }
        else if(n2 > n1 && n2 > n3){
            return n2;
        }
        else{
            return n3;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the first number:");
        int number1 = sc.nextInt();
        System.out.println("Introduce the second number:");
        int number2 = sc.nextInt();
        System.out.println("Introduce the third number:");
        int number3 = sc.nextInt();

        System.out.print("The higher of the three numbers is " + getHigher(number1, number2, number3));
    }

}