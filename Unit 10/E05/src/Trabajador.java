import java.time.LocalDate;

public class Trabajador extends Persona {
    private LocalDate fechaIncorporacion;
    private Area areaAsignada;
    private String cargoHospital;
    private double salario;

    public Trabajador(String dni, String nombre, int edad, String direccion) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = LocalDate.of(2023,1,1);
        this.areaAsignada = new Area();
        this.cargoHospital = "DefectCargoHospital";
        this.salario = 1000;
    }

    public Trabajador(String dni, String nombre, int edad, String direccion, LocalDate fechaIncorporacion, Area areaAsignada, String cargoHospital, double salario) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
        this.areaAsignada = areaAsignada;
        this.cargoHospital = cargoHospital;
        this.salario = salario;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Area getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(Area areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    public String getCargoHospital() {
        return cargoHospital;
    }

    public void setCargoHospital(String cargoHospital) {
        this.cargoHospital = cargoHospital;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double costeAnual(){
        return getSalario() * 14 * 1.05;
    }
}
