public class Uso_Coche {

    public static void main (String[] args){

        Coche Renault = new Coche();    //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE

        //System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

        System.out.println(Renault.dime_largo());

        Renault.establece_color();

        System.out.println(Renault.dime_color());

    }
}
