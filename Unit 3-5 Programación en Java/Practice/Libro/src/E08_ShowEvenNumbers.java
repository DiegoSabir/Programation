/**
 * Make a program that shows even numbers up to ten.
 */
public class E08_ShowEvenNumbers {
    public static void showEven(){
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){
        showEven();
    }
}
