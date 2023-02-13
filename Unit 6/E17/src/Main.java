/**
 * Escribe una clase CollectionInterface, que DECLARE los siguientes métodos:
 *
 * isEmpty(): devuelve true si la colección está vacía y false en caso contrario.
 * get(): devuelve y elimina el primer elemento de la colección.
 * first(): devuelve el primer elemento de la colección.
 * add(): añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.
 *
 * A continuación, escribe una clase Pila, que implemente esta clase, utilizando para ello un array y un contador de
 * objetos.
 */

public class Main {
    public static void main(String[] args) {
        Pila p = new Pila(5);
        p.add(8);
        p.add(9);
        p.add(10);
        System.out.println("Obtengo y elimino primer elemento de la pila: " + p.get());
        System.out.println("Obtengo primer elemento de la pila: ");
        System.out.println(p.first());
    }
}