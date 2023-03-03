/**
 * Escribe una aplicación para una biblioteca que contenga libros y revistas.
 *
 * Las características comunes para las revistas y para los libros son el código, el título, y el año de publicación.
 *
 * Estos datos se pasarán por parámetro al crear los objetos.
 *
 * Los libros tienen un atributo propio "prestado". Por defecto, al crear un libro, dicho atributo estará a false.
 *
 * Las revistas tienen un atributo propio "numero". Al crear las revistas se pasa el número por parámetro.
 *
 * Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve el
 * valor de todos los atributos en una cadena de caracteres. También tienen un método que devuelve el año de publicación,
 * y otro el código.
 *
 * Ambas clases implementarán obligatoriamente los método prestar(), devolver(), heredados de la clase Prestable.
 */
public class Main {
    public static void main(String[] args) {
        Library[] Collection = new Library[4];

        Collection[0] = new Book("4452", "Philosopher's Stone", 1997, false);
        Collection[1] = new Book("4453", "Chamber of Secrets", 1998, true);
        Collection[2] = new Magazine("1234", "National Geographic", 1888, 1);
        Collection[3] = new Magazine("2345", "Playboy", 1953, 1);

        for (Library i: Collection) {
            System.out.println(i.toString());

            if(i instanceof Book){
                System.out.println(((Book)i).lend(2023, 2, 15));
                System.out.println(((Book)i).giveBack(2023, 3, 1));
            }
            if(i instanceof Magazine) {
                System.out.println(((Magazine) i).lend(2023, 2, 15));
                System.out.println(((Magazine) i).giveBack(2023, 3, 1));
            }
        }
    }
}