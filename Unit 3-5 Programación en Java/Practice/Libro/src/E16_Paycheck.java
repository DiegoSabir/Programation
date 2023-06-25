/**
 * Make a program that calculates the workers paycheck whose work is paid in hours.
 * The calculation is performed as follows:
 * - First 35 hours per month at a flat rate.
 * - Overtime is paid at 1.5 more than the flat rate.
 * - The taxes to be deducted from the workers vary:
 *   - If the monthly salary is less than $1000, the salary is tax-free.
 *   - Otherwise 20% will be counted in taxes.
 */

import java.util.Scanner;

public class E16_Paycheck {
    public static double calculatePaycheck(int hours){
        int extrahours;
        int fee = 30;
        double extrafee;
        double salary;
        double extrasalary;
        double totalsalary;

        if (hours <= 35){
            totalsalary = hours * 30;
        }
        else{
            extrahours = hours - 35;
            extrafee = fee * 1.5;
            salary = (35 * fee);
            extrasalary = extrafee * extrahours;
            totalsalary = salary + extrasalary;
        }

        double tax;
        if (totalsalary <= 1000){
            tax = 0;
        }
        else{
            tax = totalsalary * 0.2;
            totalsalary -= tax;
        }
        return totalsalary;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Intruduce the work's hours perfomed:");
        int h = sc.nextInt();

        System.out.println("The net salary is $" + calculatePaycheck(h));
    }
}
