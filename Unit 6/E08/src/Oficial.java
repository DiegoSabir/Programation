import java.util.*;
public class Oficial extends Operario{

    private String lineaFabricacion;

    public Oficial(String nombre, double sueldo, int año, int mes, int dia, String area, String nave, String lineaFab) {

        super(nombre, sueldo, año, mes, dia, area, nave);
        this.lineaFabricacion = lineaFab;
    }

    public String getLineaFab() {

        return lineaFabricacion;
    }

    public void setLineaFab(String lineaFab) {

        this.lineaFabricacion = lineaFab;
    }

    public String toString() {

        return super.toString() + "Linea Fabricación: " + lineaFabricacion;
    }
}

