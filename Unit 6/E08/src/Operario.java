import java.util.*;

public class Operario extends Empleado{

    private String area;

    private  String nave;

    public Operario(String nombre, double sueldo, int año, int mes, int dia, String area, String nave) {

        super(nombre, sueldo, año, mes, dia);
        this.area = area;
        this.nave = nave;
    }

    public String getArea() {

        return area;
    }

    public void setArea(String area) {

        this.area = area;
    }

    public String getNave() {

        return nave;
    }

    public void setNave(String nave) {

        this.nave = nave;
    }

    public String toString() {

        return super.toString() + "Área: " + area + ", Nave: " + nave;
    }
}
