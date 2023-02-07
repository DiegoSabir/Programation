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
        Legislador[] Gobierno = new Legislador[2];

        Gobierno[0] = new Senador("39462414A", "Diego", "Ribas", 24, "Pontevedra", "Alta");
        Gobierno[1] = new Diputado("39487355D", "Francisco", "Miguez", 45, "A Coruña", "Baja");

        for (Legislador l: Gobierno){

            System.out.println(l.getCamaraEnQueTrabaja());
        }
    }

}