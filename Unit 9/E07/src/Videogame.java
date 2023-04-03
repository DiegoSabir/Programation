public class Videogame implements Deliverable {
    private final static int ESTIMATION_MAX = 10;
    private String title;
    private int estimatedHours;
    private boolean delivered;
    private String genre;
    private String company;

    public Videogame() {
        this("", ESTIMATION_MAX, "", "");
    }

    public Videogame(String title, int estimatedHours) {
        this(title, ESTIMATION_MAX, "", "");
    }

    public Videogame(String title, int estimatedHours, String genre, String company) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.delivered = false;
        this.genre = genre;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "title='" + title + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", company='" + company + '\'' +
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
