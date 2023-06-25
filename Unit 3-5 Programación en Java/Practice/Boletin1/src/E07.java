import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E07 {
    public static int getNumber() {
        int d, m, y;
        d = m = y = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);
        try {
            System.out.println("Introduzca Día:");
            String ln = buff.readLine();
            d = Integer.parseInt(ln);
            System.out.println("Introduzca Mes:");
            ln = buff.readLine();
            m = Integer.parseInt(ln);
            System.out.println("Introduzca Año:");
            ln = buff.readLine();
            y = Integer.parseInt(ln);
        }
        catch (IOException e) {
            System.err.println("Se ha producido una IOException");
            e.printStackTrace();
        }
        catch (Throwable e) {
            System.err.println("Error de programa: " + e);
            e.printStackTrace();
        }
        return (d + m + y);
    }

    public static int reduce(int dato) { // TAMBIÉN SE PODRÍA IMPLEMENTAR CON SPLIT
        int sum = 0;
        String cad = String.valueOf(dato);
        for (int i = 0; i < cad.length(); i++) {
            sum += Integer.parseInt(cad.substring(i, i + 1).trim());
        }
        return sum;
    }

    public static void main(String[] args) {
        int dato = getNumber();
        while (dato > 9) {
            dato = reduce(dato);
        }
        System.out.println("Tu lucky number es: "+dato);
    }
}
