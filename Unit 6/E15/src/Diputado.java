public class Diputado extends Legislador{

    private String camara;

    public Diputado (String dni, String nombre, String apellidos, int edad, String provinciaRepresentada, String camara){

        super(dni, nombre, apellidos, edad, provinciaRepresentada);

        this.camara = camara;
    }

    public String getCamaraEnQueTrabaja(){

        return "Camara " + camara;
    }
}
