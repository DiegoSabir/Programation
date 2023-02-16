import java.sql.SQLOutput;

/**
 * Implementar un programa que gestione empleados.
 *
 * Características:
 * Nombre
 * Edad
 * Salario
 * También existirá una constante llamada PLUS, que tendrá un valor de 300€
 *
 * La clase empleado no necesitará ser instanciada.
 * Existen dos tipos de empleados: repartidor y comercial.
 *
 * El comercial, aparte de los atributos anteriores, tiene uno propio llamado comisión (double).
 *
 * El repartidor, aparte de los atributos de empleado, tiene otro propio zona (String).
 *
 * Crea sus constructores, getters and setters y toString.
 *
 * Las clases tendrán un método llamado plus, que según en cada clase tendrá una implementación distinta.
 * En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se le aplicará el plus.
 * En repartidor, si tiene menos de 25 y reparte en la “zona 3”, recibirá el plus.
 *
 * Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar que funciona.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] Person = new Employee[4];

        Person[0] = new Salesperson("Diego", 24, 1000, 100);
        Person[1] = new Salesperson("Ivan", 31, 1000, 300);
        Person[2] = new Deliveryman("Pablo", 22, 1000, "1");
        Person[3] = new Deliveryman("Fran", 24, 1000, "3");

        for (Employee i: Person){
            System.out.println(i.toString());
        }
    }
}