/**
 * Haz un programa JAVA que lea una serie de valores numericos enteros desde el teclado y los guarde en
 * un ArrayList de tipo Integer.
 * La lectura de numeros enteros termina cuando se introduzca el valor -99. Este valor no se guarda en
 * el ArrayList.
 * A continuacion, el programa mostrará por pantalla el numero de valores que se han leido, su suma y
 * su media.
 * Por ultimo se mostraran todos los valores leidos, indicando cuantos de ellos son mayores que la media.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Main ej3 = new Main();
    array = ej3.createArray();
    ej3.calculateOperations(array);
    ej3.showNumbers();
    }

    public ArrayList<Integer> createArray(){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        do{
            System.out.println("Introduce a number: ");
            number = sc.nextInt();
            if(number != -99){
                numbers.add(number);
            }
        }
        while(number != -99);
        return numbers;
    }

    public float calculateOperations(ArrayList numbers){
        int counter = 0;
        int plus = 0;
        float average;

        for (int i : numbers) {
            counter += 1;
            plus += i;
        }
        average = plus / counter;
        System.out.println("Counter: " + counter + ", Plus: " + plus + ", Average:" + average);
        return average;
    }

    public void showNumbers(ArrayList numbers, float average){
        for (int i : numbers) {
            if (i < average)
                System.out.println(i);
            else{
                System.out.println(i + "is higher than average");
            }
        }
    }
}