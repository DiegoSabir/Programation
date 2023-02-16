/**
 * Se desea implementar una aplicación para gestión de Libros y Autores de una editorial.
 * Deberá existir una clase Autor que incluya un campo alias y la fecha de la primera publicación del autor.
 * Por otro lado, existirá una clase Persona que contenga los campos DNI, Nombre, fecha de nacimiento, nacionalidad,
 * telefono y direccion, de la cual heredará Autor.
 * Por último, se debe crear una clase Libro que contenga los siguientes atributos:
 * – ISBN
 * – Titulo
 * – Autor
 * – Número de páginas
 *
 * Crear sus respectivos métodos get y set correspondientes para cada atributo.
 *
 * Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
 * - “El libro con ISBN creado por el autor NOMBRE_AUTOR tiene X páginas”
 *
 * En el fichero main, crear varios objetos Libro y mostrarlos por pantalla.
 * Por último, indicar cuál de los 2 tiene más páginas.
 */
public class Main {
    public static void main(String[] args) {
        Author[] AuthorsList = new Author[2];

        AuthorsList[0] = new Author("123456789A", "Joanne Rowling", 1965, 7, 31, "British","Royal Mile",
                "+44 123456789", "J.K Rowling", 1997, 6, 26);
        AuthorsList[1] = new Author("987654321A", "George Raymond Richard Martin", 1948, 8, 20, "American","Santa Fe",
                "+1 987654321", "George R. R. Martin", 1996, 3, 14);

        Book[] Collection = new Book[7];

        Collection[0] = new Book("4452", "Philosopher's Stone", AuthorsList[0], 264);
        Collection[1] = new Book("4957", "Chamber of Secrets", AuthorsList[0], 296);
        Collection[2] = new Book("5190", "Prisoner of Azkaban", AuthorsList[0], 360);
        Collection[3] = new Book("6456", "Goblet of Fire", AuthorsList[0], 672);
        Collection[4] = new Book("7422", "Order of the Phoenix", AuthorsList[0], 928);
        Collection[5] = new Book("9907", "Half-Blood Prince", AuthorsList[0], 576);
        Collection[6] = new Book("81405", "Deathly Hallows", AuthorsList[0], 640);

        int counter = 0;
        for (Book i: Collection){
            System.out.println(i.toString());
            if (i.getPagesNumber() >= counter){
                counter = i.getPagesNumber();
            }
        }
        System.out.println("The book with much pages number has " + counter);
    }
}