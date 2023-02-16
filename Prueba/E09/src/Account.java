public class Account {
    Owner name;
    private double quantity;

    public Account(Owner name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Account(Owner name) {
        this.name = name;
        this.quantity = quantity;
    }

    public Owner getName() {
        return name;
    }

    public void setName(Owner name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double earn (double quantityEarned){
        if(quantityEarned <= 0){
            return quantity;
        }
        else{
            return quantity += quantityEarned;
        }
    }

    public double withdraw (double quantityWithdrew){
        if(quantity - quantityWithdrew < 0){
            return 0;
        }
        else{
            return quantity -= quantityWithdrew;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name=" + name +
                ", quantity=" + quantity +
                '}';
    }
}
