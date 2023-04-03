import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<numberOrder> order;

    public Order(Customer customer, ArrayList<numberOrder> order) {
        this.customer = customer;
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<numberOrder> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<numberOrder> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", order=" + order +
                '}';
    }
}
