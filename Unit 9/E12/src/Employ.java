import java.util.Date;
public class Employ extends Person {
    private Date beginningDate;
    private Area workArea;
    private String workPost;
    private double salary;

    public Employ(String dni, String name, int age, String address, Date beginningDate, Area workArea, String workPost, double salary) {
        super(dni, name, age, address);
        this.beginningDate = beginningDate;
        this.workArea = workArea;
        this.workPost = workPost;
        this.salary = salary;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Area getWorkArea() {
        return workArea;
    }

    public void setWorkArea(Area workArea) {
        this.workArea = workArea;
    }

    public String getWorkPost() {
        return workPost;
    }

    public void setWorkPost(String workPost) {
        this.workPost = workPost;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * METHODS
     */

    public double calculateCost() {
        //return salary * 14 * 1.05;
        return getSalary() * 14 * 1.05;
    }
}
