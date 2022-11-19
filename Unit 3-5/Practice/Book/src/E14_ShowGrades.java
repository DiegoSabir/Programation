/**
 * Make a program that requests numeric notes and displays its equivalent in letters (A+,A,A-,B,C,D,F)
 * When finished, you should show the highest note in number and letter
 * If you want to exit (write -1).
 */

import java.util.Scanner;

public class E14_ShowGrades {
    public static void showGrades(){
        Scanner sc = new Scanner(System.in);

        int numericgrade;
        int highernumericgrade = 0;
        String grade = "";
        String highergrade = "";

        do {
            System.out.println("Introduce the numeric grade:");
            numericgrade = sc.nextInt();

            if (numericgrade >= 0){

                switch(numericgrade){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        grade = "F";
                        break;
                    case 5:
                        grade = "D";
                        break;
                    case 6:
                        grade = "C";
                        break;
                    case 7:
                        grade = "B";
                        break;
                    case 8:
                        grade = "A-";
                        break;
                    case 9:
                        grade = "A";
                        break;
                    case 10:
                        grade = "A+";
                        break;
                }

                System.out.println(numericgrade + " = " + grade);
            }

            if (numericgrade > highernumericgrade){
                highernumericgrade = numericgrade;
                highergrade = grade;
            }
        }while(numericgrade > 0);
        System.out.println("The higher grade is " + highernumericgrade + " = " + highergrade);
    }

    public static void main(String args[]){
        showGrades();
    }
}