import java.time.LocalDate;
import java.util.Date;
public class Professor extends Member{
    private String workdayType;
    private double salary;
    private Specialty specialtyGive;

    public Professor(String dni, String name, int age, String address, LocalDate joiningDate) {
        super(dni, name, age, address, joiningDate);
        this.workdayType = "Defect workday Type";
        this.salary = 1000;
        this.specialtyGive = new Specialty();
    }

    public Professor(String dni, String name, int age, String address, LocalDate joiningDate, String workdayType, double salary, Specialty specialtyGive) {
        super(dni, name, age, address, joiningDate);
        this.workdayType = workdayType;
        this.salary = salary;
        this.specialtyGive = specialtyGive;
    }

    public String getWorkdayType() {
        return workdayType;
    }

    public void setWorkdayType(String workdayType) {
        this.workdayType = workdayType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Specialty getSpecialtyGive() {
        return specialtyGive;
    }

    public void setSpecialtyGive(Specialty specialtyGive) {
        this.specialtyGive = specialtyGive;
    }

    public void discountBonusApply(){

    }
}
