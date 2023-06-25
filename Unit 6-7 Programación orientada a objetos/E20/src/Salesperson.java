public class Salesperson extends Employee {
    private double commission;

    public Salesperson(String name, int age, double salary, double commission) {
        super(name, age, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double plus(){
        if(getAge() > 30 && commission > 200) {
            setSalary(getSalary() + commission + PLUS);
        }
        return  getSalary();
    }

    @Override
    public String toString() {
        return super.toString() +  " --> " +  "Salesperson{" +
                "commission=" + commission +
                ", total salary=" + plus() +
                '}';
    }
}
