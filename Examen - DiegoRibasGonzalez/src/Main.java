import java.util.*;

public class Main {
    ArrayList<Employ> employees = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;

        do {
            System.out.print("Introduce a option: ");
            System.out.println("[1] Crear lista empleados");
            System.out.println("[2] Eliminar empleados pescadería");
            System.out.println("[3] Secciones trabajadas");
            System.out.println("[4] Salario medio anual");
            System.out.println("[5] Conjunto productos sección de Paco");
            System.out.println("[6] Caducidad productos de conservas año 2024");
            System.out.println("[7] Salir");

            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    createList();
                    break;
                case 2:
                    deleteEmploys();
                    break;
                case 3:
                    sections();
                    break;
                case 4:
                    averageAnnualSalary();
                    break;
                case 5:
                    paco();
                    break;
                case 6:
                    expirationDateNextYear();
                    break;
                default:
                    System.out.println("Only numbers between 1 and 7");
            }
        }
        while (choise != 7);
    }

    private void createList(){

    }

    private void deleteEmploys(){


    }

    private void sections(){


    }

    private void averageAnnualSalary(){


    }

    private void paco(){


    }

    private void expirationDateNextYear(){


    }

    public void listas(){
        empleados.add(new Employ("12345678A", "Diego", 24, "C. Vigo", 1000, new Section(1, "Fruteria"), "20/10/2023"));
        empleados.add(new Employ("21345678A", "Ivan", 28, "C. Baiona", 1000, new Section(2, "Carniceria"), "20/10/2023"));
        empleados.add(new Employ("32345678A", "Pablo", 21, "C. Tui", 1000, new Section(3, "Pescaderia"), "20/10/2023"));
        empleados.add(new Employ("43345678A", "Paco", 30, "C. Santiago", 1000, new Section(4,"Charcuteria"), "20/10/2023"));

        productos.add(new Product(1, "Manzana", new Section(1, "Fruteria"), "20/10/2023"));
        productos.add(new Product(2, "Naranja", new Section(1, "Fruteria"), "20/10/2023"));
        productos.add(new Product(3, "Fresa", new Section(1, "Fruteria"), "20/10/2023"));
        productos.add(new Product(4, "Platano", new Section(1, "Fruteria"), "20/10/2023"));
        productos.add(new Product(4, "Atun(enlatado)", new Section(5, "Conservas"), "20/10/2024"));
    }

    public void eliminarTrabajadores(){
        Iterator<Employ> it1 = empleados.iterator();
        while(it1.hasNext()){
            String seccionNombre = it1.next().getNombre();
            if(seccionNombre.equals("Pescaderia")){
                it1.remove();
            }
        }
    }

    public void calcularSalarioAnual(){

    }

    public void mostrarProductosCaducados(){
        Iterator<Product> it2 = productos.iterator();
        while(it2.hasNext()){
            Date fecha = new SimpleDateFormat().parse();
            int year = calendar.get(Calendar.YEAR);
            if(year == 2023){
                System.out.println(it2);
            }
        }
    }
}