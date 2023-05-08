import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

public class Main {
    public static void main(String[] args) {
        valoresAleatorios();
    }
    private static void valoresAleatorios(){
        DataOutputStream ficheroEscribir;
        DataInputStream ficheroLeer;
        try {
            ficheroEscribir = new DataOutputStream(Files.newOutputStream(Paths.get("100Numeros.txt"), CREATE, APPEND));
            ficheroLeer = new DataInputStream(new FileInputStream("100Numeros.txt"));
            for (int i = 0; i < 100; i++) {
                ficheroEscribir.writeInt((int)(Math.random()*100));
            }
            int total = 0;
            int cont = 0;
            while (ficheroLeer.available() != 0) {
                int temp = ficheroLeer.readInt();
                System.out.print(temp + " ");
                total += temp;
                cont++;
            }
            System.out.println("\nEl fichero contiene " + cont + " números");
            System.out.println("La media es: " + (total / cont));
            ficheroEscribir.close();
            ficheroLeer.close();
            if (cont >= 1000) {
                try(OutputStream fic = Files.newOutputStream(Paths.get("100Numeros.txt"), DELETE_ON_CLOSE)) {
                    System.out.println("Se han excedido los 1000 números. Fichero eliminado");
                }
                catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error al encontrar el fichero");
        }
        catch (IOException ex) {
            System.err.println("Error al manipular el archivo");
        }
    }
}