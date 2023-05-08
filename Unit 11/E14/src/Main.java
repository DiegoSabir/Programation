import java.io.File;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Objects;
import java.util.Scanner;

/**
 * Programa que cree una carpeta en una ruta especificada, y dos archivos en dicha carpeta.
 * A continuacion listar sus nombres y eliminar uno de ellos.
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.crearCarpeta();
        m.listarCarpetas();
        m.eliminarArchivo();
    }

    private void crearCarpeta(){
        try{
            // File directorio = new File("\\Directorio");
            File directorio = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E14\\Directorio");

            if (directorio.exists()){
                directorio.mkdir();
            }

            File archivo1 = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E14\\Directorio\\archivo1.txt");
            File archivo2 = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E14\\Directorio\\archivo2.txt");

            archivo1.createNewFile();
            archivo2.createNewFile();
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    private void listarCarpetas(){
        File directorio = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E14\\Directorio");

        for (String Directorio : Objects.requireNonNull(directorio.list())){
            System.out.println(Directorio);
        }

    }

    private void eliminarArchivo(){
        try{
            Scanner sc = new Scanner(System.in);

            int archivo = 0;

            System.out.println("Selecciona un archivo a eliminar");
            System.out.println("[1] Archivo 1");
            System.out.println("[2] Archivo 2");

            archivo = sc.nextInt();

            switch (archivo){
                case 1:
                    File archivo1 = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E14\\Directorio\\archivo1.txt");
                    archivo1.delete();
                    break;
                case 2:
                    File archivo2 = new File("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E14\\Directorio\\archivo2.txt");
                    archivo2.delete();
                    break;
                default:
                    System.out.println("ARCHIVO SELECCIONADO NO EXISTENTE");
            }
        }
        catch(NullPointerException e){
            throw new NullPointerException();
        }

    }
}