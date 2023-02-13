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

        Libros[] Libro = new Libros[2];

        Libro[0] = new Libros(4452, "La piedra filosofal", 1999, false);
        Libro[1] = new Libros(4957, "La camara secreta", 1999, true);

        for (Libros i: Libro){

            System.out.println(i.toString());
        }

        Revistas[] Revista = new Revistas[2];

        Revista[0] = new Revistas(1138, "National Geographic: El imperio romano", 1997, 1);
        Revista[1] = new Revistas(1139, "National Geographic: El imperio egipcio", 1997, 2);

        for (Revistas j: Revista){

            System.out.println("Codigo: " + j.getCodigo() + ", Titulo: " + j.getTitulo() +
                    ", Año de publicacion: " + j.getAñoPublicacion() + ", Numero: " + j.getNumero());
        }
    }
}