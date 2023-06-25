import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que vaya solicitando al usuario cadenas de texto y les vaya introduciendo en un fichero.
 * Se debe tener en cuenta que no se admitiran en el fichero las letras "N", "Y" y "U", por lo que
 * deberan ser eliminadas previamente.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter file = new FileWriter("C:\\Users\\a18diegorg\\Documents\\GitHub\\Programation\\Unit 11\\E15\\file.txt");

            String reading;
            do{
                System.out.println("Introduce a sentence:");
                reading = sc.nextLine();
                if(!reading.equals("*")){
                    reading = reading.replaceAll("N", "");
                    reading = reading.replaceAll("Y", "");
                    reading = reading.replaceAll("U", "");
                    file.write(reading + "\n");
                }
            }
            while(!reading.equals("*"));
            file.close();
        }
        catch(IOException e){
            throw new RuntimeException();
        }
    }
}