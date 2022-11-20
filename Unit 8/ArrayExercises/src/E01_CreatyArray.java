/**
 * Make a program that fills a static array of N positions indicated by the user with numbers read through the keyboard.
 */

import java.util.Scanner;

public class E01_CreatyArray {
    public static double calculateAverage(int[] arrayAverage) {
        //Calculates the average of the numbers contained in the array.
        double average;
        int addition = 0;
        for (int i = 0; i < arrayAverage.length; i++){
            addition = addition + arrayAverage[i];
        }
        average = addition / arrayAverage.length;
        return average;
    }
    public static int countNegatives(int[] arrayNegative) {
        //Calculate how many negative numbers are inside the array
        int negatives = 0;
        for (int i = 0; i < arrayNegative.length; i++){
            if (arrayNegative[i] < 0){
                negatives++;
            }
        }
        return negatives ;
    }
    public static int showHigherAverage(int[] arrayShow) {
        //Calculates the amount that are higher than the average of the array values.
        double media = calculateAverage(arrayShow);
        int countHigher = 0;
        for (int i = 0; i < arrayShow.length; i++){
            if (arrayShow[i] > media){
                countHigher++;
            }
        }
        return countHigher;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the length of the array:");
        int length = sc.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Introduce a number:");
            array[i] = sc.nextInt();
        }
        System.out.println("The average between the numbers of the array is " + calculateAverage(array));
        System.out.println("In the array there are " + countNegatives(array) + " negative numbers.");
        System.out.println("In the array there are " + showHigherAverage(array) + " numbers higher than the average.");
    }
}