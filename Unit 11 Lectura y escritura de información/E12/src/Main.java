import java.io.*;

/**
 * Desarrolla un programa que lea los datos de un fichero de texto y que vuelque en otro
 * fichero todas las líneas del primero cuyo contenido esté en mayúsculas.
 */
public class Main {
    public static void main(String[] args) {
        File file1 = new File ("data.txt");
        File file2 = new File ("dataUpperCase.txt");

        try {
            FileReader readingFile = new FileReader(file1);
            BufferedReader br = new BufferedReader(readingFile);
            FileWriter writingFile = new FileWriter(file2);
            String sentence;

            while ((sentence = br.readLine()) != null) {
                if (sentence.toUpperCase().equals(sentence)) {
                    writingFile.write(sentence);
                }
            }
            System.out.println("COPY REALIZED SUCCESSFULLY");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}