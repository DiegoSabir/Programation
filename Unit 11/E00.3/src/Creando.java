import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {
    public static void main(String[] args) {
        File directorio = new File ("C:\\Users\\diego\\Documents\\GitHub\\Programation\\Unit 11\\E00.3\\Directorio");
        directorio.mkdir();


        File archivo = new File ("C:\\Users\\diego\\Documents\\GitHub\\Programation\\Unit 11\\E00.3\\archivo.txt");
        String archivoDestino = archivo.getAbsolutePath();
        try {
            archivo.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Escribiendo acceder = new Escribiendo();
        acceder.escribir(archivoDestino);
    }

    class Escribiendo{
        public void escribir(String rutaArchivo){
            String frase = "Esto es un ejemplo";
            try {
                FileWriter escritura = new FileWriter(rutaArchivo);
                for ( int i = 0; i < frase.length(); i++){
                    escritura.write(frase.charAt(i));
                }
                escritura.close();
            }
            catch (IOException e){
            }
        }
    }
}
