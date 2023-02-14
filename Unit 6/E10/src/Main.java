import java.sql.SQLOutput;

/**
 * Crea un array de Electrodomesticos de 5 posiciones.
 * Ejecutar el método aplicarDescuento() para cada uno de los elementos.
 * Deberás mostrar el precio de cada tipo de aparato (instanceof)
 */
public class Main {
    public static void main(String[] args) {
        Aparato[] Electrodomesticos = new Aparato[5];

        Electrodomesticos[0] = new Frigorifico(394.74, 70, 1000, 185);
        Electrodomesticos[1] = new Frigorifico(343.14, 75, 2000, 180);
        Electrodomesticos[2] = new Frigorifico(687.14, 100, 700, 203);
        Electrodomesticos[3] = new Lavadora(498.80, 76, 10, true);
        Electrodomesticos[4] = new Lavadora(412.80, 64, 8, false);

        for (Aparato i: Electrodomesticos){
            if (i instanceof Frigorifico){
                System.out.println(i.aplicarDescuento());
            }
            else if(i instanceof Lavadora){
                System.out.println(i.aplicarDescuento());
            }
        }
    }
}
