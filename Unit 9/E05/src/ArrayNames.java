import java.util.ArrayList;
import java.util.Scanner;
public class ArrayNames {
    private ArrayList<String> names = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void introduceNames() {
        sc = new Scanner(System.in);
        String name = "";
        while (!name.equals("exit")) {
            name = sc.nextLine();
            if(!name.equals("exit")){
                names.add(name);
            }
        }
    }

    public void showNames(){
        for (String i : names) {
            System.out.println("The name " + i + " is in the " + names.indexOf(i) + 1 + "º position");
        }
    }

    public int searchNames() {
        sc = new Scanner(System.in);
        System.out.println("Introduce the name:");
        String search = sc.nextLine();
        return names.indexOf(search);
    }

    public void removeNames() {
        names.remove(searchNames());
    }
}
