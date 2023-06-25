import java.util.Scanner;

public class Viajero {
    private String DNI;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;

    private static int contador;

    public static int getContador() {
        return contador;
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

    public Viajero(String DNI, String nombre, String apellidos, String nacionalidad, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        contador++;
    }

    public Viajero() {
        this.DNI = "00000A";
        this.nombre = "nombre";
        this.apellidos = "apellidos";
        this.nacionalidad = "nacionalidad";
        this.direccion = "direccion";
        contador++;
    }

    public void getInfo(String Formato) {
        Scanner sc = new Scanner(System.in);
        if (Formato.equals("pausado")) {
            String intro;
            System.out.println("Pulse intro para obtener más info");
            int cont = 0;
            do {
                intro = sc.nextLine();
                cont++;
                switch (cont) {
                    case 1:
                        System.out.println(getDNI());
                        break;
                    case 2:
                        System.out.println(getNombre());
                        break;
                    case 3:
                        System.out.println(getApellidos());
                        break;
                    case 4:
                        System.out.println(getNacionalidad());
                        break;
                    case 5:
                        System.out.println(getDireccion());
                        break;
                }

            } while (intro.equals("") && cont <= 5);
        } else if (Formato.equals("normal")) {
            System.out.println(getDNI());
            System.out.println(getNombre());
            System.out.println(getApellidos());
            System.out.println(getNacionalidad());
            System.out.println(getDireccion());
        }
    }
}