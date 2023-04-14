import java.util.Date;

public class Student extends Member {
    private Specialty degreeEnrolled;
    private double gradeAverage;
    private double enrollmentCost;

    public Student(String dni, String name, int age, String address, Date joiningDate, Specialty degreeEnrolled, double gradeAverage, double enrollmentCost) {
        super(dni, name, age, address, joiningDate);
        this.degreeEnrolled = degreeEnrolled;
        this.gradeAverage = gradeAverage;
        this.enrollmentCost = enrollmentCost;
    }

    public Specialty getDegreeEnrolled() {
        return degreeEnrolled;
    }

    public void setDegreeEnrolled(Specialty degreeEnrolled) {
        this.degreeEnrolled = degreeEnrolled;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public double getEnrollmentCost() {
        return enrollmentCost;
    }

    public void setEnrollmentCost(double enrollmentCost) {
        this.enrollmentCost = enrollmentCost;
    }

    public void discountBonusApply(){
        if
    }
}
