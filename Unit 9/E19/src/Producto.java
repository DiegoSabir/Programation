import java.time.LocalDate;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private Seccion seccionLocalizado;
    private LocalDate fechaCaducidad;

    public Producto() {
        this.idProducto = 1;
        this.nombreProducto = "DefectNombreProducto";
        this.seccionLocalizado = new Seccion();
        this.fechaCaducidad = LocalDate.of(2024,1,1);
    }

    public Producto(int idProducto, String nombreProducto, Seccion seccionLocalizado, LocalDate fechaCaducidad) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.seccionLocalizado = seccionLocalizado;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Seccion getSeccionLocalizado() {
        return seccionLocalizado;
    }

    public void setSeccionLocalizado(Seccion seccionLocalizado) {
        this.seccionLocalizado = seccionLocalizado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", seccionLocalizado=" + seccionLocalizado +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
