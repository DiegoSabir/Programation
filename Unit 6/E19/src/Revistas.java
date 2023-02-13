import java.util.*;

public class Revistas implements Prestable{

    private int codigo;

    private String titulo;

    private int añoPublicacion;

    private int numero;

    public Revistas(int codigo, String titulo, int añoPublicacion, int numero){

        this.codigo= codigo;

        this.titulo = titulo;

        this.añoPublicacion = añoPublicacion;

        this.numero = numero;
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

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String toString() {

        return "Codigo: " + codigo + ", Titulo: " + titulo + ", Año de publicacion: " + añoPublicacion
                + ", Numero: " + numero;
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
