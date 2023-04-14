import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    ArrayList<Employ> employees = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Section> sections = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Main choise = new Main();

        do {
            System.out.print("Introduce a option: ");
            System.out.println("[1] Crear lista empleados y productos");
            System.out.println("[2] Eliminar empleados pescadería");
            System.out.println("[3] Secciones trabajadas");
            System.out.println("[4] Salario medio anual");
            System.out.println("[5] Conjunto productos sección de Paco");
            System.out.println("[6] Caducidad productos de conservas año 2024");
            System.out.println("[7] Salir");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    choise.createList();
                    break;
                case 2:
                    choise.deleteEmploys();
                    break;
                case 3:
                    choise.showSectionsWorked();
                    break;
                case 4:
                    choise.averageAnnualSalary();
                    break;
                case 5:
                    choise.pacoSectionsProducts();
                    break;
                case 6:
                    choise.expirationDateNextYear();
                    break;
                default:
                    System.out.println("Only numbers between 1 and 7");
            }
        }
        while (option != 7);
    }

    private void createList(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Section produceStore = new Section(1, "Fruit");
        Section butchersShop = new Section(2, "Meat");
        Section fishMarket = new Section(3, "Fish");
        Section bakery = new Section(4, "Candy");
        Section canned  = new Section(5, "Canned Food");

        try{
            Employ e1 = new Employ("15345678A", "Diego", 24, "C. Vigo", 1000, produceStore, sdf.parse("20/10/2023"));
            Employ e2 = new Employ("24345678B", "Ivan", 28, "C. Baiona", 1000, butchersShop, sdf.parse("20/10/2023"));
            Employ e3 = new Employ("33345678C", "Francisco", 28, "C. Redondela", 1000, fishMarket, sdf.parse("20/10/2023"));
            Employ e4 = new Employ("42345678D", "Pablo", 21, "C. Tui", 1000, bakery, sdf.parse("20/10/2023"));
            Employ e5 = new Employ("51345678E", "Paco", 30, "C. Santiago", 1000, canned, sdf.parse("20/10/2023"));

            Product p1 = new Product(1, "Apple", produceStore, sdf.parse("20/10/2023"));
            Product p2 = new Product(2, "Fillet Steak", butchersShop, sdf.parse("20/10/2023"));
            Product p3 = new Product(3, "Filet", fishMarket, sdf.parse("20/10/2023"));
            Product p4 = new Product(4, "Baguette", bakery, sdf.parse("20/10/2023"));
            Product p5 = new Product(5, "Tuna(canned)", canned, sdf.parse("20/10/2024"));
            Product p6 = new Product(6, "Orange", produceStore, sdf.parse("20/10/2024"));
            Product p7 = new Product(7, "Cutlet", butchersShop, sdf.parse("20/10/2024"));
            Product p8 = new Product(8, "Octopus", fishMarket, sdf.parse("20/10/2024"));
            Product p9 = new Product(9, "Pie", bakery, sdf.parse("20/10/2024"));
            Product p10 = new Product(10, "Strawberry Jam", canned, sdf.parse("20/10/2024"));

            e1.addRegister(new WorkRegister(produceStore, sdf.parse("20/10/2020", sdf.parse("11/04/2023")));
            e1.addRegister(new WorkRegister(bakery, sdf.parse("12/04/2023", sdf.parse("20/10/2025")));

            e2.addRegister(new WorkRegister(butchersShop, sdf.parse("20/10/2020", sdf.parse("11/04/2023")));
            e2.addRegister(new WorkRegister(produceStore, sdf.parse("12/04/2023", sdf.parse("20/10/2025")));

            e3.addRegister(new WorkRegister(fishMarket, sdf.parse("20/10/2020", sdf.parse("20/10/2025")));

            e4.addRegister(new WorkRegister(bakery, sdf.parse("20/10/2020", sdf.parse("11/04/2023")));
            e4.addRegister(new WorkRegister(butchersShop, sdf.parse("12/04/2023", sdf.parse("20/10/2025")));

            e5.addRegister(new WorkRegister(canned, sdf.parse("20/10/2020", sdf.parse("11/04/2023")));

            employees.add(e1);
            employees.add(e2);
            employees.add(e3);
            employees.add(e4);
            employees.add(e5);

            products.add(p1);
            products.add(p2);
            products.add(p3);
            products.add(p4);
            products.add(p5);
            products.add(p6);
            products.add(p7);
            products.add(p8);
            products.add(p9);
            products.add(p10);
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }

        for (Employ e : employees) {
            System.out.println(e.toString());
        }
    }

    private void deleteEmploys(){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSection().getSectionName().equalsIgnoreCase("Fish")) {
                employees.remove(i);
                System.out.println("Employ removed");
            }
        }
    }

    private void showSectionsWorked(){
        for (Employ e: employees) {
            System.out.println("Employ: " + e.getName() + ", Worked:");
            Iterator<Map.Entry<Integer, WorkRegister>> it = e.getRegister().entrySet().iterator();
            while (it.hasNext()) {
                WorkRegister r = it.next().getValue();
                System.out.println(r.getSection().getSectionName());
            }
        }
    }

    private void averageAnnualSalary(){
        double annualSalary = 0;
        int counter = 0;
        for (Employ e: employees) {
            if(e.getSection().getSectionName().equalsIgnoreCase("Meat")) {
                annualSalary += e.getSalary()*14;
                counter++;
            }
        }
        System.out.println("Annual Salary:" + annualSalary/counter);
    }

    private TreeSet<Product> pacoSectionsProducts() {
        TreeSet<Product> ts = new TreeSet<>(Comparator.comparing(Product::getIdProduct));
        for (Employ e: employees) {
            if (e.getName().equalsIgnoreCase("Paco")) {
                for (Product p: products) {
                    if (p.getSection().getSectionName().equalsIgnoreCase(e.getSection().getSectionName()))
                        ts.add(p);
                }
                break;
            }
        }
        return ts;
    }

    private void expirationDateNextYear(){


    }
}