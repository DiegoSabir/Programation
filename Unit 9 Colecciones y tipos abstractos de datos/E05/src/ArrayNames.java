import java.util.*;

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
            System.out.println("Name: " + i + ", Position: " + names.indexOf(i));
        }
    }

    public int searchNames() {
        sc = new Scanner(System.in);
        System.out.println("Name to search:");
        String search = sc.nextLine();
        return names.indexOf(search);
    }

    public void removeNames() {
        names.remove(searchNames());
    }
}
