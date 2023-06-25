/**
 * Write a program that, given 2 input values, always prints the division of the higher by the lower.
 */
import java.util.Scanner;

public class E01_HigherLowerDivision {
    public static float division(int n1, int n2){
        float result;
        if (n1 > n2){
            result = n1 / n2;
        }else{
            result = n2 / n1;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the first number:");
        int number1 = sc.nextInt();
        System.out.println("Introduce the second number:");
        int number2 = sc.nextInt();

        System.out.println("The division result is " + division(number1, number2));
    }
}