public class Series implements Deliverable{
    private final static int ESTIMATION_MAX = 3;
    private String title;
    private int seasons;
    private boolean delivered;
    private String genre;
    private String author;

    public Series() {
        this("", ESTIMATION_MAX, "", "");
    }

    public Series(String title, String author) {
        this(title, ESTIMATION_MAX, "", author);
    }

    public Series(String title, int seasons, String genre, String author) {
        this.title = title;
        this.seasons = seasons;
        this.genre = genre;
        this.author = author;
        this.delivered = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean getDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Series{" +
                "title='" + title + '\'' +
                ", seasons=" + seasons +
                ", delievered=" + delivered +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public void deliver() {
        delivered = true;
    }

    public void giveBack() {
        delivered = false;
    }

    public boolean isDelivered() {
        return delivered;
    }
}
