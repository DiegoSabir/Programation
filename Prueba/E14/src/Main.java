/**
 * Tenemos la siguiente clase:
 * * public abstract class sorteo{
 * * protected int posibilidades;
 * * public abstract int lanzar();
 * }
 * Se pide:
 * * Crear la clase dado, la cual desciende de la clase sorteo. La clase dado, en la llamada lanzar() mostrará un número
 *   aleatorio del 1 al 6.
 * * Crear la clase moneda, la cual desciende de la clase sorteo. Esta clase en la llamada al método lanzar()mostrará
 *   las palabras cara o cruz.
 */
public class Main {
    public static void main(String[] args) {
        Raffle[] Raffles = new Raffle[2];

        Raffles[0] = new Coin(2);
        Raffles[1] = new Die(6);

        for (Raffle i: Raffles){
            System.out.println(i.threw());
        }
    }
}