public class Conversor {

    private int dato;

    public Conversor(int dato){

        this.dato = dato;
    }

    public String getTipoDato(String parametro){

        if (parametro.equals("B")) {

            return Integer.toBinaryString(dato);
        }
        if (parametro.equals("H")) {

            return Integer.toHexString(dato);
        }
        if (parametro.equals("O")) {

            return Integer.toOctalString(dato);
        }
        return "Parámetro no reconocido";
    }
}
