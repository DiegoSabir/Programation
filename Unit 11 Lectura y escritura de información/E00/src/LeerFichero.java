import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public void lee(){
        try {
            //FileReader entrada = new FileReader("//ejemplo.txt");
            FileReader entrada = new FileReader("C:/Users/diego/Documents/GitHub/Programation/Unit 11/E00/ejemplo.txt");

            BufferedReader mibuffer = new BufferedReader(entrada);

            String linea = "";

             do{
                 linea = mibuffer.readLine();

                 if (linea != null) {
                     System.out.println(linea);
                 }
             }
             while (linea != null);

            /**
             int c = 0;

            do{
                c = entrada.read();

                char letra = (char)c;

                System.out.println(letra);
            }
            while (c != -1);
             */
        }
        catch (IOException e) {
            System.out.println("ARCHIVO NO ENCONTRADO");
        }
        finally {
            try{
                entrada.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    FileReader entrada;
}
