public class Product {
    private int identificador;
    private String nombre;
    private String localizacion;
    private double precio;

    public Product(){
        this.identificador = 000;
        this.nombre = "producto";
        this.localizacion = "";
        this.precio = 0;
    }

    public Product(int identificador, String nombre, String localizacion, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
