/**
 * Crear una subclase llamada Frigorifico:
 * Tendrá como atributos propios capacidad (por defecto 300 litros) y altura (por defecto 170 cm).
 * Constructores:
 * Un constructor por defecto.
 * Un constructor con el precio y peso.
 * Un constructor con la capacidad, la altura y el resto de atributos heredados.
 *
 * Métodos:
 * getters y setters.
 * aplicarDescuento(): A mayores de las bonificaciones aplicadas en Aparato según su color y eficiencia, si
 * el Frigorifico tiene un consumo energético A o B y una capacidad superior a 400 litros, se aplicará otro descuento del 10% sobre el precio de venta.
 */

public class Frigorifico extends Aparato {

    private int capacidad;

    private int altura;

    public Frigorifico() {

        super();

        capacidad = 300;

        altura = 170;
    }

    public Frigorifico(double pvp, double peso) {

        super(pvp, peso);

        capacidad = 300;

        altura = 170;
    }

    public Frigorifico(double pvp, double peso, char consumo, String color){

        super(pvp, peso, consumo, color);

        capacidad = 300;

        altura = 170;
    }
}
