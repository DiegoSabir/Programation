public class Book {
    private String isbn;
     private String title;
     private Author author;
     private int pagesNumber;

    public Book(String isbn, String title, Author author, int pagesNumber) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String toString(){
        return "The book with ISBN " + isbn + " by author " + author.getAlias() + " has " + pagesNumber + " pages";
    }
}
