/**
 * Implementa un metodo que cree un array de cadenas de texto. A continuacion, implementa un metodo que cargue el array
 * con nombres.
 * Debera existir otro metodo que visualice el contenido del array, con el indice de cada posicion.
 * Implementar un metodo que busque un nombre en el array y devuelva la posicion.
 * Por ultimo desarrolar un metoodo para eliminar un nombre de la lista.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayNames array = new ArrayNames();

        System.out.println("Introduce a name('exit' to stop):");
        array.introduceNames();

        System.out.println("Show:");
        array.showNames();

        System.out.println("Search:");
        array.searchNames();

        System.out.println("Remove:");
        array.removeNames();
        array.showNames();
    }
}