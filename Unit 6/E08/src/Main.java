/**
 * Implementar en Java la siguiente jerarquía:
 * La clase Empleado contendrá la siguiente información: nombre, salario, fecha incorporación
 *
 * De la clase Empleado heredarán la clase Directivo, descendiente de la clase Empleado, contendrá, además de los
 * atributos de su clase base, los atributos propios cargo y departamento; y la clase Operario, con su atributo propio
 * área y nave.
 *
 * A su vez, las clases Oficial (atributo propio línea de fabricación) y Técnico (atributo propio sección), serán
 * descendientes de la clase Operario.
 *
 * Todas las clases contendrán un método toString() para mostrar su información.
 *
 * En el main, crear un array de 7 elementos, que contenga empleados de todos los tipos y, posteriormente mostrar su información por pantalla.
 */
public class Main {
    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[7];

        misEmpleados[0] =new Empleado("Diego", 5000, 1998, 12, 21);
        misEmpleados[1] =new Empleado("Ivan", 1000, 1993, 11, 21);
        misEmpleados[2] =new Empleado("Pablo", 1000, 2000, 11, 6);
        misEmpleados[3] =new Empleado("Fran", 1000, 1997, 9, 22);
        misEmpleados[4] =new Empleado("Angel", 1000, 1998, 12, 21);
        misEmpleados[5] =new Empleado("David", 1000, 2004, 4, 6);
        misEmpleados[6] =new Empleado("Gonzalo", 1000, 1997, 10, 23);

        for (int i = 0; i <= 6; i++){

            System.out.println("Nombre: " + misEmpleados[i].getNombre() + ", Sueldo: " + misEmpleados[i].getSueldo() +
                    ", Fecha de Alta: " + misEmpleados[i].getFechaIncorporacion());
        }
    }
}