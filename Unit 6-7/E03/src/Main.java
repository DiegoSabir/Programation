/**
 * Realiza una clase conversor que tenga las siguientes caracteristicas:
 * - Toma como parametro en el constructor un valor entero.
 * - Tiene un metodo getNumero que dependiendo de los parametros devolvera el mismo numero en el siguiente formato
 * Parametro Formato
 * B        Binario (String)
 * H        Hexadecimal (String)
 * O        Octal (String)
 * Realiza un main para probar todo lo anterior
 */
public class Main {
    public static void main(String[] args) {

        Conversor s = new Conversor(25);

        System.out.println(s.getTipoDato("B"));
        System.out.println(s.getTipoDato("H"));
        System.out.println(s.getTipoDato("O"));
    }
}