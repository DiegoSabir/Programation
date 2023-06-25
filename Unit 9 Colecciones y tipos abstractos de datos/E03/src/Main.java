/**
 * Crear un programa que use ArrayList de numeros de numeros enteros.
 * El programa debe mostrar un menu donde se pueda:
 * - Agregar un numero - add
 * - Buscar un numero - indexOf
 * - Modificar un numero - set
 * - Eliminar un numero - remote
 * - Salir
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main arrayList1 = new Main();
        arrayList1.listNumbers = new ArrayList();
        arrayList1.chooseOption();
    }
    ArrayList<Integer> listNumbers;
    public void chooseOption() {
        Scanner sc = new Scanner(System.in);
        int choise;
        do {
            System.out.print("Introduce a option: ");
            System.out.println("[1] Add a number");
            System.out.println("[2] Search a number");
            System.out.println("[3] Modify a number");
            System.out.println("[4] Remove a number");
            System.out.println("[5] Insertar elemento");
            System.out.println("[6] Show numbers");
            System.out.println("[7] Orden ascendente");
            System.out.println("[8] Orden descendente");
            System.out.println("[9] Exit");

            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    introduceNumber();
                    break;
                case 2:
                    searchNumber();
                    break;
                case 3:
                    modifyNumber();
                    break;
                case 4:
                    removeNumber();
                    break;
                case 5:
                    insertNumber();
                    break;
                case 6:
                    showList();
                    break;
                case 7:
                    ascendentOrder();
                    break;
                case 8:
                    descendentOrder();
                    break;
                default:
                    System.out.println("Only numbers between 1 and 9");
            }
        }
        while (choise != 9);
    }

    public void introduceNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Introduce a number: ");
        number = sc.nextInt();
        listNumbers.add(number);
    }

    public void searchNumber() {
        Scanner sc = new Scanner(System.in);
        double number;
        int position;
        System.out.print("Introduce the number: ");
        number = sc.nextInt();
        position = listNumbers.indexOf(number);
        if (position >= 0) {
            System.out.println("Number's position: " + position);
        }
        else {
            System.out.println("Number's position not found");
        }
    }

    public void modifyNumber() {
        Scanner sc = new Scanner(System.in);
        int number, newNumber;
        int position;
        System.out.print("Number to modify: ");
        number = sc.nextInt();
        position = listNumbers.indexOf(number);
        if (position >= 0) {
            System.out.print("Introduce the new number: ");
            newNumber = sc.nextInt();
            listNumbers.set(position, newNumber);
        }
        else {
            System.out.println("Number not found");
        }
    }

    public void removeNumber() {
        Scanner sc = new Scanner(System.in);
        double number;
        int position;
        System.out.print("Number to remove: ");
        number = sc.nextInt();
        position = listNumbers.indexOf(number);
        if (position >= 0) {
            listNumbers.remove(position);
            System.out.println("Number has been removing");
        }
        else {
            System.out.println("Number not found");
        }
    }

    public void insertNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        int position;
        System.out.print("Number to introduce: ");
        number = sc.nextInt();
        System.out.print("Position to introduce: ");
        position = sc.nextInt();
        listNumbers.add(position, number);
    }

    public void showList() {
        if (!listNumbers.isEmpty()) {
            System.out.println("List's numbers:");
            for (int i = 0; i < listNumbers.size(); i++) {
                System.out.println(listNumbers.get(i));
            }
        }
        else {
            System.out.println("List without numbers");
        }
    }
    public void ascendentOrder() {
        Collections.sort(listNumbers);
        showList();
    }

    public void descendentOrder() {
        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(listNumbers, comparator);
        showList();
    }
}
