public class Library {
    private String code;
    private String title;
    private int yearPublication;

    public Library(String code, String title, int yearPublication) {
        this.code = code;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Library{" +
                "code=" + code +
                ", title=" + title +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
