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
public class Main {
    public static void main(String[] args) {
        Owner[] Owners = new Owner[2];
        Owners[0] = new Owner("Ivan", 28, "12345678B");
        Owners[1] = new Owner("Diego", 24, "39462414A");


        Account[] Accounts = new Account[2];
        Accounts[0] = new Account(Owners[0], 1000);
        Accounts[1] = new YoungAccount(Owners[1], 1000, 2.5, Owners[1]);

        for (Account i: Accounts){
            if (i instanceof Account){
                System.out.println(i.toString());
                System.out.println(i.earn(2000));
                System.out.println(i.withdraw(500));
            }
            if (i instanceof YoungAccount){
                System.out.println(i.toString());
                System.out.println(i.withdraw(500));
            }
        }
    }
}