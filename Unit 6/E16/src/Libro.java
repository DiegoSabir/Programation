public class Libro {

    private String isbn;

    private String titulo;

    private Autor autor;

    private int numeroPaginas;

    public Libro(String isbn, String titulo, Autor autor, int numeroPaginas) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {

        return isbn;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public Autor getAutor() {

        return autor;
    }

    public void setAutor(Autor autor) {

        this.autor = autor;
    }

    public int getNumeroPaginas() {

        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {

        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {

        return "El libro con ISBN " + this.isbn + " escrito por el autor " + this.autor.getAlias() + " contiene " + this.numeroPaginas + " páginas.";
    }
}
