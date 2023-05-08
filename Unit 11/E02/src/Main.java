import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Implementa un programa que lea el contenido de un fichero y cuente el número de letras mayúsculas.
 */
public class Main {
    public static void main(String[] args) {
        try (FileReader fr =  new FileReader("./Ficheros/entrada.txt")) {
            int contador = 0;
            int c;
            while ((c = fr.read()) != -1) {
                if (c >= 65 && c <= 90) {
                    contador++;
                }
            }
            System.out.println("Existen " + contador + " letras mayúsculas en el fichero.");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}