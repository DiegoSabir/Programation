import java.time.LocalDate;

public class RegistroLaboral {
    private Seccion seccionAsignada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public RegistroLaboral() {
        this.seccionAsignada = new Seccion();
        this.fechaInicio = LocalDate.of(2023,1,1);
        this.fechaFin = LocalDate.of(2023,1,2);;
    }

    public RegistroLaboral(Seccion seccionAsignada, LocalDate fechaInicio, LocalDate fechaFin) {
        this.seccionAsignada = seccionAsignada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Seccion getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(Seccion seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
