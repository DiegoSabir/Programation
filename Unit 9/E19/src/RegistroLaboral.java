import java.util.Date;

public class RegistroLaboral {
    private Seccion seccion;
    private Date fechaInicio;
    private Date fechaFin;

    public RegistroLaboral(Seccion seccion, Date fechaInicio, Date fechaFin) {
        this.seccion = seccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
