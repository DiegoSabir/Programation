public class Senador extends Legislador{

    private String camara;

    public Senador (String dni, String nombre, String apellidos, int edad, String provinciaRepresentada, String camara){

        super(dni, nombre, apellidos, edad, provinciaRepresentada);

        this.camara = camara;
    }

    public String getCamaraEnQueTrabaja(){

        return "Camara" + camara;
    }
}
