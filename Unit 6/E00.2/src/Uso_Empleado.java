import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

        Jefatura jefeRRHH = new Jefatura ("Marcos ", 3000, 2006, 9, 12);
        jefeRRHH.setIncentivo(2570);

        Persona[] Personal = new Persona[6];

        Personal[0] = new Empleado("Diego Ribas", 1200, 1998, 12, 21);
        Personal[1] = new Alumno("Ivan Santana", "Informatica");
        Personal[2] = new Empleado("Pablo Sierra", 1000, 1998, 12, 21);
        Personal[3] = new Empleado("Francisco Miguez", 1000, 1998, 12, 21);
        Personal[4] = jefeRRHH;
        Personal[5] = new Jefatura("Roberto", 1800, 1998, 12, 21);

        Jefatura jefeFinanzas = (Jefatura) Personal[5];

        jefeFinanzas.setIncentivo(5000);

        System.out.println(jefeFinanzas.tomarDecisiones("Mas dias de vacaciones a partir de 10 años de trabajo"));

        System.out.println("El jefe " + jefeFinanzas.getNombre() + " tiene un bonus de: " + jefeFinanzas.estableceBonus(500));
        System.out.println("El empleado " + Personal[2].getNombre() + " tiene un bonus de: " + Personal[2].estableceBonus(0.1));


        /**Comprobando instancias
        Jefatura jefeComercial = new Jefatura ("Gonzalo ", 3000, 2002, 4, 17);

        if(jefeComercial instanceof Empleado){

            System.out.println("Es de tipo Jefatura");
        }
        */


        Arrays.sort(Personal);

        for (Persona p: Personal){

            p.subeSueldo(5);
            System.out.println("Nombre: " + p.getNombre() + ", Sueldo: " + p.getSueldo() + ", Fecha de Alta: "
                    + p.getFechaContrato);
        }
    }




}