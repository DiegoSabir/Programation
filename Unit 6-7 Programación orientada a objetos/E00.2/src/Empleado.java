import java.util.Date;
import java.util.GregorianCalendar;

class Empleado extends Persona implements Comparable, Trabajadores{

    public int compareTo(Object miObjeto){

        Empleado otroEmpleado = (Empleado) miObjeto;

        if(this.sueldo < otroEmpleado.sueldo){

            return -1;
        }
        if(this.sueldo > otroEmpleado.sueldo){

            return 1;
        }
        return 0;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int idNext;
    private int id;

    public Empleado(String nombre, double sueldo, int año, int mes, int dia){

        this.nombre = nombre;

        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(año,mes - 1, dia);

        altaContrato = calendario.getTime();

        ++idNext;

        id = idNext;
    }

    public Empleado(String nombre){

        this(nombre, 3000, 2000, 01, 01);
    }

    public String getNombre(){

        return nombre + "Id: " + id;
    }

    public double getSueldo(){

        return sueldo;
    }

    public Date getFechaContrato(){

        return altaContrato;
    }

    public void subeSueldo(double porcentaje){

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }

    public String getDescripcion(){

        return "Salario: " + sueldo;
    }

    public double estableceBonus(double gratificacion){

        return Trabajadores.bonusBase + gratificacion;
    }
}
