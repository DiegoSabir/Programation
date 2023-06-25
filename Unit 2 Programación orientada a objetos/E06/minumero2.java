package RAMA.minumero;
/*
 * Realiza una clase minumero que proporcione el doble, triple y cuádruple de un número
 * proporcionado en su
 * constructor (realiza un método para doble, otro para triple y otro para cuádruple).
 * Haz que la clase tenga un
 * método main y comprueba los distintos métodos.
 * */
public class minumero2 {
    private int numelo;

    public minumero2(int numelo) {
        this.numelo = numelo;
    }

    public int getNumelo() {
        return numelo;
    }

    public void setNumelo(int numelo) {
        this.numelo = numelo;
    }

    public int getDoble() {
        return numelo * 2;
    }

    public int getTriple() {
        return numelo * 3;
    }

    public int getCuadruple() {
        return numelo * 4;
    }

    public static void main(String[] args) {
        minumero2 dato = new minumero2(10);
        System.out.println(dato.getDoble() + " " + dato.getTriple() + " " + dato.getCuadruple());
    }
}
