/**
 * Crea un array de Electrodomesticos de 5 posiciones.
 * Ejecutar el método aplicarDescuento() para cada uno de los elementos.
 * Deberás mostrar el precio de cada tipo de aparato (instanceof)
 */
public class Main {
    public static void main(String[] args) {
        Appliance[] Appliances = new Appliance[7];

        Appliances[0] = new Fridge(500,"gray", 'A', 100, 200, 1.90);
        Appliances[1] = new Fridge(500,"black", 'B', 120, 500, 2.00);
        Appliances[2] = new Fridge(500,"white", 'C', 130, 600, 2.10);
        Appliances[3] = new Washer(500,"gray", 'A', 100, 5, false);
        Appliances[4] = new Washer(500,"black", 'B', 120, 10, false);
        Appliances[5] = new Washer(500,"white", 'C', 130, 15, true);


        for (Appliance i: Appliances){
            if(i instanceof Fridge){
                System.out.println(i.applyDiscount());
            }
            if(i instanceof Washer){
                System.out.println(i.applyDiscount());
            }
        }
    }
}