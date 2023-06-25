import java.util.*;

/**
 * Almacena en un HashMap los códigos postales de las provincias de Galicia.
 *  - Muestra por pantalla los datos introducidos
 *  - Pide un código postal y muestra la provincia asociada si existe sino avisa al usuario
 *  - Elimina las provincias de Lugo y Pontevedra
 *  - Muestra por pantalla los datos
 */
public class Main {
    static HashMap<Integer, String> provinces = new HashMap();

    private static void add(){
        provinces.put(32, "Ourense");
        provinces.put(36, "Pontevedra");
        provinces.put(15, "A Coruña");
        provinces.put(27, "Lugo");
        provinces.put(10, "Madrid");
        provinces.put(20, "Barcelona");
    }

    private static void removeKey(int cp) {
        provinces.remove(cp);
    }

    private static void removeByName(String provincia) {
        Iterator key = provinces.keySet().iterator();

        String province = "";
        while (key.hasNext() && !province.equalsIgnoreCase(provincia)) {
            Integer code = (Integer)key.next();
            province = provinces.get(code);
            if (province.equals(provincia)) {
                provinces.remove(code);
            }
        }
    }

    private static void checkExist(int pc) {
        if (provinces.containsKey(pc)) { // También se podría hacer con un get
            System.out.println("Province: " + provinces.get(pc));
        }
        else {
            System.out.println("Don't exist");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        add();
        System.out.println(provinces);

        System.out.print("PC:");
        checkExist(sc.nextInt());

        // Borrado Pontevedra mediante CP
        System.out.println("Removing Madrid");
        removeKey(10);

        // Borrado Lugo mediante nombre de provincia
        System.out.println("Removing Barcelona");
        removeByName("Barcelona");

        System.out.println(provinces);
    }
}