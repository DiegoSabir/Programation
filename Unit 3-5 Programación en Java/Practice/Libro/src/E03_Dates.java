/**
 * Write a program that reads three numbers which means a date(day, month, year).
 * Check that the date is valid, if it is not valid to print an error message.
 * When is valid, print the month with his respective name.
 */
import java.util.Scanner;

public class E03_Dates {
    public static void checkDate(int d, int m, int y){
        String month = "";

        if (d < 0 || d > 31 || m < 0 || m > 12 || y < 0){
            System.out.println("Invalid date");
        }
        else if ((m == 4 || m == 6 || m == 9 || m==11) && d > 30){
            System.out.println("Day error");
        }
        else if (m == 2 && d > 28){
            System.out.println("Februay doesn´t have that day");
        }
        else{
            switch (m){
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
            }
            System.out.print(month + " " + d + " " + y);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the day:");
        int day = sc.nextInt();
        System.out.println("Introduce the month:");
        int month = sc.nextInt();
        System.out.println("Introduce the year:");
        int year = sc.nextInt();

        checkDate(day, month, year);
    }
}