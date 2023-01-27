import java.util.*;

public class Empleado {

    private String nombre;

    private double sueldo;

    private Date fechaIncorporacion;

    public Empleado(String name, double salary, int año, int mes, int dia) {
        nombre = name;

        sueldo = salary;

        GregorianCalendar fecha = new GregorianCalendar(año, mes - 1, dia);

        fechaIncorporacion = fecha.getTime();
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getSueldo() {

        return sueldo;
    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;
    }

    public Date getFechaIncorporacion() {

        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {

        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String toString() {

        return "Nombre: " + nombre + ", Sueldo: " + sueldo + ", Fecha Incorporación: " + fechaIncorporacion;
    }

}
