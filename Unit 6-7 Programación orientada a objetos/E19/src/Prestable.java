import java.util.Date;
public interface Prestable {
    Date prestar(int añoPrestamo, int mesPrestamo, int diaPrestamo);

    Date devolver(int añoDevolucion, int mesDevolucion, int diaDevolucion);
}
