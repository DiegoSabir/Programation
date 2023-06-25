import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Programa que almacene y gestione los Nºexpediente y alumnos de la clase.
 * Utiliza un HashMap para almacenar los datos de tus compañeros de clase.
 *  - Indica cuantos alumnos hay
 *  - Pide un Nº expediente, si existe muestra el nombre del alumno, sino indica el error
 *  - Permite eliminar un alumno de nuestra lista
 */
public class Main {
    HashMap<Integer, Student> students = new HashMap();

    private void addHashMap() {
        students.put(1, new Student("11111A", "Maria", 20, "Vigo"));
        students.put(2, new Student("2222222B", "Pepe", 22, "Ourense"));
        students.put(3, new Student("33333333C", "Alvaro", 33, "Lugo"));
        students.put(4, new Student("444444D", "Ana", 21, "Vigo"));
    }

    private void verificationStudent(int nexp) {
        if (!students.containsKey(nexp)) {
            System.out.println("Student not exist");
        }
        else {
            System.out.println("Student: " + students.get(nexp).toString());
        }
    }

    private void removeRecord(int recordNumber) {
        if (students.containsKey(recordNumber)) {
            students.remove(recordNumber);
            System.out.println("Student removed");
        } else {
            System.out.println("Student not exist");
        }
    }

    private void removeStudent(String name) {
        Iterator it = students.keySet().iterator();
        Student student = new Student();
        while (it.hasNext() && !student.getName().equalsIgnoreCase(name)) {
            Integer code = (Integer) it.next();
            student = students.get(code);
            if (student.getName().equals(name)) {
                students.remove(code);
                System.out.println("Student " + name + " removed");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main obj = new Main();
        obj.addHashMap();

        System.out.println("Introduce record number:");
        obj.verificationStudent(sc.nextInt());

        System.out.print("Introduce record number to remove:");
        obj.removeRecord(sc.nextInt());

        sc = new Scanner(System.in);
        System.out.println("Remove student by name. Please introduce a name:");
        obj.removeStudent(sc.nextLine());
    }
}