import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

/**
 * Programa que abra un fichero y escriba 100 valores numéricos enteros obtenidos aleatoriamente.
 * A continuación, el programa deberá mostrar su contenido en pantalla y calcular su media.
 * Si se abre el fichero con el bloc de notas veremos que algunos caracteres son legibles.
 */
public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    valoresAleatorios();
                    break;
                case 2:
                    intercambiarContenido();
                    break;
            }
        } while (opcion != 0);
    }

    private static int menu() {
        System.out.println("-- Streams --");
        System.out.println("1-- Fichero con 100 valores");
        System.out.println("2-- Intercambiar contenido");
        System.out.println("0-- Salir");
        return Integer.parseInt(teclado.nextLine());
    }

    private static void valoresAleatorios() {
        DataOutputStream ficheroEscribir;
        DataInputStream ficheroLeer;
        try {
            ficheroEscribir = new DataOutputStream(Files.newOutputStream(Paths.get("100Numeros.txt"), CREATE, APPEND));
            ficheroLeer = new DataInputStream(new FileInputStream("100Numeros.txt"));
            for (int i = 0; i < 100; i++) {
                ficheroEscribir.writeInt((int) (Math.random() * 100));
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
                try (OutputStream fic = Files.newOutputStream(Paths.get("100Numeros.txt"), DELETE_ON_CLOSE)) {
                    System.out.println("Se han excedido los 1000 números. Fichero eliminado");
                }
                catch (Exception e) {
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

    private static void intercambiarContenido() {
        File temp;
        DataInputStream fichero1Leer, fichero2Leer, ficheroTemporalLeer;
        DataOutputStream fichero1Escribir, fichero2Escribir, ficheroTemporalEscribir;

        try {
            temp = File.createTempFile("temp", ".txt");

            fichero1Leer = new DataInputStream(new FileInputStream("FICHERO1.txt"));
            ficheroTemporalEscribir = new DataOutputStream(new FileOutputStream(temp));

            while (fichero1Leer.available() != 0) {
                ficheroTemporalEscribir.write(fichero1Leer.read());
            }

            fichero1Leer.close();
            ficheroTemporalEscribir.close();

            fichero2Leer = new DataInputStream(new FileInputStream("FICHERO2.txt"));
            fichero1Escribir = new DataOutputStream(new FileOutputStream("FICHERO1.txt"));

            while (fichero2Leer.available() != 0) {
                fichero1Escribir.write(fichero2Leer.read());
            }

            fichero2Leer.close();
            fichero1Escribir.close();

            ficheroTemporalLeer = new DataInputStream(new FileInputStream(temp));
            fichero2Escribir = new DataOutputStream(new FileOutputStream("FICHERO2.txt"));

            while (ficheroTemporalLeer.available() != 0) {
                fichero2Escribir.write(ficheroTemporalLeer.read());
            }

            ficheroTemporalLeer.close();
            fichero2Escribir.close();

            System.out.println((temp.delete() ? "Temporal eliminado con exito" : "No se pudo eliminar el temporal"));
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error al encontrar el fichero");
        }
        catch (IOException ex) {
            System.err.println("Error al manipular el archivo");
        }
    }
}