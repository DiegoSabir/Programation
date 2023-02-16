import java.util.Date;
import java.util.GregorianCalendar;

public class Magazine extends Library implements Lending{
    private int number;

    public Magazine(String code, String title, int yearPublication, int number) {
        super(code, title, yearPublication);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date lend(int lendingYear, int lendingMonth, int lendingDay){
        Date lendingDate;
        GregorianCalendar date = new GregorianCalendar(lendingYear, lendingMonth - 1, lendingDay);
        lendingDate = date.getTime();
        return lendingDate;
    }

    public Date giveBack(int returnYear, int returnMonth, int returnDay){
        Date returnDate;
        GregorianCalendar date = new GregorianCalendar(returnYear, returnMonth - 1, returnDay);
        returnDate = date.getTime();
        return returnDate;
    }

    @Override
    public String toString() {
        return super.toString() + " --> " + "Magazine{" +
                "number=" + number +
                '}';
    }
}
