/**
 * Make a program in which the seconds are introduced by keyboard and return how many it is in hours minutes and seconds.
 */

import java.util.Scanner;

public class E21_SecondsHours {
    public static void secondsHours(int seconds) {
        int hours;
        int minutes;
        System.out.println(seconds);
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println("Hours:" + hours + " Minutes:" + minutes + " Seconds:" + seconds);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the seconds to convert:");
        secondsHours(sc.nextInt());
    }
}
