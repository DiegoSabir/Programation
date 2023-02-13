import java.util.Date;
import java.util.GregorianCalendar;

public class Libros implements Prestable{
    private int codigo;

    private String titulo;

    private int añoPublicacion;

    private boolean prestado;

    public Libros(int codigo, String titulo, int añoPublicacion, boolean prestado){

        this.codigo= codigo;

        this.titulo = titulo;

        this.añoPublicacion = añoPublicacion;

        this.prestado = false;
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public int getAñoPublicacion() {

        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {

        this.añoPublicacion = añoPublicacion;
    }

    public boolean isPrestado() {

        return prestado;
    }

    public void setPrestado(boolean prestado) {

        this.prestado = prestado;
    }

    public String toString() {

        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Año de publicacion: " + añoPublicacion
                + ", Estado: " + prestado;
    }

    public Date prestar(int año, int mes, int dia){

        Date fechaPrestacion;

        GregorianCalendar fecha = new GregorianCalendar(año, mes - 1, dia);

        fechaPrestacion = fecha.getTime();

        return fechaPrestacion;
    }

    public Date devolver(int año, int mes, int dia){

        Date fechaDevolucion;

        GregorianCalendar fecha = new GregorianCalendar(año, mes - 1, dia);

        fechaDevolucion = fecha.getTime();

        return fechaDevolucion;
    }
}
