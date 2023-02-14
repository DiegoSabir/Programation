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
        Empleado[] Personal = new Empleado[4];
        //Si la clase es abstracta no puede ser instanciada.
        Personal[0] = new Comercial("Diego Ribas", 24, 1000, 100);
        Personal[1] = new Comercial("Ivan Santana", 31, 2000, 300);
        Personal[2] = new Repartidor("Pablo Sierra", 22, 700, "3");
        Personal[3] = new Repartidor("Francisco Miguez", 26, 1500, "3");

        for (Empleado i: Personal){
            System.out.println(i.toString());
            System.out.println(i.plus());
        }
    }
}