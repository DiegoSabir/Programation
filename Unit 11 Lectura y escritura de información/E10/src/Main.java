import java.io.*;
import java.util.Scanner;

/**
 * Implementar un programa que gestione registros (de 3 campos) almacenados en un fichero.
 * Cada registro deberá tener nombre, dirección y teléfono, y el programa, a través de un
 * menú, deberá permitir añadir registros al fichero, listarlos, buscar uno en concreto por
 * nombre (en caso de que encuentre el contacto, deberá mostrarlo por pantalla, nombre y
 * teléfono) y borrar.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    addRegister();
                    break;
                case 2:
                    listRegisters();
                    break;
                case 3:
                    searchRegister();
                    break;
                case 4:
                    removeRegister();
                case 5:
                    break;
                default:
                    System.out.println("Introduce a right option");
            }
        } while (option != 5);
    }

    private static int menu() {
        System.out.println("Introduce a option");
        System.out.println("[1] Add register");
        System.out.println("[2] List registers");
        System.out.println("[3] Search register");
        System.out.println("[4] Remove register");
        System.out.println("[5] Exit");
        return Integer.parseInt(sc.nextLine());
    }

    private static void addRegister() {
        System.out.println("Introduce a name: ");
        String name = sc.nextLine();
        System.out.println("Introduce an address: ");
        String address = sc.nextLine();
        System.out.println("Introduce a telephone: ");
        String telephone = sc.nextLine();

        DataOutputStream registroSalida;
        try {
            registroSalida = new DataOutputStream(new FileOutputStream("RegistersData.txt", true));
            registroSalida.writeUTF(name);
            registroSalida.writeUTF(address);
            registroSalida.writeUTF(telephone);

            registroSalida.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("FILE ERROR");
        }
        catch (IOException ex) {
            System.out.println("Error al manipular");
        }
        System.out.println("Register Added Successfully");
    }

    private static void listRegisters() {
        DataInputStream registroEntrada;
        try {
            registroEntrada = new DataInputStream(new FileInputStream("RegistersData.txt"));
            int i = 1;
            while (registroEntrada.available() != 0) {
                System.out.println("----------");
                System.out.println("ID: " + i);
                System.out.println("----------");
                System.out.println("Name: " + registroEntrada.readUTF());
                System.out.println("Address: " + registroEntrada.readUTF());
                System.out.println("Telephone: " + registroEntrada.readUTF());
                i++;
            }
            registroEntrada.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("FILE ERROR");
        }
        catch (IOException ex) {
            System.out.println("FILE ERROR");
        }
    }

    private static void searchRegister() {
        System.out.println("Introduce the name contact: ");
        String name = sc.nextLine();
        DataInputStream registroEntrada;
        try {
            registroEntrada = new DataInputStream(new FileInputStream("RegistersData.txt"));
            int i = 1;
            int counter = 1;

            while (registroEntrada.available() != 0) {
                String linea = registroEntrada.readUTF();
                if (name.equals(linea)) {
                    System.out.println("----------");
                    System.out.println("ID: " + i);
                    System.out.println("----------");
                    System.out.println("Name: " + linea);
                    System.out.println("Address: " + registroEntrada.readUTF());
                    System.out.println("Telephone: " + registroEntrada.readUTF());
                    i++;
                }
                counter++;
                // AVANZO EL CONTADOR DE REGISTROS HASTA LA LÍNEA SIGUIENTE (AVANZO 3 CAMPOS)
                if (counter % 3 == 0) {
                    i++;
                }
            }
            registroEntrada.close();

        }
        catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUNDED");
        }
        catch (IOException ex) {
            System.out.println("FILE ERROR");
        }
    }

    private static void removeRegister() {
        DataInputStream readingRegister, temporaryReading;
        DataOutputStream writingRegister, temporaryWriting;
        System.out.println("Introduce the name contact: ");
        String nombre = sc.nextLine();

        try {
            File temporaryFile = File.createTempFile("Temporary", ".txt");
            readingRegister = new DataInputStream(new FileInputStream("RegistersData.txt"));
            temporaryWriting = new DataOutputStream(new FileOutputStream(temporaryFile));

            boolean encontrado = false;
            int i = 1;
            while (readingRegister.available() != 0) {
                String linea = readingRegister.readUTF();
                if (nombre.equals(linea)) {
                    encontrado = true;
                }
                if (!encontrado) {
                    temporaryWriting.writeUTF(linea);
                }

                // CUANDO LLEGA AL ÚLTIMO CAMPO DEL REGISTRO, SE RESETEA LA VARIABLE BOOLEANA
                if (i % 3 == 0) {
                    encontrado = false;
                }
                i++;
            }

            readingRegister.close();
            temporaryWriting.close();

            temporaryReading = new DataInputStream(new FileInputStream(temporaryFile));
            writingRegister = new DataOutputStream(new FileOutputStream("RegistersData.txt"));

            while (temporaryReading.available() != 0) {
                writingRegister.writeUTF(temporaryReading.readUTF());
            }

            temporaryReading.close();
            writingRegister.close();

            if (temporaryFile.delete()) {
                System.out.println("Temporary File Deleted Successfully");
            }
            else{
                System.out.println("Temporary File could not be deleted");
            }

        }
        catch (IOException ex) {
            System.out.println("FILE ERROR");
        }

    }
}