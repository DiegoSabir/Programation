import java.util.*;

public class Revistas extends Biblioteca implements Prestable{
    private int numero;

    public Revistas(int codigo, String titulo, int añoPublicacion, int numero){
        super(codigo,titulo,añoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Codigo: " + getCodigo() + ", Titulo: " + getTitulo() + ", Año de publicacion: " + getAñoPublicacion()
                + ", Numero: " + numero;
    }

    public Date prestar(int añoPrestamo, int mesPrestamo, int diaPrestamo){
        Date fechaPrestacion;
        GregorianCalendar fecha = new GregorianCalendar(añoPrestamo, mesPrestamo - 1, diaPrestamo);
        fechaPrestacion = fecha.getTime();
        return fechaPrestacion;
    }

    public Date devolver(int añoDevolucion, int mesDevolucion, int diaDevolucion){
        Date fechaDevolucion;
        GregorianCalendar fecha = new GregorianCalendar(añoDevolucion, mesDevolucion - 1, diaDevolucion);
        fechaDevolucion = fecha.getTime();
        return fechaDevolucion;
    }
}
