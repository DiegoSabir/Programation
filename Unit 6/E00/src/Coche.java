public class Coche {
    //ENCAPSULACION DE DATOS
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    String color;

    int peso_total;

    boolean asientos_cuero, climatizador;

    public Coche(){     //METODO CONSTRUCTOR
        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;
    }

    public String dime_largo(){     //METODO GETTER

        return "El largo del coche es " + largo;
    }

    public void establece_color(){      //METODO SETTER

        color = "azul";
    }

    public String dime_color(){

        return "El color del coche es " + color;
    }
}