import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Paciente extends Persona{
    private Date fechaPrimerIngreso;
    private String patologia;
    private Area area;

    HashMap<Integer, Ingreso> ingresos = new HashMap<>();

    public Paciente() {
        //Viene implicito por lo que es opcional -- > super();
        this.fechaPrimerIngreso = new Date();
        this.patologia = "patologiaDefecto";
        this.area = new Area();
    }

    public Paciente(String dni, String nombre, int edad, String direccion, Date fechaPrimerIngreso, String patologia, Area area) {
        super(dni, nombre, edad, direccion);
        this.fechaPrimerIngreso = fechaPrimerIngreso;
        this.patologia = patologia;
        this.area = area;
    }

    public Date getfechaPrimerIngreso() {
        return fechaPrimerIngreso;
    }

    public void setFechaIngreso(Date fechaPrimerIngreso) {
        this.fechaPrimerIngreso = fechaPrimerIngreso;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "fechaPrimerIngreso=" + fechaPrimerIngreso +
                ", patologia='" + patologia + '\'' +
                ", area=" + area +
                '}';
    }

    public double costeAnual(){
        Iterator<Integer> it = ingresos.keySet().iterator();
        Ingreso ingreso;
        double diasIngreso = 0;
        while(it.hasNext()){
            Integer clave = it.next();
            ingreso = ingresos.get(clave);
            long restaFechas = ingreso.getFechaSalida().getTime() - ingreso.getFechaIngreso().getTime();
            TimeUnit time = TimeUnit.DAYS;
            diasIngreso = time.convert(restaFechas, TimeUnit.MILLISECONDS);
        }
        return diasIngreso;
    }
}