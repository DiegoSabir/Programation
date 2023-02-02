import java.util.*;

public class Uso_Empleado {

    public static void main(String[] args) {

        Persona[] Personal = new Persona[2];

        Personal[0] = new Empleado("Diego Ribas", 1000, 1998, 12, 21);
        Personal[1] = new Alumno("Ivan Santana", "Informatica");
    }

    for (Persona p: Personal){

        System.out.println(p.getNombre() + ", " + p.getDescripcion());
    }
}