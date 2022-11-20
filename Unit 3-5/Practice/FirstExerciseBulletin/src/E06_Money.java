/**
 * Make a program that, given an amount in euros, calculate the minimum number of notes and the excess amount that can be used to obtain this amount.
 */

import java.util.Scanner;

public class E06_Money {
    public static void countMoney(int m){
        int[] notes = {500, 200, 100, 50, 20, 10, 5};
        int [] res = {0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < notes.length; i++){
            if (m >= notes[i]){
                res[i] = (int) Math.floor(m / notes[i]);

                m = m - (res[i] * notes[i]);
            }
        }

        for (int i = 0; i < notes.length; i++){
            if (res[i]>0){
                System.out.println(res[i] + " €" + notes[i]+ " notes");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the amount:");
        int money = sc.nextInt();
        countMoney(money);
    }
}
