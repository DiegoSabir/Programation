/**
 * Implementa un programa que lea el contenido de un fichero y muestre por pantalla todos aquellos caracteres de su
 * contenido, exceptuando los espacios y las vocales.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr =  new FileReader("./Ficheros/entrada.txt");
            int c;
            while ((c = fr.read()) != -1) {
                if (c != 32 && c != 97 && c != 101 && c != 105 && c != 111 && c != 117) {
                    System.out.println((char)c);
                }
            }
            fr.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}