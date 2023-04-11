import java.util.Date;
import java.util.HashMap;

public class Empleado extends Persona{
    private double salarioMensual;
    private Seccion seccion;
    private Date fechaContratacion;

    private HashMap<Integer, RegistroLaboral> historico = new HashMap<>();

    private int contHist = 0;

    public Empleado() {
        super();
        this.salarioMensual = 0;
        this.seccion = null;
        this.fechaContratacion = new Date();
    }

    public Empleado(String DNI, String nombre, int edad, String direccion, double salarioMensual, Seccion seccion, Date fechaContratacion) {
        super(DNI, nombre, edad, direccion);
        this.salarioMensual = salarioMensual;
        this.seccion = seccion;
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }


    public HashMap<Integer, RegistroLaboral> getHistorico() {
        return historico;
    }

    public void agregarEntradaRegistro (RegistroLaboral r) {
        historico.put(contHist, r);
        contHist++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("salarioMensual=").append(salarioMensual);
        sb.append(", seccion=").append(seccion);
        sb.append(", fechaCont=").append(fechaContratacion);
        sb.append(", historico=").append(historico);
        sb.append(", contHist=").append(contHist);
        sb.append('}');
        return sb.toString();
    }

    /**
    @Override
    public String toString2() {
        return "Empleado{" +
                "salarioMensual=" + salarioMensual +
                ", seccion=" + seccion +
                ", fechaContratacion=" + fechaContratacion +
                ", historico=" + historico +
                ", contHist=" + contHist +
                '}';
    }
    */
}