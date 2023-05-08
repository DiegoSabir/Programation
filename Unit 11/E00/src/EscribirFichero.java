import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
    public void escribir(){
        String frase = "Esto es una prueba de escritura";
        try {
            //FileWriter entrada = new FileWriter("//ejemplo2.txt");
            FileWriter escritura = new FileWriter("C:/Users/diego/Documents/GitHub/Programation/Unit 11/E00/ejemplo2.txt");

            /**
             * En caso de escribir en un fichero existente:
             * FileWriter escritura = new FileWriter("C:/Users/diego/Documents/GitHub/Programation/Unit 11/E00/ejemplo.txt", true);
             */

            for (int i = 0; i < frase.length(); i++){
                escritura.write(frase.charAt(i));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
