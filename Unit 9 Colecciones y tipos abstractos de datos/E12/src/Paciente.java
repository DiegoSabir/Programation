import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Iterator;

public class Paciente extends Persona{
    private LocalDate fechaIngresoActual;
    private String patologia;
    private HashMap<Integer, HistorialMedico> historial;

    public Paciente(String dni, String nombre, int edad, String direccion) {
        super(dni, nombre, edad, direccion);
        this.fechaIngresoActual = LocalDate.of(2023,1,1);
        this.patologia = "DefectPatologia";
        this.historial = new HashMap<>();
    }

    public Paciente(String dni, String nombre, int edad, String direccion, LocalDate fechaIngreso, String patologia) {
        super(dni, nombre, edad, direccion);
        this.fechaIngresoActual = fechaIngreso;
        this.patologia = patologia;
        this.historial = new HashMap<>();
    }

    public LocalDate getFechaIngresoActual() {
        return fechaIngresoActual;
    }

    public void setFechaIngresoActual(LocalDate fechaIngresoActual) {
        this.fechaIngresoActual = fechaIngresoActual;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public HashMap<Integer, HistorialMedico> getHistorial() {
        return historial;
    }

    public void setHistorial(HashMap<Integer, HistorialMedico> historial) {
        this.historial = historial;
    }

    public double costeAnual(){
        Iterator it = historial.keySet().iterator();
        HistorialMedico hm;
        double coste, costeTotal = 0;

        while(it.hasNext()){
            Integer codigo = (Integer) it.next();
            hm = this.historial.get(codigo);

            long dias = ChronoUnit.DAYS.between(hm.getFechaAlta(), hm.getFechaIngreso());

            coste = dias * 700;
            if(hm.getAreaIngresada().getNombreArea().equalsIgnoreCase("Traumatologia")){
                coste *= 1.02;
            }
            costeTotal += coste;
        }
        return costeTotal;
    }
}
