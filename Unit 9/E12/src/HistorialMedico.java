import java.time.LocalDate;

public class HistorialMedico {
    private LocalDate fechaIngreso;
    private LocalDate fechaAlta;
    private Area areaIngresada;

    public HistorialMedico() {
        this.fechaIngreso = LocalDate.of(2023,1,1);
        this.fechaAlta = LocalDate.of(2023,1,2);
        this.areaIngresada = new Area();
    }

    public HistorialMedico(LocalDate fechaIngreso, LocalDate fechaAlta, Area areaIngresada) {
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = fechaAlta;
        this.areaIngresada = areaIngresada;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Area getAreaIngresada() {
        return areaIngresada;
    }

    public void setAreaIngresada(Area areaIngresada) {
        this.areaIngresada = areaIngresada;
    }
}
