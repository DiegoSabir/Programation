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

    public Date prestar(int ano, int mes, int dia){

        Date fechaPrestacion;

        GregorianCalendar fecha = new GregorianCalendar(ano, mes - 1, dia);

        fechaPrestacion = fecha.getTime();

        this.prestado = true;

        return fechaPrestacion ;
    }

    public Date devolver(int añoPrestacion, int mesPrestacion, int diaPrestacion){

        Date fechaDevolucion;

        GregorianCalendar fecha = new GregorianCalendar(añoPrestacion, mesPrestacion - 1, diaPrestacion);

        fechaDevolucion = fecha.getTime();

        this.prestado = false;

        return fechaDevolucion;
    }
}
