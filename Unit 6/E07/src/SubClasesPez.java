public class SubClasesPez extends Pez{
    private String localizacion;

    SubClasesPez(String nombre, String localizacion){

        super(nombre);

        this.localizacion = localizacion;
    }

    public String getLocalizacion() {

        return localizacion;
    }

    public void setLocalizacion(String localizacion) {

        this.localizacion = localizacion;
    }

    public void ubicacionPez(){

        System.out.println(super.getNombre() + " " + this.localizacion);
    }
}
