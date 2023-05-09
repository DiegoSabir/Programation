import java.io.*;
import java.util.Scanner;

/**
 * A partir del ejercicio anterior, implementa un método que solicite un nombre de producto al
 * usuario y lo elimine del listado (del fichero). Deberá mostrar también su información por
 * pantalla (nombre y precio)
 */
public class Main {
    public static void main(String[] args) {
        Main ej1 = new Main();
        ej1.createFile();
        ej1.showProducts();
    }

    public void createFile(){
        String[] products = {"PlayStation 5", "Xbox One", "Switch"};
        double[] prices = {549.99, 771.26, 299.00};

        try {
            BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\diego\\Documents\\GitHub\\Programation\\Unit 11\\E09\\gameConsoles.txt"));
            for (int i = 0; i < products.length; i++) {
                file.write(products[i] + " = $" + prices[i]);
                file.newLine();
            }
            file.close();
            System.out.println("Data saved to file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showProducts(){
        Scanner sc = new Scanner(System.in);
        File readFile = new File("C:\\Users\\diego\\Documents\\GitHub\\Programation\\Unit 11\\E09\\gameConsoles.txt");

        System.out.println("Introduce product name: ");
        String product = sc.next();
        String readingLine;

        try {
            BufferedReader reading = new BufferedReader(new FileReader(readFile));
            do {
                readingLine = reading.readLine();
                if (readingLine.contains(product)){
                    System.out.println(readingLine);
                }
            }
            while (readingLine != null);
            reading.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }


    public void deleteProducts(){

    }
}