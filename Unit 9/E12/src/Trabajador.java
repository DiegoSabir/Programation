import java.util.*;

public class Trabajador extends Persona {
    private Date fechaIncorporacion;
    private Area area;
    private String cargo;
    private float salario;

    public Trabajador() {
        this.fechaIncorporacion = new Date();
        this.area = new Area();
        this.cargo = "cargoDefecto";
        this.salario = 1000;
    }

    public Trabajador(String dni, String nombre, int edad, String direccion, Date fechaIncorporacion, Area area, String cargo, float salario) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
        this.area = area;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "fechaIncorporacion=" + fechaIncorporacion +
                ", area=" + area +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public double costeAnual(){
        double coste = 0.0;
        double plus = 0.0;
        double costeTotal = 0.0;
         coste = salario * 14;
         plus = coste * 0.05;
         costeTotal = coste + plus;
        return costeTotal;
    }
}
