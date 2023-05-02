import java.time.LocalDate;
import java.util.HashMap;

public class Empleado extends Persona {
    private double salario;
    private Seccion seccionActual;
    private LocalDate fechaContratacion;
    private HashMap<Integer, RegistroLaboral> historialLaboral;
    private int contadorHistorial = 0;

    public Empleado(String dni, String nombre, int edad, String direccion) {
        super(dni, nombre, edad, direccion);
        this.salario = 1000;
        this.seccionActual = new Seccion();
        this.fechaContratacion = LocalDate.of(2023, 1, 1);
        this.historialLaboral = new HashMap<>();
    }

    public Empleado(String dni, String nombre, int edad, String direccion, double salario, Seccion seccionActual, LocalDate fechaContratacion) {
        super(dni, nombre, edad, direccion);
        this.salario = salario;
        this.seccionActual = seccionActual;
        this.fechaContratacion = fechaContratacion;
        this.historialLaboral = new HashMap<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Seccion getSeccionActual() {
        return seccionActual;
    }

    public void setSeccionActual(Seccion seccionActual) {
        this.seccionActual = seccionActual;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public HashMap<Integer, RegistroLaboral> getHistorialLaboral() {
        return historialLaboral;
    }

    public void agregarSeccionesHistorial (RegistroLaboral rl) {
        historialLaboral.put(contadorHistorial, rl);
        contadorHistorial++;
    }
}
