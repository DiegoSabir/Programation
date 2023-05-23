import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Desarrolla un programa que lea datos de 2 arrays, uno con nombres de productos y el otro
 * con sus precios. Almacenar dicho contenido en un fichero, donde cada línea constará de
 * nombre de producto y precio.
 */
public class Main {
    public static void main(String[] args) {
        String[] products = {"PlayStation 5", "Xbox One", "Switch"};
        double[] price = {549.99, 771.26, 299.00};

        try (BufferedWriter file = new BufferedWriter(new FileWriter("gameConsoles.txt"))){
            for (int i = 0; i < products.length; i++) {
                file.write(products[i] + " = $" + price[i]);
                file.newLine();
            }
            System.out.println("Data saved to file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}