/**
 * Crear un array que contenga 30 números enteros aleatorios entre 0 y 99.
 * Crear un nuevo array con los números primos que haya entre esos 30 números.
 * continuación debe mostrar el contenido de los dos arrays
 */
public class E02_ArrayPrimeNumbers {
    public static int[] arrayRandomNumbers(){
        int[] array1 = new int [30];

        for (int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random()*100);
        }
        return array1;
    }

    public static int[] arrayPrimeNumbers(){
        int[] array2 = new int [30];
        int[] list = arrayRandomNumbers();
        for (int i = 0; i < list.length; i++){


            for(i = 1; i <= 100; i++){
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
                }
            }
        }
        return array2;
    }

    public static void main(String args[]){
        System.out.println(arrayRandomNumbers());
        System.out.println(arrayPrimeNumbers());
    }
}
