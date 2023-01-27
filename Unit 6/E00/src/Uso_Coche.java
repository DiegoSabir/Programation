public class Uso_Coche {

    public static void main (String[] args){

        Coche Renault = new Coche();    //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE

        //System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

        System.out.println(Renault.datos_generales());

        Renault.establece_color("amarillo");

        System.out.println(Renault.dime_color());

        Renault.configuracion_asientos("no");

        System.out.println(Renault.dime_asientos());

        Renault.configuracion_climatizador("si");

        System.out.println(Renault.dime_climatizador());

        System.out.println(Renault.dime_peso());

        System.out.println("El precio final del coche es de " + Renault.dime_precio());
    }
}
