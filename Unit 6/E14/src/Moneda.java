public class Moneda extends Sorteo{

    Moneda(){

        posibilidades = 2;
    }

    public int lanzar(){

        int lado = (int) (Math.random() * posibilidades + 1);

        if (lado == 1){

            System.out.println("Cara");
        }
        else {

            System.out.println("Cruz");
        }
        return lado;
    }
}
