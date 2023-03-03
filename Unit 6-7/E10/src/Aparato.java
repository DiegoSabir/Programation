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
 * - A los electrodomésticos que no empleen esmalte de color (gris), se les aplicará una bonificación de un 5% en el precio de venta.
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

public class Aparato {
    private double pvp;
    private String color;
    private char consumo;
    private double peso;
    public Aparato() {
        this.pvp = 100;
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = 5;
    }

    public Aparato(double pvp, double peso){
        this.pvp = pvp;
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = peso;
    }

    public Aparato (double pvp, String color, char consumo, double peso){
        this.pvp = pvp;
        this.color = color;
        if(comprobarConsumo(consumo)) {
            this.consumo = consumo;
        }
        else {
            this.consumo = 'F';
        }
        this.peso = peso;
    }

    public double getPVP(){
        return pvp;
    }

    public void setPVP(double pvp){
        this.pvp = pvp;
    }

    public String getColor(){
        return color;
    }

    public char getConsumo(){
        return consumo;
    }

    public double getPeso(){
        return peso;
    }

    private boolean comprobarConsumo(char consumo){
        return (consumo >= 65 && consumo <= 70);
    }

    public double aplicarDescuento() {
        switch (color) {
            case "gris":
                pvp *= 0.95;
        }
        switch (consumo) {
            case 'A':
                return pvp *= 0.8;
            case 'B':
                return pvp *= 0.85;
            case 'C':
                return pvp *= 0.9;
            case 'D':
                return pvp *= 0.95;
        }
        return pvp;
    }
}
