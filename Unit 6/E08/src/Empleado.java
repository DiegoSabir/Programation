import java.util.*;

public class Empleado {

    private String nombre;

    private double sueldo;

    private Date FechaIncorporacion;

    public Empleado(String name, double salary, int año, int mes, int dia){
        nombre = name;

        sueldo = salary;

        GregorianCalendar fecha = new GregorianCalendar(año, mes - 1, dia);

        FechaIncorporacion = fecha.getTime();
    }

    public String getNombre(){

        return nombre;
    }

    public double getSueldo(){

        return sueldo;
    }

    public Date getFechaIncorporacion(){

        return FechaIncorporacion;
    }

}
