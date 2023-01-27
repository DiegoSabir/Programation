public class Coche {
    //ENCAPSULACION DE DATOS
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    private String color;

    private int peso_total;

    private boolean asientos_cuero, climatizador;

    public Coche(){                                         //METODO CONSTRUCTOR
        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;
    }

    public String datos_generales(){                        //METODO GETTER

        return "La plataforma tiene " + ruedas + " ruedas, el largo son " +
                largo/1000 + "m, un ancho de " + ancho + "m y un peso de "
                + peso_plataforma + "kg.";
    }

    public void establece_color(String color_coche){      //METODO SETTER
        color = color_coche;
    }

    public String dime_color(){

        return "El color del coche es " + color;
    }

    public void configuracion_asientos(String asientos_cuero){

        if (asientos_cuero.equals("si")){

            this.asientos_cuero = true;                //this.  --> para diferenciar a la variable de clase del parametro
        }

        else {

            this.asientos_cuero = false;
        }
    }

    public String dime_asientos(){

        if(asientos_cuero == true){

            return "Los asientos son de cuero.";
        }
        else{

            return "Los asientos son de serie.";
        }
    }

    public void configuracion_climatizador(String climatizador){

        if (climatizador.equals("si")){

            this.climatizador = true;
        }

        else {

            this.climatizador = false;
        }
    }

    public String dime_climatizador(){

        if(climatizador == true){

            return "Incorpora climatizador.";
        }
        else{

            return "Incorpora aire acondicionado.";
        }
    }

    public String dime_peso(){
        int peso_carroceria = 500;

        peso_total = peso_plataforma + peso_carroceria;

        if(asientos_cuero == true){

            peso_total += 50;
        }
        if(climatizador == true){

            peso_total += 20;
        }

        return "El peso del coche es " + peso_total;
    }

    public int dime_precio(){

        int precio_final = 10000;

        if(asientos_cuero == true){

            precio_final += 500;
        }
        if(climatizador == true){

            precio_final += 200;
        }

        return precio_final;
    }
}