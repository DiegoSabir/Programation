/**
 * /**
 *  * Implementar una subclase Lavadora con las siguientes características:
 *  *
 *  * Sus atributos son kilos y secadora integrada (booleano). Por defecto, la capacidad será de 7 kilos y secadora
 *  * será false.
 *  * Un constructor por defecto.
 *  * Un constructor con el precio y peso. El resto por defecto.
 *  * Un constructor con la capacidad, secadora y el resto de atributos heredados. Recuerda que debes llamar al
 *  * constructor de la clase padre.
 *  * Getters y Setters
 *  * aplicarDescuento(): si tiene una capacidad superior a 9 kilos, se incrementará el precio un 30% y si no tiene
 *  * secadora integrada, se descontarán 120 €.
 */
public class Washer extends Appliance{
    private double kilo;
    private boolean dryerBuiltIn;

    public Washer(double kilo, boolean dryerBuiltIn) {
        this.kilo = 7;
        this.dryerBuiltIn = false;
    }

    public Washer(double pvp, double weight, double kilo, boolean dryerBuiltIn) {
        super(pvp, weight);
        this.kilo = 7;
        this.dryerBuiltIn = false;
    }

    public Washer(double pvp, String color, char quality, double weight, double kilo, boolean dryerBuiltIn) {
        super(pvp, color, quality, weight);
        this.kilo = kilo;
        this.dryerBuiltIn = dryerBuiltIn;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public boolean isDryerBuiltIn() {
        return dryerBuiltIn;
    }

    public void setDryerBuiltIn(boolean dryerBuiltIn) {
        this.dryerBuiltIn = dryerBuiltIn;
    }

    public double applyDiscount(){
        super.applyDiscount();
        if(kilo > 9){
            setPvp(getPvp() * 0.7);
        }
        if(!dryerBuiltIn){
            setPvp(getPvp() - 120);
        }
        return getPvp();
    }

}
