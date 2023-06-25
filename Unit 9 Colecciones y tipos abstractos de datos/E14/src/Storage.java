import java.util.HashMap;
import java.util.Iterator;

public class Storage {
    private HashMap<Integer, Product> products;
    private final int SIZE;
    private int nextId = 0;

    Storage(int size) {
        products = new HashMap<>();
        this.SIZE = size;
    }

    Storage() {
        products = new HashMap<>();
        this.SIZE = 20;
    }

    public void addProduct(Product p) {
        if (!existProduct(p) && nextId < SIZE) {
            products.put(nextId, p);
            nextId++;
        } else {
            System.out.println("The product already exists or the collection is full");
        }
    }

    public boolean existProduct(Product p) {//(int id)
        Iterator keys = products.keySet().iterator();
        Product prod;
        while (keys.hasNext()) {
            Integer code = (Integer) keys.next();
            prod = products.get(code);
            if (prod.getIdentificador() == p.getIdentificador()) {
                return true;
            }
        }
        return false;
    }

    public void showProducts() {
        System.out.println("PRODUCTS IN STOCK:");
        Iterator keys = products.keySet().iterator();
        while (keys.hasNext()) {
            Integer code = (Integer) keys.next();
            System.out.println(code + ": " + products.get(code).toString());
        }
    }

    public void deleteProduct(int id) {
        Iterator keys = products.keySet().iterator();
        Product prod;
        while (keys.hasNext()) {
            Integer code = (Integer) keys.next();
            prod = products.get(code);
            if (prod.getIdentificador() == id) {
                products.remove(code);
                System.out.println("Product " + id + " deleted");
                return;
            }
        }
        System.out.println("Product not founded");
    }
}
