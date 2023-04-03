import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.addStudents();
        obj.vaciar();
        obj.showStudents();
    }
    private TreeSet<Student> students = new TreeSet<Student>(Comparator.comparing(Student::getSurname1).thenComparing(Student::getSurname1).thenComparing(Student::getName));
    private Scanner sc = new Scanner(System.in);

    public void addStudents() {
        System.out.println("How many students will be enrolled?");
        int quantityStudents = sc.nextInt();
        sc = new Scanner(System.in);

        for (int i = 0; i < quantityStudents; i++) {
            Student student = new Student();
            System.out.println("Name: ");
            student.setName(sc.nextLine());
            System.out.println("First Surname:");
            student.setSurname1(sc.nextLine());
            System.out.println("Second Surname:");
            student.setSurname2(sc.nextLine());
            System.out.println("Nationality:");
            student.setNationality(sc.nextLine());
            students.add(student);
        }
    }

    public void showStudents(){
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }

    public void vaciar(){
        students.clear();
    }
}