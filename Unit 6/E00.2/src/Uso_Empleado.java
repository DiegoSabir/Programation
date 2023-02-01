import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

        Jefatura jefeRRHH = new Jefatura("Diego Ribas", 2000, 1998, 12, 21);

        jefeRRHH.setIncentivo(1000);

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = jefeRRHH; //Polimorfismo en accion. Principio de sustitucion
        misEmpleados[1] = new Empleado("Ivan Santana", 1000, 1993, 06, 31);
        misEmpleados[2] = new Empleado("Pablo Escobar", 1000, 2001, 01, 5);

        for (int i = 0; i < 3; i++){

            misEmpleados[i].subeSueldo(5);

            System.out.println("Nombre: " + misEmpleados[i].getNombre() + ", Sueldo: " + misEmpleados[i].getSueldo()
                    + ", Fecha de Alta: " + misEmpleados[i].getFechaContrato());
        }
    }
}