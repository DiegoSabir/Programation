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

public class Lavadora extends Aparato{
    private double kilos;
    private boolean secadoraIntegrada;


    public Lavadora(double kilos, boolean secadoraIntegrada) {
        super();
        this.kilos = 7;
        this.secadoraIntegrada = false;
    }

    public Lavadora(double pvp, double peso, double kilos, boolean secadoraIntegrada) {
        super(pvp, peso);
        this.kilos = 7;
        this.secadoraIntegrada = false;
    }

    public Lavadora(double pvp, String color, char consumo, double peso, double kilos, boolean secadoraIntegrada) {
        super(pvp, color, consumo, peso);
        this.kilos = kilos;
        this.secadoraIntegrada = secadoraIntegrada;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public boolean isSecadoraIntegrada() {
        return secadoraIntegrada;
    }

    public void setSecadoraIntegrada(boolean secadoraIntegrada) {
        this.secadoraIntegrada = secadoraIntegrada;
    }

    public double aplicarDescuento() {
        super.aplicarDescuento();
        if (kilos > 9) {
            super.setPVP(super.getPVP() + super.getPVP() * 0.3);
        }
        if (!secadoraIntegrada){
            super.setPVP(super.getPVP() - 120);
        }
        return super.getPVP();
    }
}
