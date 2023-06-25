public abstract class Drink extends Product{
    private String envase;

    public Drink() {
        super();
        this.envase = "lata";
    }

    public Drink(int identificador, String nombre, String localizacion, double precio, String envase) {
        super(identificador, nombre, localizacion, precio);
        this.envase = envase;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    abstract void calcularPrecio();
}
