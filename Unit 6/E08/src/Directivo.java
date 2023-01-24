import java.util.*;

public class Directivo extends Empleado {

    private String cargo;
    private String departamento;

    public Directivo(String nombre, double sueldo, int año, int mes, int dia, String cargo, String departamento) {

        super(nombre, sueldo, año, mes, dia);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public String getDepartamento() {

        return departamento;
    }

    public void setDepartamento(String departamento) {

        this.departamento = departamento;
    }

    public String toString() {

        return super.toString() + "Cargo: " + cargo + ", Departamento: " + departamento;
    }
}
