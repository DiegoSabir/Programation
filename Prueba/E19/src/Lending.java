import java.util.Date;
public interface Lending {

    Date lend(int lendingYear, int lendingMonth, int lendingDay);

    Date giveBack(int returnYear, int returnMonth, int returnDay);
}
