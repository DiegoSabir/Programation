/**
 * Se desea realizar una aplicación Java para la gestión de un supermercado, almacenando los productos, los
 * empleados y las secciones.
 *
 * De las secciones habrá que almacenar su identificador y su nombre.
 *
 * Sobre los empleados se deberá almacenar los datos propios de persona (el DNI, el nombre, la edad y la
 * dirección), su sueldo mensual, la sección en la que trabaja actualmente y la fecha de contratación. Además,
 * se deberá llevar un registro de las secciones en las que ha trabajado a lo largo del tiempo, en una estructura
 * de clave (identificador de tipo numérico), valor (sección, fecha inicio, fecha fin).
 *
 * En cuanto a los productos, se almacenará su identificador, nombre, sección a la que pertenece y fecha de
 * caducidad.
 *
 * No será necesario instanciar objetos de tipo persona.
 * Con respecto a los constructores, en cada clase deberá existir uno por defecto que asigne valores a todos los
 * atributos, propios y heredados; y otro parametrizado con todos los atributos. Recuerda respetar la
 * modularidad en todo el desarrollo del código.
 *
 * Por último, desarrolla una clase ejecutable con un menú que realice lo siguiente:
 * - Crea una lista de empleados y otra de productos
 * - Elimina de la lista aquellos empleados que trabajen actualmente en la sección de pescadería, debido
 *   a que ésta ya no se encuentra disponible en el supermercado.
 * - Muestra por pantalla en qué secciones ha trabajado cada empleado a lo largo de su trayectoria
 *   profesional.
 * - Calcula el salario medio anual (sueldo mensual * 14 pagas) de los empleados de charcutería
 * - Crea un conjunto ordenado por el campo identificador (empleando la clase java.util.Comparator), de
 *   los productos comercializados en la sección donde trabaja el empleado “Paco”. En un método
 *   independiente, recorre y muestra el contenido de dicho conjunto.
 * - Muestra por pantalla aquellos productos de la sección de “conservas”, que caduquen el año que
 *   viene.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    ArrayList<Empleado> emp = new ArrayList<>();
    ArrayList<Producto> prod = new ArrayList<>(); // FALTA RELLENAR

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;
        Main p = new Main();

        while (!salir) {

            System.out.println("1. Crear lista empleados");
            System.out.println("2. Eliminar empleados pescadería");
            System.out.println("3. Secciones trabajadas");
            System.out.println("4. Salario medio anual");
            System.out.println("5. Conjunto productos sección de Paco");
            System.out.println("6. Caducidad productos de conservas año 2024");
            System.out.println("8. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        p.crearListado();
                        break;
                    case 2:
                        p.eliminarPescaderia();
                        break;
                    case 3:
                        p.mostrarHistorico();
                        break;
                    case 4:
                        p.calcularSalarioCharcuteria();
                        break;
                    case 5:
                        p.mostrarConjunto();
                        break;
                    case 6:
                        p.caducidadConservas();
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                }

            }
            catch (InputMismatchException e) {
            }
        }
    }

    private void crearListado() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Seccion charc = new Seccion(1, "charcuteria");
        Seccion pesc = new Seccion(2, "pescaderia");
        Seccion carnic = new Seccion(3, "carniceria");
        Seccion conservas = new Seccion(4, "conservas");
        try {
            Empleado e1 = new Empleado("22222222B", "Maria", 50, "principe 43", 1200, charc, sdf.parse("01/05/2016"));
            e1.agregarEntradaRegistro(new RegistroLaboral(pesc, sdf.parse("01/05/2016"), sdf.parse("02/08/2021")));
            e1.agregarEntradaRegistro(new RegistroLaboral(carnic, sdf.parse("02/08/2021"), sdf.parse("02/01/2023")));
            emp.add(e1);

            Empleado e2 = new Empleado("33333222C", "Paco", 35, "urzaiz 3", 1500, charc, sdf.parse("01/05/2012"));
            e1.agregarEntradaRegistro(new RegistroLaboral(conservas, sdf.parse("01/05/2012"), sdf.parse("02/08/2018")));
            e1.agregarEntradaRegistro(new RegistroLaboral(carnic, sdf.parse("02/08/2018"), sdf.parse("02/01/2021")));
            emp.add(e2);

            emp.add(new Empleado("44444444D", "Marta", 29, "gran via 107", 1300, pesc, sdf.parse("01/05/2018")));
            emp.add(new Empleado("55555555D", "Alberto", 33, "castela 125", 1400, conservas, sdf.parse("01/02/2018")));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("CONTENIDO LISTADO:");
        for (Empleado e : emp) {
            System.out.println(e.toString());
        }
    }

    private void eliminarPescaderia() {
        for (int i = 0; i < emp.size(); i++) {
            if (emp.get(i).getSeccion().getNombreSeccion().equalsIgnoreCase("pescaderia")) {
                emp.remove(i);
                System.out.println("Empleado eliminado.");
            }
        }
    }

    private void mostrarHistorico() {
        for (Empleado e: emp) {
            System.out.println("El empleado " + e.getNombre() + " ha trabajado en:");
            Iterator<Map.Entry<Integer, RegistroLaboral>> it = e.getHistorico().entrySet().iterator();
            while (it.hasNext()) {
                RegistroLaboral r = it.next().getValue();
                System.out.println(r.getSeccion().getNombreSeccion());
            }
        }
    }

    private void calcularSalarioCharcuteria() {
        double salarioAnual = 0;
        int cont = 0;
        for (Empleado e: emp) {
            if(e.getSeccion().getNombreSeccion().equalsIgnoreCase("charcuteria")) {
                salarioAnual += e.getSalarioMensual()*14;
                cont++;
            }
        }
        System.out.println("El salario medio de los empleados de charcutería es: " + salarioAnual/cont);
    }

    private TreeSet<Producto> conjuntoProductos() {
        TreeSet<Producto> ts = new TreeSet<>(Comparator.comparing(Producto::getIdProducto));
        for (Empleado e: emp) {
            if (e.getNombre().equalsIgnoreCase("paco")) {
                for (Producto p: prod) {
                    if (p.getSeccion().getNombreSeccion().equalsIgnoreCase(e.getSeccion().getNombreSeccion()))
                        ts.add(p);
                }
                break;
            }
        }
        return ts;
    }

    private void mostrarConjunto() {
        Iterator<Producto> it = conjuntoProductos().iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            System.out.println(p.toString());
        }
    }

    private void caducidadConservas() {
        Calendar calendar = Calendar.getInstance(); // Creo instancia con fecha actual
        int anhoActual = calendar.get(Calendar.YEAR); // Extraigo el año actual
        for (Producto p: prod) {
            calendar.setTime(p.getFechaCaducidad()); // Modifico fecha en calendar
            int anhoCad = calendar.get(Calendar.YEAR); // Extraigo el año de caducidad
            if (anhoCad==anhoActual+1) {
                System.out.println(p.getIdProducto() + " :" + p.getNombre());
            }
        }
    }
}