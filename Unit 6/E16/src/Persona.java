import java.util.*;
public class Persona {

    private String dni;

    private String nombre;

    private Date fechaDeNacimiento;

    private String nacionalidad;

    private String direccion;

    private String telefono;

    Persona (String dni, String nombre, int añoNacimiento, int mesNacimiento, int diaNacimiento, String nacionalidad, String direccion, String telefono){

        this.dni = dni;

        this.nombre = nombre;

        GregorianCalendar fechaNacimiento = new GregorianCalendar(añoNacimiento, mesNacimiento - 1, diaNacimiento);

        fechaDeNacimiento = fechaNacimiento.getTime();

        this.nacionalidad = nacionalidad;

        this.direccion = direccion;

        this.telefono = telefono;
    }

    public String getDNI() {

        return dni;
    }

    public void setDNI(String dni) {

        this.dni = dni;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {

        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {

        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNacionalidad() {

        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {

        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public String getTelefono() {

        return telefono;
    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }
}
