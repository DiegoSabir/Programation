/**
 * Crear clase Aparato que contenga:
 * Atributos:
 * 	PVP
 * 	Color
 * 	Consumo (letras entre A y F)
 * 	Peso.
 * Por defecto, el color sera blanco, el consumo energético será F, el PVP 100 € y el peso 5 kg. Los posibles colores
 * son blanco, negro, rojo, azul y gris.
 * Constructores:
 *  * 	Por defecto.
 *  * 	Uno con el precio y peso. El resto por defecto.
 *  * 	Uno con todos los atributos.
 *
 * Métodos:
 * Getters y Setters.
 * comprobarConsumo(char letra): se comprueba que la letra esté entre las válidas. Si no, se asignará la letra por
 * defecto (F). Se invocará al crear el objeto.
 *
 * aplicarDescuento(): con la nueva normativa vigente, a los electrodomésticos con un menor impacto medioambiental, se
 * les aplicará un descuento:
 * - A los electrodomésticos que no empleen esmalte de color (gris), se les aplicará un descuento de un 5% en el precio de venta.
 * - Según consumo energético, se les aplicarán además los siguientes descuentos:
 *
 * LETRA	DESCUENTO
 * A		20%
 * B		15%
 * C		10%
 * D		5%
 * E		0
 * F		0
 */
public class Appliance {
    private double pvp;
    private String color;
    private char quality;
    private double weight;

    public Appliance() {
        this.pvp = 100;
        this.color = "white";
        this.quality = 'F';
        this.weight = 5;
    }

    public Appliance(double pvp, double weight) {
        this.pvp = pvp;
        this.color = "white";
        this.quality = 'F';
        this.weight = weight;
    }

    public Appliance(double pvp, String color, char quality, double weight) {
        this.pvp = pvp;
        this.color = color;
        this.quality = quality;
        this.weight = weight;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getQuality() {
        return quality;
    }

    public void setQuality(char quality) {
        this.quality = quality;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char checkQuality(char quality){
        if (quality >= 65 && quality <= 70){
            return quality;
        }
        else{
            return 'F';
        }
    }

    public double applyDiscount(){
        if (!color.equals("gray")){
            pvp *= 0.95;
        }
        if(quality == 'A'){
            return pvp *= 0.8;
        }
        else if(quality == 'B'){
            return pvp *= 0.85;
        }
        else if(quality == 'C'){
            return pvp *= 0.9;
        }
        else if(quality == 'D'){
            return pvp *= 0.95;
        }
        else{
            return pvp;
        }
    }
}
