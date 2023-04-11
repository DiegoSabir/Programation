import java.util.Date;
import java.util.HashMap;
public class Employ extends Person {
    private double salary;
    private Section section;
    private Date hiringDate;

    private HashMap<Integer, WorkRegister> register = new HashMap<>();

    private int counterRegister = 0;

    public Employ() {
        this.salary = 1000;
        this.section = new Section();
        this.hiringDate = new Date();
    }

    public Employ(String dni, String name, int age, String address, double salary, Section section, String fechaContratacion) {
        super(dni, name, age, address);
        this.salary = salary;
        this.section = section;
        this.hiringDate = hiringDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public HashMap<Integer, WorkRegister> getRegister() {
        return register;
    }

    public void addRegister (WorkRegister wr){
        register.put(counterRegister, wr);
        counterRegister++;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "salary=" + salary +
                ", section=" + section +
                ", hiringDate=" + hiringDate +
                ", register=" + register +
                ", counterRegister=" + counterRegister +
                '}';
    }
}
