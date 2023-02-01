import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

        private String nombre;

        private double sueldo;

        private Date altaContrato;

        public Empleado(String nombre, double sueldo, int año, int mes, int dia){

            this.nombre = nombre;

            this.sueldo = sueldo;

            GregorianCalendar calendario = new GregorianCalendar(año,mes - 1, dia);

            altaContrato = calendario.getTime();
        }

        public Empleado(){

            this(nombre, 1000, 2025, 06, 21)
        }

        public String getNombre(){

            return nombre;
        }

        public double getSueldo(){

            return sueldo;
        }

        public Date getFechaContrato(){

            return altaContrato;
        }

        public void subeSueldo(double porcentaje){

            double aumento = sueldo * porcentaje / 100;

            sueldo += aumento;
        }
}
