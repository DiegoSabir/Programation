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

    private double altura;

    public Frigorifico(double pvp, double peso, int capacidad, double altura) {

        super(pvp, peso);

        this.capacidad = 300;

        this.altura = 170;
    }

    public Frigorifico(double pvp, String color, char consumo, double peso, int capacidad, double altura){

        super(pvp, color, consumo, peso);

        this.capacidad = 300;

        this.altura = 170;
    }

    public int getCapacidad() {

        return capacidad;
    }

    public void setCapacidad(int capacidad) {

        this.capacidad = capacidad;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double aplicarDescuento() {

        super.aplicarDescuento();
        if ((super.getConsumo() == 'A' || super.getConsumo() == 'B') && capacidad > 400) {

            super.setPVP(super.getPVP() * 0.9);
        }
        return super.getPVP();
    }
}
