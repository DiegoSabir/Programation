import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int isbn;

    public Libro(String titulo, String autor, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
    /*
    public boolean equals(Object obj){
        if(obj instanceof Libro){
            Libro otro = (Libro)obj;
            if(this.isbn==otro.isbn){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
     */
}
