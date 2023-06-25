/**
 * Make a program that shows the multiplication's tables up to ten.
 */

public class E12_MultiplicationTable {
    public static void multiplicationTables(){
        for(int i = 1; i <= 10; i++){
            System.out.println("----------");
            System.out.println("Table's " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }

    public static void main(String args[]){
        multiplicationTables();
    }

}