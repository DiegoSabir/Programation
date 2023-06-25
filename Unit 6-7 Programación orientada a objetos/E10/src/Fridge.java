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
public class Fridge extends Appliance {
    private double capacity;
    private double height;

    public Fridge() {
        this.capacity = 300;
        this.height = 170;
    }

    public Fridge(double pvp, double weight, double capacity, double height) {
        super(pvp, weight);
        this.capacity = capacity;
        this.height = height;
    }

    public Fridge(double pvp, String color, char quality, double weight, double capacity, double height) {
        super(pvp, color, quality, weight);
        this.capacity = capacity;
        this.height = height;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double applyDiscount(){
        super.applyDiscount();
        if((getQuality() == 'A' || getQuality() == 'B') && capacity > 400){
            return getPvp() * 0.9;
        }
        else{
            return getPvp();
        }
    }
}
