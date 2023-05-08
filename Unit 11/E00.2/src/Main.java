import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int contador = 0;

        int datosEntrada[] = new int [74130];
        try{
            FileInputStream archivoLectura = new FileInputStream("C:/Users/diego/Documents/GitHub/Programation/Unit 11/E00.2/imagen.jpg");

            boolean finalArchivo = false;

            do{
                int byteEntrada = archivoLectura.read();

                if (byteEntrada != -1){
                    datosEntrada[contador] = byteEntrada;
                }

                else {
                    finalArchivo = true;
                }
                System.out.println(datosEntrada[contador]);

                contador++;
            }
            while(!finalArchivo);

            archivoLectura.close();
        }
        catch (IOException e){
            System.out.println("ERROR AL ACCEDER A LA IMAGEN");
        }
        System.out.println(contador);

        crearFichero(datosEntrada);
    }

    static void crearFichero(int datosNuevoFichero[]){
        try{
            FileOutputStream ficheroNuevo = new FileOutputStream("C:/Users/diego/Documents/GitHub/Programation/Unit 11/E00.2/imagenCopia.txt");
            for (int i = 0; i < datosNuevoFichero.length; i++){
                ficheroNuevo.write(datosNuevoFichero[i]);
            }
            ficheroNuevo.close();
        }
        catch(IOException e){
            System.out.println("ERROR AL ACCEDER A LA IMAGEN");
        }
    }
}