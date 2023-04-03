import java.util.*;
public class Ingreso{
    private Date fechaIngreso;
    private Date fechaSalida;
    private Area area;

    public Ingreso() {
        this.fechaIngreso = new Date();
        this.fechaSalida = new Date();
        this.area = new Area();
    }

    public Ingreso(Date fechaIngreso, Date fechaSalida, Area area) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.area = area;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}