public class Uso_Vehiculo {

    public static void main (String[] args){

        Coche Renault = new Coche();    //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE

        //System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");

        System.out.println(Renault.getDatos());

        Renault.setColor("amarillo");

        System.out.println(Renault.getColor());

        Renault.configuracion_asientos("no");

        System.out.println(Renault.getAsientos());

        Renault.configuracion_climatizador("si");

        System.out.println(Renault.getClimatizador());

        System.out.println(Renault.getPeso());

        System.out.println("El precio final del coche es de " + Renault.getPrecio());

        // ------------------------------------------------------------------------------------------------------------

        Coche coche1 = new Coche();

        coche1.setColor("Rojo");

        Coche furgoneta1 = new Furgoneta(1000, 2);

        furgoneta1.setColor("Azul");

        furgoneta1.configuracion_asientos("Si");

        furgoneta1.configuracion_climatizador("Si");

        System.out.println(coche1.getDatos());

        System.out.println(furgoneta1.getDatos() + furgoneta1.getDatosFurgoneta());
    }
}
