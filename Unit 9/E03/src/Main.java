/**
 * Crear un programa que use ArrayList de numeros de numeros enteros.
 * El programa debe mostrar un menu donde se pueda:
 * - Agregar un numero - add
 * - Buscar un numero - indexOf
 * - Modificar un numero - set
 * - Eliminar un numero - remote
 * - Salir
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int> numbers = new ArrayList<int>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int choise;

        while(!salir){

            System.out.println("[1] Add a number");
            System.out.println("[2]Search a number");
            System.out.println("[3] Modify a number");
            System.out.println("[4] Remove a number");
            System.out.println("[5] Exit");

            System.out.println("Write a option");
            choise = sn.nextInt();

            switch(choise){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
    }
}
