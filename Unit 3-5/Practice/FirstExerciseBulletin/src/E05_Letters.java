/**
 * Make a program that generates letters randomly and determines if they are vowels or consonants.
 */

public class E05_Letters {
    public static void checkLetters(){
        char letter = (char)(Math.random() * 26 + 'A');
        if (letter == 65 || letter == 69 || letter == 73 || letter == 79 || letter == 85){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is a consonant");
        }
    }
    public static void main(String[] args) {
        checkLetters();
    }
}