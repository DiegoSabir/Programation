import java.util.*;

public class Tecnico extends Operario {
    private int seccion;

    public Tecnico(String nombre, double sueldo, int año, int mes, int dia, String area, String nave, int seccion) {

        super(nombre, sueldo, año, mes, dia, area, nave);
        this.seccion = seccion;
    }

    public int getSeccion() {

        return seccion;
    }

    public void setSeccion(int seccion) {

        this.seccion = seccion;
    }

    public String toString() {

        return super.toString() + "Sección: " + seccion;
    }
}
