import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Implementa un programa que lea el contenido de un fichero y cuente el número de líneas que tiene el fichero.
 */
public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis =  new FileInputStream("./Ficheros/entrada.txt")) {
            int contLineas = 1;
            int c;
            while ((c = fis.read()) != -1) {
                if (c == 10) {
                    contLineas++;
                }
            }
            System.out.println("Existen " + contLineas + " líneas en el fichero.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}