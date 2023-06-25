/**
 * Se desea implementar un programa para gestionar la información de los alumnos de un
 * colegio. Entre los datos a almacenar de cada alumno está el nombre, apellidos y edad.
 * - Se permitirá añadir nuevos alumnos, consultar modificar y eliminar datos de un
 *   alumno en una posición determinada en el fichero.
 * - La información de cada alta, baja o modificación debe ser persistente, lo que implica
 *   que debe realizarse sobre el fichero.
 * - La aplicación deberá permitir obtener un listado de los alumnos, en el orden en el
 *   que fueron dados de alta.
 */
import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static File file = new File("StudentsData.txt");
    static FileOutputStream fos;
    static ObjectOutputStream studentsList;

    static {
        try {
            fos = new FileOutputStream(file, true);
            studentsList = new ObjectOutputStream(fos);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int option;
        try {
            do {
                option = menu();
                switch (option) {
                    case 1:
                        addStudents();
                        break;
                    case 2:
                        listStudents();
                        break;
                    case 3:
                        consultDataStudent();
                        break;
                    case 4:
                        modifyStudent();
                        break;
                    case 5:
                        removeStudent();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Introduce a right number");
                        break;
                }
            }
            while (option != 6);
            studentsList.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static int menu() {
        System.out.println("Choose a option: ");
        System.out.println("[1] Add students");
        System.out.println("[2] List students");
        System.out.println("[3] Consult student data");
        System.out.println("[4] Modify student");
        System.out.println("[5] Remove student");
        System.out.println("[6] Exit");

        return Integer.parseInt(sc.nextLine());
    }

    private static void addStudents() {
        System.out.println("Introduce a name: ");
        String name = sc.nextLine();
        System.out.println("Introduce a surname: ");
        String surname = sc.nextLine();
        System.out.println("Introduce an age: ");
        int age = sc.nextInt();

        sc = new Scanner(System.in);

        try {
            studentsList.writeObject(new Student(name, surname, age));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            int counter = 1;
            while (true) {
                Student student = (Student) ois.readObject();
                System.out.println("ID: " + counter + "; " + student.getSurname() + ", " + student.getName() + "; " + student.getAge());
                counter++;
            }
        }
        catch (EOFException e) {
            System.err.println("END FILE");
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void consultDataStudent() {
        System.out.println("Introduce the student position:");
        int position = sc.nextInt();
        sc = new Scanner(System.in);

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)){
            int counter = 1;
            while (true) {
                Student student = (Student) ois.readObject();
                if (counter == position) {
                    System.out.println("ID: " + counter + "; " + student.getSurname() + ", " + student.getName() + "; " + student.getAge());
                }
                counter++;
            }
        }
        catch (EOFException e) {
            System.err.println("END FILE");
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void modifyStudent() throws IOException {
        System.out.println("Introduce the student position:");
        int position = sc.nextInt();
        sc = new Scanner(System.in);
        File temporaryFile = File.createTempFile("Temporary", ".txt");

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis);
             FileOutputStream fos = new FileOutputStream(temporaryFile, true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){

            int counter = 1;

            while (true) {
                if (counter == position) {
                    Student student = (Student) ois.readObject();
                    System.out.println("Name edit: ");
                    student.setName(sc.nextLine());
                    System.out.println("Surname edit:");
                    student.setSurname(sc.nextLine());
                    System.out.println("Age edit:");
                    student.setAge(sc.nextInt());
                    sc = new Scanner(System.in);
                    System.out.println(student.getSurname() + ", " + student.getName() + "; " + student.getAge());
                    oos.writeObject(student);
                }
                else{
                    oos.writeObject(ois.readObject());
                }
                counter++;
            }
        }
        catch (EOFException e) {
            System.err.println("END FILE");
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        volcadoFichero(temporaryFile);
    }

    private static void removeStudent() throws IOException {
        System.out.println("Introduce the student position:");
        int position = sc.nextInt();
        sc = new Scanner(System.in);
        File temporaryFile = File.createTempFile("Temporary", ".txt");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(temporaryFile))){

            int counter = 1;
            while (true) {
                Student student = (Student) ois.readObject();
                if (counter != position) {
                    oos.writeObject(student);
                }
                else {
                    System.out.println(student.getSurname() + ", " + student.getName() + "; " + student.getAge());
                    System.out.println("STUDENT REMOVED");
                }
                counter++;
            }
        }
        catch (EOFException e) {
            System.err.println("END FILE");
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        volcadoFichero(temporaryFile);
    }

    private static void volcadoFichero(File originFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(originFile);
             ObjectInputStream ois = new ObjectInputStream(fis);
             FileOutputStream fos = new FileOutputStream("StudentsData.txt");
             ObjectOutputStream resSalida = new ObjectOutputStream(fos)) {
            while (true) {
                resSalida.writeObject(ois.readObject());
            }
        }
        catch (EOFException e) {
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}