/**
 *  Implementar en Java la siguiente jerarquía:
 *  De la clase Empleado heredarán la clase Directivo, descendiente de la clase Empleado, contedrá, ademas de los
 *  atributos de su clase base, los atributos propios cargo y departamento; y la clase Operario, con su atributo propio
 *  area y nave.
 *
 *  A su vez, las clases Oficial (atributo propio linea de fabricacion) y Técnico (atributo propio sección), seran
 *  descendientes de la clase Operario.
 *
 *  Todas las clases contendran un metodo toString() para mostrar su informacion.
 *
 *  En el main, crear un array de 7 elementos, que contenga empleados de todos los tipos y, posteriormente mostrar su
 *  informacion por pantalla.
 */

import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

        Empleado[] misEmpleados = new Empleado[3];d

        misEmpleados[0] = new Empleado("Diego Ribas", 1000, 1998, 12, 21);
        misEmpleados[1] = new Empleado("Ivan Santana", 1000, 1993, 06, 31);
        misEmpleados[2] = new Empleado("Pablo Escobar", 1000, 2001, 01, 5);

        for (int i = 0; i < 3; i++){

            misEmpleados[i].subeSueldo(5);

            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + ", Sueldo: " + misEmpleados[i].dameSueldo()
                    + ", Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
        }
        
    }
}

class Empleado{

    private String nombre;

    private double sueldo;

    private Date altaContrato;

    public Empleado(String name, double salary, int año, int mes, int dia){

        nombre = name;

        sueldo = salary;

        GregorianCalendar calendario = new GregorianCalendar(año,mes - 1, dia);

        altaContrato = calendario.getTime();

    }

    public String dameNombre(){

        return nombre;
    }

    public double dameSueldo(){

        return sueldo;
    }

    public Date dameFechaContrato(){

        return altaContrato;
    }

    public void subeSueldo(double porcentaje){

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }
}