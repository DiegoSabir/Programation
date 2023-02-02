import java.util.Date;
import java.util.GregorianCalendar;

class Empleado extends Persona{

        private double sueldo;

        private Date altaContrato;

        public Empleado(String nombre, double sueldo, int año, int mes, int dia){

            super(nombre);

            this.sueldo = sueldo;

            GregorianCalendar calendario = new GregorianCalendar(año,mes - 1, dia);

            altaContrato = calendario.getTime();
        }

        public String getDescripcion(){

            return "Salario: " + sueldo;
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
