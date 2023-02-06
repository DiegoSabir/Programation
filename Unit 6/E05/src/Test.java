import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    int numero1;
    int numero2;

    public void leeNumeros() {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(isr);

        try {

            System.out.print("Introduzca el primer número:");
            String ln = buff.readLine();
            numero1 = Integer.parseInt(ln);
            System.out.print("Introduzca el segundo número:");
            ln = buff.readLine();
            numero2 = Integer.parseInt(ln);
        }
        catch (IOException e) {

            System.err.println("Se ha producido una IOException");
            e.printStackTrace();
        }
        catch (Throwable e) {

            System.err.println("Error de programa: " + e);
            e.printStackTrace();
        }
    }

    public void muestraNumeros() {

        try {

            System.out.println(numero1 + numero2);
            System.out.println(numero1 * numero2);
            System.out.println(numero1 / numero2);
            System.out.println(numero1 % numero2);
        }
        catch (ArithmeticException e) {

            System.out.println("División por cero");
        }
        catch (Exception e) {

            System.out.println("Se produjo un error en el programa");
        }
    }
}
