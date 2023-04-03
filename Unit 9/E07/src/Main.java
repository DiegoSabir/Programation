import java.util.ArrayList;
import java.util.Comparator;

/**
 * Implementar una clase Serie con las siguientes características:
 *  - Atributos: titulo, numero de temporadas,entregado, genero y creador.
 *  - Por defecto, el numero de temporadas es  3 y entregado false.
 *  - Constructores:
 *      ▪ Un constructor por defecto.
 *      ▪ Un constructor con el titulo y creador. El resto por defecto.
 *      ▪ Un constructor con todos los atributos, excepto de entregado.
 *  - Métodos:
 *      ▪ Getter y setter de todos los atributos, excepto de entregado.
 *      ▪ Sobrescribe los métodos toString.
 *
 * Crear una clase Videojuego:
 *  - Atributos: titulo, horas estimadas, entregado, genero y compañia.
 *  - Por defecto, las horas estimadas serán de 10 horas y entregado false.
 *  - Constructores:
 *      ▪ Un constructor por defecto.
 *      ▪ Un constructor con el titulo y horas estimadas. El resto por defecto.
 *      ▪ Un constructor con todos los atributos, excepto de entregado.
 *  - Métodos:
 *      ▪ Getter y setter de todos los atributos, excepto de entregado.
 *      ▪ Sobrescribe los métodos toString.
 *
 * Las clases anteriores tienen campos y métodos en común, por eso vamos a hacer una
 * interfaz llamada Entregable con los siguientes métodos:
 *  - entregar(): cambia el atributo prestado a true.
 *  - devolver(): cambia el atributo prestado a false.
 *  - isEntregado(): devuelve el estado del atributo entregado.
 *
 * Ahora crea una aplicación ejecutable y realiza lo siguiente:
 *  - Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
 *  - Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
 *  - Entrega algunos Videojuegos y Series con el método entregar().
 *  - Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
 *  - Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muéstralos en pantalla
 *    con toda su información (usa el método toString()).
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Series> seriesList = new ArrayList<>();
        ArrayList<Videogame> videogameList = new ArrayList<>();

        seriesList.add(new Series());
        seriesList.add(new Series("Game of Thrones", "George R. R. Martin "));
        seriesList.add(new Series("The Last of Us", "Jacob Minkoff"));
        seriesList.add(new Series("The Mentalist", 7, "Police procedural","Bruno Heller"));
        seriesList.add(new Series("His Dark Materials", 3, "Fantasy", "Philip Pullman" ));

        videogameList.add(new Videogame());
        videogameList.add(new Videogame("Resident Evil 4", 19));
        videogameList.add(new Videogame("God of war 3", 10));
        videogameList.add(new Videogame("Super Mario 3DS", 30, "Platform", "Nintendo"));
        videogameList.add(new Videogame("Final fantasy X", 500, "Rol", "Square Enix"));

        seriesList.get(1).deliver();
        seriesList.get(4).deliver();
        videogameList.get(0).deliver();
        videogameList.get(3).deliver();


        int delivered = 0;
        for (int i = 0; i < seriesList.size(); i++) {
            if (seriesList.get(i).isDelivered()) {
                delivered += 1;
                seriesList.get(i).giveBack();
            }
            if (videogameList.get(i).isDelivered()) {
                delivered += 1;
                videogameList.get(i).giveBack();
            }
        }
        System.out.println("Products delivered: " + delivered);


        seriesList.sort(Comparator.comparing(Series::getSeasons));
        System.out.println("The series with the most seasons is " + seriesList.get(seriesList.size() - 1));

        videogameList.sort(Comparator.comparing(Videogame::getEstimatedHours));
        System.out.println("The video game with the most estimated hours is " + videogameList.get(videogameList.size() - 1));
    }
}