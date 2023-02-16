/**
 * Declara además una clase Legislador que contenga un atributo provinciaRepresentada (String) y que también almacene
 * los datos correspondientes a la clase Persona (atributos DNI, nombre, apellidos, edad).
 *
 * En dicha clase, deberá existir un método getCamaraEnQueTrabaja común a todos los tipos
 * de Legisladores (Senador y Diputado) aunque específico para cada tipo.
 *
 * Crea una lista de legisladores y muestra por pantalla la cámara en que trabajan haciendo uso del polimorfismo.
 */
public class Main {
    public static void main(String[] args) {
        Legislator[] Government = new Legislator[4];

        Government[0] = new Senator("123456789A", "Pedro", "Sanchez", 50, "Spain");
        Government[1] = new Senator("123456789A", "Alberto", "Feijoo", 61, "Galicia");
        Government[2] = new Representative("123456789A", "Santiago", "Abascal", 46, "Pais Vasco");
        Government[3] = new Representative("123456789A", "Pablo", "Iglesias", 44, "Madrid");

        for (Legislator i: Government){
            System.out.println(i.toString());
            System.out.println(i.houseWorks());
        }
    }
}