/**
 * Make a program that shows the prime numbers from 1 to 100.
 */
public class E15_PrimeNumber {
    public static void showPrimeNumbers(){
        for(int i = 1; i <= 100; i++){
            boolean prime = true;
            int counter = 0;
            for(int j = 1; j <= i; j++){
                if (i % j == 0){
                    counter++;
                }
                if (counter > 2){
                    prime = false;
                }
            }
            if (prime == true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        showPrimeNumbers();
    }
}
