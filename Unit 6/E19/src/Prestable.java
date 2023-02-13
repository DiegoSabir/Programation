import java.util.Date;
public interface Prestable {

    Date prestar(int año, int mes, int dia);

    Date devolver(int año, int mes, int dia);
}
