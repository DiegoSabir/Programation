/**
 * Make a program that asking for a password.
 * The user have three attempts maximum.
 * The password is 111 or 222 or 333.
 */

import java.util.Scanner;

public class E09_CheckPassword {
    public static boolean checkPassword(){
        Scanner sc = new Scanner(System.in);

        boolean result = false;
        int attempts = 3;
        int password;

        do {
            System.out.println("Introduce the password:");
            password = sc.nextInt();
            attempts--;
            if (password == 111 || password == 222 || password == 333){
                result = true;
            }
        }while(attempts > 0 && password != 111 && password != 222 && password != 333);
        return result;
    }

    public static void main(String args[]){
        if (checkPassword()){
            System.out.println("CORRECT PASSWORD");
        }
        else {
            System.out.println("ACCOUNT BLOCKED");
        }
    }
}