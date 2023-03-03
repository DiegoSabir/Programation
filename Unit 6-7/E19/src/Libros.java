import java.util.Date;
import java.util.GregorianCalendar;

public class Libros extends Biblioteca implements Prestable{
    private boolean prestado;

    public Libros(int codigo, String titulo, int añoPublicacion){
        super(codigo, titulo, añoPublicacion);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String toString() {
        return "Codigo: " + getCodigo() + ", Titulo: " + getTitulo() + ", Año de publicacion: " + getAñoPublicacion()
                + ", Estado: " + prestado;
    }

    public Date prestar(int añoPrestamo, int mesPrestamo, int diaPrestamo){
        Date fechaPrestacion;
        GregorianCalendar fecha = new GregorianCalendar(añoPrestamo, mesPrestamo - 1, diaPrestamo);
        fechaPrestacion = fecha.getTime();
        this.prestado = true;
        return fechaPrestacion;
    }

    public Date devolver(int añoDevolucion, int mesDevolucion, int diaDevolucion){
        Date fechaDevolucion;
        GregorianCalendar fecha = new GregorianCalendar(añoDevolucion, mesDevolucion - 1, diaDevolucion);
        fechaDevolucion = fecha.getTime();
        this.prestado = false;
        return fechaDevolucion;
    }
}
