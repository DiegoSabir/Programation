import java.util.Date;
import java.util.GregorianCalendar;

public class Author extends Person{
    private String alias;
    Date firstPublication;
    public Author(String dni, String name, int bornYear, int bornMonth, int bornDay, String nationality, String telephoneNumber, String addres, String alias, int publicationYear, int publicationMonth, int publicationDay) {
        super(dni, name, bornYear, bornMonth, bornDay, nationality, telephoneNumber, addres);
        this.alias = alias;
        GregorianCalendar firstPublication = new GregorianCalendar( publicationYear, publicationMonth - 1, publicationDay);
        this.firstPublication = firstPublication.getTime();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getFirstPublication() {
        return firstPublication;
    }

    public void setFirstPublication(Date firstPublication) {
        this.firstPublication = firstPublication;
    }
}
