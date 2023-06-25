/**
 * Diseña una clase con un método que permita averiguar la última cifra de un número introducido por teclado.
 * */
public class Main {
    public static void main(String[] args) {

        int dato = getNumber();
        dato = getUltimaCifra(dato);
        System.out.println("La última cifra es: " + dato);
    }
}