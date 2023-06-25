package RAMA.minumero;
/*
* Realiza una clase minumero que proporcione el doble, triple y cuádruple de un número
* proporcionado en su
* constructor (realiza un método para doble, otro para triple y otro para cuádruple).
* Haz que la clase tenga un
* método main y comprueba los distintos métodos.
* */
public class minumero {

    int dato;

    minumero(int d) {
        dato = d;
    }

    public int doble() {
        return dato + dato;
    }

    public int triple() {
        return doble() + dato;
    }

    public int cuadruple() {
        return triple() + dato;
    }

    public static void main(String[] args) {
        minumero m = new minumero(5);
        System.out.println(m.doble());
        System.out.println(m.triple());
        System.out.println(m.cuadruple());
    }
}
