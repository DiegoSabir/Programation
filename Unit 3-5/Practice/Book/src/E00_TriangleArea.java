/**
 * Write a program that calculates the area of a triangle receiving as input the value of base and height.
 */

import java.util.Scanner;

public class E00_TriangleArea {
    private static float triangleArea(float b, float h){
        float area = b * h / 2;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the base:");
        float base = sc.nextFloat();
        System.out.println("Introduce the height:");
        float height = sc.nextFloat();

        System.out.println("The triangle area is " + triangleArea(base, height));
    }
}