import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

        personal.put("145", new Empleado("Diego"));
        personal.put("200", new Empleado("Pablo"));
        personal.put("250", new Empleado("Ivan"));
        personal.put("300", new Empleado("Fran"));

        System.out.println(personal);

        personal.remove("300");

        System.out.println(personal);

        //System.out.println(personal.entrySet());
        for (Map.Entry<String, Empleado> i: personal.entrySet()){
            String clave = i.getKey();
            Empleado valor = i.getValue();
            System.out.println("Clave:" + clave + ", Valor:" + valor);
        }
    }
}

class Empleado{
    private String nombre;
    private double sueldo;
    public Empleado(String n){
        nombre = n;
        sueldo = 2000;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}