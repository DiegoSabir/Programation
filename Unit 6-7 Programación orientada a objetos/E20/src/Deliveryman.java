public class Deliveryman extends Employee{
    private String space;

    public Deliveryman(String name, int age, double salary, String space) {
        super(name, age, salary);
        this.space = space;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public double plus() {
        if (getAge() < 25 && space.equals("3")) {
            setSalary(getSalary() + PLUS);
        }
        return getSalary();
    }

    @Override
    public String toString() {
        return super.toString() + " --> " + "Deliveryman{" +
                "space=" + space +
                ", total salary=" + plus() +
                '}';
    }
}
