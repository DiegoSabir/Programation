import java.io.*;
import java.util.Scanner;

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
public class Main {
    static Scanner teclado = new Scanner(System.in);
    static File fic = new File("Alumnos.txt");
    public static void main(String[] args) {
            int opcion;
            do {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        anhadirAlumno();
                        break;
                    case 2:
                        listarAlumnos();
                        break;
                    case 3:
                        consultarDatosAlumno();
                        break;
                    case 4:
                        modificarAlumno();
                        break;
                    case 5:
                        eliminarAlumno();
                        break;
                }
            } while (opcion != 0);
    }

    private static int menu() {
        System.out.println("-- Registro --");
        System.out.println("1-- Añadir alumnos");
        System.out.println("2-- Listar alumnos");
        System.out.println("3-- Consultar datos alumno");
        System.out.println("4-- Modificar alumno");
        System.out.println("5-- Eliminar alumno");
        System.out.println("0-- Salir");
        return Integer.parseInt(teclado.nextLine());
    }

    private static void anhadirAlumno() {
        System.out.println("Introduzca nombre: ");
        String name = teclado.nextLine();
        System.out.println("Introduzca apellidos: ");
        String surname = teclado.nextLine();

        System.out.println("Introduzca edad: ");
        int age = teclado.nextInt();

        teclado = new Scanner(System.in);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fic, true))) {
            oos.writeObject(new Student(name, surname, age));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void consultarDatosAlumno() {
        System.out.println("Introduzca la posición del elemento a consultar:");
        int pos = teclado.nextInt();

        teclado = new Scanner(System.in);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fic))) {
            int cont = 0;
            while (ois.available() != 0) {
                if (cont == pos) {
                    Student student = (Student) ois.readObject();
                    System.out.println(student.getName()+ " " + student.getSurname() + " " + student.getAge());
                }
                cont++;
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void modificarAlumno() {
        System.out.println("Introduzca la posición del elemento a modificar:");
        int pos = teclado.nextInt();

        teclado = new Scanner(System.in);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fic));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fic))) {
            int cont = 0;
            while (ois.available() != 0) {
                if (cont == pos) {
                    Student a = (Student) ois.readObject();
                    System.out.println("Nuevo nombre: ");
                    a.setName(teclado.nextLine());
                    System.out.println("Nuevos apellidos:");
                    a.setSurname(teclado.nextLine());
                    System.out.println("Nueva edad:");
                    a.setAge(teclado.nextInt());
                    teclado = new Scanner(System.in);
                    System.out.println(a.getName()+ " " + a.getSurname() + " " + a.getAge());
                    oos.writeObject(a);
                }
                cont++;
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void eliminarAlumno() {
        System.out.println("Introduzca la posición del elemento a eliminar:");
        int pos = teclado.nextInt();
        teclado = new Scanner(System.in);
        File ficTemp = new File ("Temporal.txt");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fic));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficTemp))) {
            int cont = 0;
            while (ois.available() != 0) {
                Student student = (Student) ois.readObject();
                if (cont != pos) {
                    oos.writeObject(student);
                }
                else {
                    System.out.println(student.getName()+ " " + student.getSurname() + " " + student.getAge());
                    System.out.println("Elemento eliminado");
                }
                cont++;
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficTemp));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fic, true))){
            while (ois.available() != 0) {
                oos.writeObject(ois.readObject());
            }
            System.out.println((ficTemp.delete() ? "Fichero temporal eliminado" : "No se pudo eliminar fichero"));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listarAlumnos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fic))) {
            while (ois.available() != 0) {
                Student student = (Student) ois.readObject();
                System.out.println(student.getName());
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
       }
    }
}