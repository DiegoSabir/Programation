import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A partir de un array con nombres de persona, escribir en un fichero denominado “datos.txt”
 * dichos nombres, cada uno en una línea. A continuación, leer los datos de nuevo del fichero y
 * mostrarlos por pantalla, indicando el índice de la posición que ocupa. Ejemplo de ejecución:
 */
public class Main {
    public static void main(String[] args) {
        String[] people = {"Diego", "Ivan", "Pablo", "Fran"};

        try (BufferedWriter file = new BufferedWriter(new FileWriter("data.txt"))){
            for (String person : people){
                file.write(person);
                file.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}