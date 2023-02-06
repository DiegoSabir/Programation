/**
 * Realiza una clase conversorfechas que tenga los siguientes métodos:
 *
 * * String normalToAmericano(String). Este método convierte una fecha en formato normal dd/mm/yyyy a
 * formato americano mm/dd/yyyy.
 *
 * * String americanoToNormal(String). Este método realiza el paso contrario, convierte fechas en formato
 * americano a formato normal.
 * */

public class Main {
    public static void main(String[] args) {

        ConversorFechas s = new ConversorFechas();

        System.out.println(s.normalToAmericano("16/08/1973"));
        System.out.println(s.normalToAmericano("08/16/1973"));
    }
}