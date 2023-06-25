/**
 * Make a program that calculates the arithmetic average of 5 exams of a subject introduced by keyboard.
 */

import java.util.Scanner;

public class E10_AverageGrade {
    public static float averageGrade(){
        Scanner sc = new Scanner(System.in);
        float addition = 0;
        for(int exam = 1; exam <= 5; exam++){
            System.out.println("Introduce the grade:");
            float grade = sc.nextFloat();
            addition += grade;
        }
        float average = addition / 5;
        return average;
    }

    public static void main (String args[]){
        System.out.println("The average's grade is " + averageGrade());
    }
}