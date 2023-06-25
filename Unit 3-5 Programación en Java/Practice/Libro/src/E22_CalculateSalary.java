/**
 * Make a program that calculates the tax discount on the workers' salary.
 * - If the worker has a salary of less than €1000, he will have a 10% discount.
 * - If the salary is greater than €1000 and less than €2000, he will have a 10% discount on the first €1000 and 5% on the rest.
 * - If it is greater than €2000, he will have a 10% discount on the first €1000, 5% on the next €1000 and 3% on the rest.
 */

import java.util.Scanner;

public class E22_CalculateSalary {
    public static void calculateSalary(int salary) {
        double discount;
        if (salary <= 1000) {
            discount = salary * 0.1;
        }
        else {
            if (salary>1000 && salary<=2000) {
                discount = 1000 * 0.1 + (salary-1000) * 0.05;
            }
            else {
                discount = 1000 * 0.1 + (salary-1000) * 0.05 + (salary-2000) * 0.03;
            }
        }
        System.out.println("Discount: " + discount);
        System.out.println("Net salary: " + (salary-discount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the salary");
        calculateSalary(sc.nextInt());
    }
}
