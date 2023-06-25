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
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[7];

        misEmpleados[0] =new Directivo("Diego", 5000, 1998, 12, 21, "director", "ejecutivo");
        misEmpleados[1] =new Directivo("Ivan", 1000, 1993, 11, 21,"supervisor", "personal");
        misEmpleados[2] =new Directivo("Pablo", 1000, 2000, 11, 6,"gestor", "logistica");
        misEmpleados[3] =new Operario("Fran", 1000, 1997, 9, 22, "zona 3", "nave 2");
        misEmpleados[4] =new Oficial("Angel", 1000, 1998, 12, 21, "zona 3", "nave 1", "linea 1");
        misEmpleados[5] =new Oficial("David", 1000, 2004, 4, 6, "zona 2", "nave 3", "linea 2");
        misEmpleados[6] =new Oficial("Gonzalo", 1000, 1997, 10, 23, "zona 1", "nave 2", "linea 3");

        for (int i = 0; i <= 6; i++){

            System.out.println("Nombre: " + misEmpleados[i].getNombre() + ", Sueldo: " + misEmpleados[i].getSueldo() +
                    ", Fecha de Alta: " + misEmpleados[i].getFechaIncorporacion());
        }
    }
}