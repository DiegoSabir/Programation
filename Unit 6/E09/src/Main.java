/**
 * Crea una clase Cuenta que tendrá los siguientes atributos:
 * - titular
 * - cantidad (dato decimal)
 *
 * El tItular sera obligatorio y la cantidad opcional.
 * Crea dos constructores que cumpla lo anterior.
 *
 * Crea sus metodos get, set y toString.
 *
 * Tendra dos metodos especiales:
 * - ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa , no se
 * hara nada.
 * - retirar (double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan
 * es negativa, la cantidad de la cuenta pasa a ser 0.
 */
import java.lang.NullPointerException;
public class Main {
    public static void main(String[] args) {

        Cuenta cliente1 = new Cuenta("Ivan");

        cliente1.ingresar(300);

        cliente1.retirar(100);

        System.out.println(cliente1);
    }
}