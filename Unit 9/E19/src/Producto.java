import java.util.Date;

public class Producto {
    private int idProducto;
    private String nombre;
    private Seccion seccion;
    private Date fechaCaducidad;

    public Producto() {
        this.idProducto = -1;
        this.nombre = "producto";
        this.seccion = null;
        this.fechaCaducidad = new Date();
    }

    public Producto(int idProducto, String nombre, Seccion seccion, Date fechaCaducidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.seccion = seccion;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", seccion=" + seccion +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
