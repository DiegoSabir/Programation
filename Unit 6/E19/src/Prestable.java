import java.util.Date;
public interface Prestable {

    Date prestar(int añoPrestacion, int mesPrestacion, int diaPrestacion);

    Date devolver(int añoDevolucion, int mesDevolucion, int diaDevolucion);
}
