import java.util.Scanner;

/**
 * Diseña una clase con un metodo que permita averiguar la ultima cifra de un numero
 * introducido por teclado.
 */

import java.util.Scanner;

public class ultimacifra {

    String numero;

    public ultimacifra(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a number:");

        numero = sc.next();
    }



    public String dime_ultimacifra() {
        int contador = 0;

        for (int i = 0; i < numero.length(); i++) {
            contador++;
        }
        int cifra = contador - 1;
        return "la ultima cifra es " + (numero.substring(cifra));
    }
}