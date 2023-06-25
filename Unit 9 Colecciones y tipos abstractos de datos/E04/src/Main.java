import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Se necesita desarrollar un programa que gestione los pedidos que llegan a un almacen desde las
 * diferentes tiendas a las que suministra.
 * El suministro se realiza por riguroso orden de llegada de cada pedido y bajo ningun concepto se puede
 * trabajar en un pedido sin haber finalizado el correspondiente.
 * Cada pedido contendra informacion sobre el cliente que lo ha realizado y los produtos que se han
 * solicitado (tipo y cantidad). Obviamente los mismos productos pueden estar en varios pedidos y
 * cualquier cliente puede solicitar los mismo productos en diferentes pedidos. Implemeneta el TAD mas
 * apropiado para dar solucion a esta situacion, elige las colecciones que empleara para ello y
 * desarrolla las clases pedido, producto y cliente.
 */
public class Main {
    public static void main(String[] args) {

        LinkedList<Order> orders = new LinkedList<>();
        Product p1 = new Product(0, "Sofa", "900cm x 800cm x 700cm");
        Product p2 = new Product(1, "Table", "600cm x 500cm x 400cm");
        Product p3 = new Product(2, "Chair", "300cm x 200cm x 100cm");

        Customer c1 = new Customer("98765432A", "C. Martin Echegaray", "+986298617");
        Customer c2 = new Customer("12345678B", "A. Buenos Aires", "+604053218");

        ArrayList<numberOrder> numbers = new ArrayList<>();
        //FIRST ORDER
        numbers.add(new numberOrder(p1, 1));
        orders.add(new Order(c1, numbers));

        //SECOND ORDER
        numbers.add(new numberOrder(p2, 1));
        numbers.add(new numberOrder(p3, 4));
        orders.add(new Order(c2, numbers));

        System.out.println("FIRST ORDER:");
        System.out.println(orders.peek().toString());

        listOrders(orders);

        System.out.println("LAST ORDER:");
        System.out.println(orders.getLast().toString());

        System.out.println("REMOVE LAST ORDER:");
        System.out.println(orders.removeLast().toString());

        listOrders(orders);
    }
    private static void listOrders (LinkedList<Order> orders) {
        System.out.println("ORDER LIST: ");
        for (Order p : orders) {
            System.out.println(p.toString());
        }
    }
}