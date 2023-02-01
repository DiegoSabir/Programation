public class Pruebas {
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Diego");
        Empleados trabajador2 = new Empleados("Ivan");
        Empleados trabajador3 = new Empleados("Pablo");

        trabajador1.cambiarSeccion("RRHH");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
    }

    static class Empleados{

        private final String nombre;

        private String seccion;

        private int idEmpleado;

        private static int idNext;

        public Empleados(String name){

            nombre = name;

            seccion = "Administracion";

            idEmpleado = idNext;

            idNext++;

        }

        public void cambiarSeccion(String seccion){

            this.seccion = seccion;
        }

        public String getDatos(){

            return "Nombre: " + nombre + ", Seccion: " + seccion + ", ID: " + idEmpleado;
        }

        public static String getIdNext() {

            return "El siguiente ID es: " + idNext;
        }

    }
}