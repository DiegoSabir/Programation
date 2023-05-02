import java.time.LocalDate;
import java.util.*;

public class Main {
    ArrayList<Seccion> secciones = new ArrayList<>();
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Main eleccion = new Main();

        do{
            System.out.println("Escoja una opcion:");
            System.out.println("[1] Creacion de listas");
            System.out.println("[2] Eliminacion de empleados en pescaderia");
            System.out.println("[3] Mostrar el historial laboral de los empleados ");
            System.out.println("[4] Calculo del salario anual de los empleados de la seccion charcuteria");
            System.out.println("[5] Mostrar los productos pertenecientes a la secciones donde trabaja el empleado Paco");
            System.out.println("[6] Mostrar los productos el cual su fecha de caducidad es el proximo año");
            System.out.println("[7] Salir");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    eleccion.crearListas();
                    break;
                case 2:
                    eleccion.eliminarPescaderia();
                    break;
                case 3:
                    eleccion.mostrarHistorialLaboral();
                    break;
                case 4:
                    eleccion.salarioCharcuteriaAnual();
                    break;
                case 5:
                    eleccion.productosSeccionPaco();
                    break;
                case 6:
                    eleccion.productosConservasCaducacion();
                    break;
                case 7:
                    System.out.println("PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("ERROR. Introduzca una de las opciones marcadas");
            }
        }
        while (opcion != 7);
    }

    private void crearListas(){
        Seccion s1 = new Seccion(1, "Panaderia");
        Seccion s2 = new Seccion(2, "Fruteria");
        Seccion s3 = new Seccion(3, "Charcuteria");
        Seccion s4 = new Seccion(4, "Pescaderia");
        Seccion s5 = new Seccion(5, "Conservas");

        Empleado emp1 = new Empleado("39462414A", "Diego", 24, "C. Martin Echegaray", 1000, s2, LocalDate.of(2000, 1, 1));
        Empleado emp2 = new Empleado("12345678B", "Ivan", 28, "C. Nigran", 1000, s4, LocalDate.of(2023, 1, 1));
        Empleado emp3 = new Empleado("23456789C", "Pablo", 21, "C. Castelao", 1000, s1, LocalDate.of(2023, 1, 1));
        Empleado emp4 = new Empleado("34567891D", "Roberto", 22, "C. Chapela", 1000, s3, LocalDate.of(2023, 1, 1));
        Empleado emp5 = new Empleado("45678912E", "Paco", 36, "C. Coruña", 1000, s5, LocalDate.of(2023, 1, 1));

        emp1.agregarSeccionesHistorial(new RegistroLaboral(s1, LocalDate.of(2000, 1, 1), LocalDate.of(2020, 1, 1)));
        emp1.agregarSeccionesHistorial(new RegistroLaboral(s2, LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1)));

        Producto p1 = new Producto(1, "Baguette", s1, LocalDate.of(2023, 5, 1));
        Producto p2 = new Producto(2, "Naranja", s2, LocalDate.of(2023, 5, 1));
        Producto p3 = new Producto(3, "Mortadela", s3, LocalDate.of(2023, 5, 1));
        Producto p4 = new Producto(4, "Atun Enlatado", s5, LocalDate.of(2025, 1, 1));
        Producto p5 = new Producto(5, "Mermelada Fresa", s5, LocalDate.of(2024, 1, 1));

        secciones.add(s1);
        secciones.add(s2);
        secciones.add(s3);
        secciones.add(s4);
        secciones.add(s5);

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
    }

    private void eliminarPescaderia(){
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getSeccionActual().getNombreSeccion().equalsIgnoreCase("Pescaderia")){
                empleados.remove(i);
                System.out.println("EMPLEADO ELIMINADO");
            }
        }
    }

    private void mostrarHistorialLaboral(){
        for (int i = 0; i < empleados.size(); i++){
            Iterator<Map.Entry<Integer, RegistroLaboral>> it = empleados.get(i).getHistorialLaboral().entrySet().iterator();
            System.out.println("Historial de " + empleados.get(i).getNombre());
            while (it.hasNext()) {
                RegistroLaboral rb = it.next().getValue();
                System.out.println(rb.getSeccionAsignada().getNombreSeccion());
            }
        }
    }

    private void salarioCharcuteriaAnual() {
        double salarioAnual = 0;
        int contador = 0;
        for (int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getSeccionActual().getNombreSeccion().equalsIgnoreCase("Charcuteria")){
                salarioAnual += empleados.get(i).getSalario() * 14;
                contador++;
            }
        }
        System.out.println("Salario Anual:" + salarioAnual/contador);
    }

    private TreeSet crearProductosSeccionPaco() {
        TreeSet<Producto> ts = new TreeSet<>(Comparator.comparing(Producto::getIdProducto));
        for (int i = 0; i < empleados.size(); i++){
            if (empleados.get(i).getNombre().equalsIgnoreCase("Paco")) {
                for (int j = 0; j < productos.size(); j++){
                    if (productos.get(j).getSeccionLocalizado().getNombreSeccion().equalsIgnoreCase(empleados.get(i).getSeccionActual().getNombreSeccion()))
                        ts.add(productos.get(j));
                }
                break;
            }
        }
        return ts;
    }

    private void productosSeccionPaco(){
        Iterator<Producto> it = crearProductosSeccionPaco().iterator();
        while (it.hasNext()) {
            Producto pro = it.next();
            System.out.println(pro);
        }
    }

    private void productosConservasCaducacion() {
        int actualYear = LocalDate.now().getYear();

        for (int i = 0; i < productos.size(); i++){
            int caducidadYear = productos.get(i).getFechaCaducidad().getYear();

            if (productos.get(i).getSeccionLocalizado().getNombreSeccion().equalsIgnoreCase("Conservas")
                    && (actualYear + 1 == caducidadYear)){
                System.out.println(productos.get(i));
            }
        }
    }
}