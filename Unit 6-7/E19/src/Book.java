import java.util.Date;
import java.util.GregorianCalendar;

public class Book extends Library implements Lending{
    private boolean borrowed;

    public Book(String code, String title, int yearPublication, boolean borrowed) {
        super(code, title, yearPublication);
        this.borrowed = borrowed;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Date lend(int lendingYear, int lendingMonth, int lendingDay){
        Date lendingDate;
        GregorianCalendar date = new GregorianCalendar(lendingYear, lendingMonth - 1, lendingDay);
        lendingDate = date.getTime();
        borrowed = true;
        return lendingDate;
    }

    public Date giveBack(int returnYear, int returnMonth, int returnDay){
        Date returnDate;
        GregorianCalendar date = new GregorianCalendar(returnYear, returnMonth - 1, returnDay);
        returnDate = date.getTime();
        borrowed = false;
        return returnDate;
    }

    @Override
    public String toString() {
        return super.toString() + " --> " + "Book{" +
                "borrowed=" + borrowed +
                '}';
    }
}
