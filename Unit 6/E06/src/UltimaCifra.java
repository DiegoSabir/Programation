import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltimaCifra {

    public static int getNumber() {

        int dato = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);

        try {

            System.out.println("Introduzca dato:");
            String ln = buff.readLine();
            dato = Integer.parseInt(ln);
        }
        catch (IOException e) {

            System.err.println("Se ha producido una IOException");
            e.printStackTrace();
        }
        catch (Throwable e) {

            System.err.println("Error de programa: " + e);
            e.printStackTrace();
        }
        return (dato);
    }

    public static int getUltimaCifra(int dato) {

        int d = 0;
        String cad = String.valueOf(dato);
        d = Integer.parseInt(cad.substring(cad.length() - 1, cad.length()));
        return d;
    }
}
