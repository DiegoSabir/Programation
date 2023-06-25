public class Food extends Product{
    private String categoria;
    private boolean sinGluten;

    public Food() {
        super();
        this.sinGluten = true;
        this.categoria = "conservas";
    }

    public Food(int identificador, String nombre, String localizacion, double precio, boolean sinGluten, String categoria) {
        super(identificador, nombre, localizacion, precio);
        this.sinGluten = sinGluten;
        this.categoria = categoria;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
