public class Soda extends Drink {

    private double porcentajeAzucar;

    public Soda() {
        super();
        this.porcentajeAzucar = 0;
    }

    public Soda(int identificador, String nombre, String localizacion, double precio, String envase, double porcentajeAzucar) {
        super(identificador, nombre, localizacion, precio, envase);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    void calcularPrecio() {
        if (getEnvase().equals("lata")) setPrecio(getPrecio()*0.95);
        if (getPorcentajeAzucar() > 10) setPrecio(getPrecio()*1.1);
    }

}
