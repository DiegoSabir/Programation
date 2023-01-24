/**
 * Vamos a definir ahora una "Cuenta Joven", para ello va,ps a crear una nueva clase CuentaJoven que deriva de la
 * anterior.
 *
 * Cuando se crea esta nueva clase, ademas del titular y la cantidad se debe guardar una bonificacion que estara
 * experesada en tanto por ciento y la edad del titular de la cuenta joven.
 *
 * Construye los siguientes metodos para la clase:
 * Un constructor.
 *
 * Los setters y getters para el nuevo atributo.
 * En esta ocasion los titulares de este tipo de cuenta tienen que ser mayor, por lo tanto hay que crear un meotod
 * esTitularValido() que devuelve verdadero si el titular es mayor de edad pero menor de 25.
 *
 */
public class CuentaJoven extends Cuenta{

    private double bonificacion;

    private int edad;

    public CuentaJoven(String titular, double cantidad, double bonificacion, int edad){

        super(titular, cantidad);
        this.bonificacion = bonificacion;
        this.edad = edad;
    }

    public double getBonificacion() {

        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {

        this.bonificacion = bonificacion;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public boolean esTitularValido(int edad) {

        if(edad >= 18 && edad <= 25) {

            return true;
        }
        else {

            return false;
        }
    }
}
