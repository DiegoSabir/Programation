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
            BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E09\\gameConsoles.txt"));
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
        File readFile = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E09\\gameConsoles.txt");
        File temporalFile = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E09\\gameConsolesTemporal.txt");

        System.out.println("Introduce product name: ");
        String product = sc.next();

        try {
            BufferedReader reading = new BufferedReader(new FileReader(readFile));
            BufferedWriter writing = new BufferedWriter(new FileWriter(temporalFile));
            String readingLine;

            while((readingLine = reading.readLine()) != null){
                if (readingLine.contains(product)) {
                    System.out.println(readingLine);
                }
                else{
                    writing.write(readingLine + '\n');
                }
            }
            reading.close();
            writing.close();

            if (readFile.delete()){
                temporalFile.renameTo(readFile);
            }
            else {
                System.out.println("ERROR");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}