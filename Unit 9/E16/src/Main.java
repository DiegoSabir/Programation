/**
 * Se desea realizar una aplicación Java para la gestión de un instituto, almacenando
 * sus especialidades, alumnos y profesores.
 *
 * De las especialidades hay que almacenar su identificador y su nombre.
 * Sobre los miembros del instituto se deberán almacenar los datos propios de
 * persona (el DNI, el nombre, la edad y la dirección) y la fecha de incorporación al
 * centro como atributo propio. Existirán 2 tipos de miembros: alumnos y profesores.
 * En el caso de los alumnos, se almacenará el ciclo que se encuentra realizando, su
 * media de notas y el importe de su matrícula.
 * Para los profesores se registrará el tipo de jornada (parcial o completa), su sueldo
 * y la especialidad que imparte.
 *
 * En cuanto a los constructores, en cada clase deberá existir uno por defecto que
 * asigne valores a todos los atributos, propios y heredados; y otro parametrizado con
 * todos los atributos.
 *
 * Existirá un método común a alumnos y profesores, aplicarBonificacion, que en
 * función de la clase sobre la que se implemente, actuará de una manera u otra. En
 * el caso de los alumnos, si el alumno se ha incorporado al centro hace más de 2
 * años, el importe de su matrícula se verá reducido en un 10%. En el caso de
 * profesores, si su incorporación al centro fue hace más de 3 años, su sueldo se
 * incrementará en un 15%.
 *
 * Por último, desarrolla una clase ejecutable que realice lo siguiente:
 * - Cree un ArrayList de miembros.
 * - Asigna a cada posición un objeto de las clases anteriores, haciendo uso de
 *   los distintos constructores de cada clase. Los datos de los objetos deberán
 *   introducirse por teclado, capturando las excepciones que puedan producirse
 *   por la utilización del flujo de entrada de datos, así como por introducción de
 *   datos en formato incorrecto. En caso de que se produzca alguna de estas
 *   circunstancias, deberá mostrarse por pantalla un error y volver a solicitar el
 *   dato.
 * - Muestra por pantalla la edad media de los profesores.
 * - Calcula la nota media obtenida por los alumnos del ciclo DAM.
 * - Calcula el salario medio de los profesores
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dni, name, address, workdayType, memberType;
        int age, specialtyId;
        double salary, gradeAverage, enrollmentCost;
        Date joiningDate;

        Scanner sc = new Scanner(System.in);

        ArrayList<Member> members = new ArrayList<>();
        ArrayList<Specialty> specialties = new ArrayList<>();

        Specialty spe1 = new Specialty(1, "Aerospace Engineering");
        Specialty spe2 = new Specialty(2, "Chemical Engineering");
        Specialty spe3 = new Specialty(3, "Computer Engineering");
        Specialty spe4 = new Specialty(4, "Artificial Intelligence");
        Specialty spe5  = new Specialty(5, "Electrical Engineering");

        specialties.add(spe1);
        specialties.add(spe2);
        specialties.add(spe3);
        specialties.add(spe4);
        specialties.add(spe5);

        //for (int i = 0; i < patients.size(); i++) {
        for (int i = 0; i < 10; i++) {
            boolean validData = true;
            System.out.println("Are you a professor or student?");
            memberType = sc.nextLine();

            if (memberType.equals("Professor")) {
                do {
                    try {
                        System.out.println("Introduce your dni, name, age and address");
                        dni = sc.nextLine();
                        name = sc.nextLine();
                        age = sc.nextInt();
                        address = sc.nextLine();

                        System.out.println("Introduce your joining date to the university");
                        joiningDate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                        System.out.println("Introduce your workday type and salary");
                        workdayType = sc.nextLine();
                        salary = sc.nextDouble();

                        System.out.println("Introduce the specialty id");
                        specialtyId = sc.nextInt();

                        members.add(new Professor(dni, name, age, address, joiningDate, workdayType, salary, specialties.get(specialtyId)));
                    } catch (ParseException | InputMismatchException e) {
                        validData = false;
                        System.out.println("ERROR: INTRODUCE THE DATA AGAIN");
                    }
                } while (!validData);
            }
            else {
                do {
                    try {
                        System.out.println("Introduce your dni, name, age and address");
                        dni = sc.nextLine();
                        name = sc.nextLine();
                        age = sc.nextInt();
                        address = sc.nextLine();

                        System.out.println("Introduce your joining date to the university");
                        joiningDate = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());

                        System.out.println("Introduce your grade average and enrollment cost");
                        gradeAverage = sc.nextDouble();
                        enrollmentCost = sc.nextDouble();

                        System.out.println("Introduce your enrolled degree");
                        specialtyId = sc.nextInt();

                        members.add(new Student(dni, name , age, address, joiningDate, specialties.get(specialtyId), gradeAverage, enrollmentCost));
                    } catch (ParseException | InputMismatchException e) {
                        validData = false;
                        System.out.println("ERROR: INTRODUCE THE DATA AGAIN");
                    }
                } while (!validData);
            }
        }

        public void showAverageAgeProfessors(){
            int addition = 0;
            int counter = 0;
            for (int i = 0; i < members.size(); i++) {
                if (members.get(i) instanceof Professor) {
                    addition += ((Professor) members.get(i)).getAge();
                    counter++;
                }
            }
            System.out.println();
        }

        public void showAverageGradeComputerStudents(){
            int addition = 0;
            int counter = 0;
            for (int i = 0; i < members.size(); i++) {
                if ((members.get(i) instanceof Student) && ((Student) members.get(i)).getDegreeEnrolled().equals("Computer Engineering")){
                    addition += ((Student) members.get(i)).getGradeAverage();
                    counter++;
                }
            }
            System.out.println();
        }

        public void showAverageSalaryProfessors(){
            int addition = 0;
            int counter = 0;
            for (int i = 0; i < members.size(); i++) {
                if (members.get(i) instanceof Professor) {
                    addition += ((Professor) members.get(i)).getSalary();
                    counter++;
                }
            }
            System.out.println();
        }
    }
}