/**
 * Se desea implementar una aplicación para gestión de Libros y Autores de una editorial.
 * Deberá existir una clase Autor que incluya un campo alias y la fecha de la primera publicación del autor.
 * Por otro lado, existirá una clase Persona que contenga los campos DNI, Nombre, fecha de nacimiento, nacionalidad,
 * telefono y direccion, de la cual heredará Autor.
 * Por último, se debe crear una clase Libro que contenga los siguientes atributos:
 * – ISBN
 *
 * – Titulo
 *
 * – Autor
 *
 * – Número de páginas
 *
 * Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método toString() para mostrar
 * la información relativa al libro con el siguiente formato:
 *
 * “El libro con ISBN creado por el autor NOMBRE_AUTOR tiene X páginas”
 *
 * En el fichero main, crear varios objetos Libro y mostrarlos por pantalla.
 *
 * Por último, indicar cuál de los 2 tiene más páginas.
 */

public class Main {
    public static void main(String[] args) {
        Autor[] ListaAutores = new Autor[2];

        ListaAutores[0] = new Autor("123456789A", "George", 1998, 12, 21,
                "Estadounidense","Calle Castelao", "+34 986 298 617", "G.R",2012,
                12, 21);

        Libro[] Coleccion = new Libro[2];

        Coleccion[0] = new Libro("9788491740322", "Cancion de Hielo y Fuego", ListaAutores[0], 192);

        for (Libro l: Coleccion){

            System.out.println(l.toString());
        }

    }
}