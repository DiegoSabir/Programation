abstract class Legislador extends Persona{
    private String provinciaRepresentada;

    public Legislador (String dni, String nombre, String apellidos, int edad, String provinciaRepresentada){

        super(dni, nombre, apellidos, edad);

        this.provinciaRepresentada = provinciaRepresentada;
    }

    public abstract String getCamaraEnQueTrabaja();
}
