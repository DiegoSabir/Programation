package Ejercicio1_Sintesis;

public class Jugador {
    private String DNI;
    private String nombre;
    private String apellidos;
    private int anho_nac;
    private Equipo equipo;

    public Jugador(String DNI, String nombre, String apellidos, int anho_nac, Equipo equipo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anho_nac = anho_nac;
        this.equipo = equipo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnho_nac() {
        return anho_nac;
    }

    public void setAnho_nac(int anho_nac) {
        this.anho_nac = anho_nac;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
