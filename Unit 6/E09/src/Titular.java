/**
 * Vamos a crear una clase Titular. Sus atributos son: nombre , edad y DNI.
 * Construye los siguientes metodos para la clase:
 *
 * Un constructor, donde los datos pueden estar vacios.
 * Los setters y getters para cada uno de los atributos.
 * mostrar(): Muestra los datos de la persona.
 * esMayorDeEdad(): Devuelve un valor logico indicando si es mayor de edad.
 *
 * A continuacion, sustituye en la clase Cuenta y CuentaJoven todas las referencias al titular, para que, en vez de
 * gestionar sus datos a traves de atributos, lo realice mediante un objeto de tipo Titular.
 */
public class Titular {
    private String nombre;

    private int edad;

    private String dni;

    public Titular(String nombre, int edad, String dni){

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Titular(){

        this.nombre = "";
        this.edad = 0;
        this.dni = "";
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getDNI() {

        return dni;
    }

    public void setDNI(String dni) {

        this.dni = dni;
    }

    public String mostrar() {

        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni;
    }

    public boolean esMayorDeEdad(int edad) {

        if(edad >= 18) {

            return true;
        }
        else {

            return false;
        }
    }
}
