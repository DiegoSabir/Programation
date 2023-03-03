import java.util.*;
public class Autor extends Persona{

    String alias;
    Date fechaPrimeraPublicacion;

    public Autor(String dni, String nombre, int añoNacimiento, int mesNacimiento, int diaNacimiento,
                 String nacionalidad, String direccion, String telefono, String alias, int añoPublicacion,
                 int mesPublicacion, int diaPublicacion) {

        super(dni, nombre, añoNacimiento, mesNacimiento, diaNacimiento, nacionalidad, direccion, telefono);

        this.alias = alias;

        GregorianCalendar fechaPublicacion = new GregorianCalendar(añoPublicacion, mesPublicacion - 1, diaPublicacion);

        this.fechaPrimeraPublicacion = fechaPublicacion.getTime();;
    }

    public String getAlias() {

        return alias;
    }

    public void setAlias(String alias) {

        this.alias = alias;
    }

    public Date getFechaPrimeraPublicacion() {

        return fechaPrimeraPublicacion;
    }

    public void setFechaPrimeraPublicacion(Date fechaPrimeraPublicacion) {

        this.fechaPrimeraPublicacion = fechaPrimeraPublicacion;
    }
}
