/**
 * Realiza una clase Test con 2 métodos, uno que tome por teclado dos números y otro que muestre la suma,
 * multiplicación, división y módulo. En el caso de que el segundo número sea 0, el programa deberá atrapar las
 * excepciones que se puedan producir.
 *
 * Además, contará con un método main para comprobar su funcionamiento.
 *
 * Para la resolución de este problema necesitarás utilizar wrappers.
 */
public class Main {

    public static void main(String[] args) {

        Test t = new Test();
        t.leeNumeros();
        t.muestraNumeros();
    }
}