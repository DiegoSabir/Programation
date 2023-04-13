import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Se desea realizar una aplicación Java para la gestión de un hospital, almacenando
 * sus áreas, trabajadores y pacientes ingresados.
 *
 * De las áreas hay que almacenar su identificador y su nombre de especialidad
 * médica.
 *
 * Sobre los trabajadores se deberán almacenar los datos propios de persona (el DNI,
 * el nombre, la edad y la dirección), la fecha de incorporación, el área sanitaria en la
 * que trabaja, su cargo en el hospital y su salario.
 * En el caso de los pacientes, se almacenarán los datos propios de persona (el DNI,
 * el nombre, la edad y la dirección), la fecha de ingreso, patología actual y áreas en
 * las que ha sido ingresado a lo largo del tiempo. Dicho registro deberá realizarse
 * empleando una estructura que emplee un identificador como clave y un valor que
 * contenga fecha de ingreso, fecha de salida y área en la que ha sido ingresado.
 *
 * En cuanto a los constructores, en cada clase deberá existir uno por defecto que
 * asigne valores a todos los atributos, propios y heredados; y otro parametrizado con
 * todos los atributos.
 *
 * Para ambos casos, médicos y pacientes, deberá calcularse el coste que ha supuesto
 * en el año en curso, una persona (trabajador o paciente) para el hospital. En el caso
 * de un trabajador, el coste será el resultado de multiplicar su sueldo por 14 pagas y
 * sumarle un plus de un 5% al total, para contar asuntos imprevistos. En el caso de los
 * pacientes, será el número de días que ha sido ingresado en cada área multiplicado
 * por 700€. Además, en el caso de que el ingreso sea en el área de traumatología,
 * habrá que sumarle un plus de un 2%.
 *
 * Por último, desarrolla una clase ejecutable que realice lo siguiente:
 * - Cree una lista de trabajadores y pacientes del hospital.
 * - Asigna a cada posición un objeto de las clases anteriores, haciendo uso de
 *   los distintos constructores de cada clase. Se deberá comprobar la validez de
 *   los datos introducidos y lanzar una excepción informando de lo sucedido en
 *   los siguientes casos:
 *   + En caso de que la edad introducida sea un número negativo.
 *   + En caso de que el DNI no posea una longitud de 9 caracteres.
 *   + En caso de que la fecha de salida de cada ingreso sea anterior a la de entrada.
 *   + En caso de que el nombre del área sea distinto a las que posee el hospital: cardiología,
 *     pediatría, traumatología, neumología y oncología.
 * - Muestra por pantalla el salario medio del personal de enfermería, así como el
 *   salario máximo de los médicos del área de cardiología.
 * - Calcula el tiempo total en días que ha estado ingresado cada paciente en el hospital.
 * - Muestra por pantalla el área sanitaria que más coste anual ha supuesto en el año en curso.
 */
public class Main {
    ArrayList<Employ> employees = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Main choise = new Main();

        do {
            System.out.print("Introduce a option: ");
            System.out.println("[1] Crear lista de trabajadores y pacientes");
            System.out.println("[2] Mostrar el salario medio de enfermeria y medicos de cardiologia");
            System.out.println("[3] Dias totales ingresados de cada paciente");
            System.out.println("[4] Area de trabajo que mas coste produce anualmente");
            System.out.println("[5] Salir");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    choise.createList();
                    break;
                case 2:
                    choise.averageSalary();
                    break;
                case 3:
                    choise.totalDays();
                    break;
                case 4:
                    choise.higherCostWorkArea();
                    break;
                default:
                    System.out.println("Only numbers between 1 and 5");
            }
        }
        while (option != 5);
    }

    private void createList(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Area a1 = new Area(1, "Digestive");
        Area a2 = new Area(2, "Cardiology");
        Area a3 = new Area(3, "Orthopedics");
        Area a4 = new Area(4, "Pediatrics");
        Area a5  = new Area(5, "Emergencies");

        try{
            Employ e1 = new Employ("15345678A", "Diego", 24, "C. Vigo", sdf.parse("01/01/2015"), a4, "Nurse", 1000);
            Employ e2 = new Employ("24345677B", "Ivan", 28, "C. Baiona", sdf.parse("01/01/2015"), a2, "Nurse", 1000);
            Employ e3 = new Employ("33345676C", "Francisco", 28, "C. Redondela", sdf.parse("01/01/2015"), a3, "Nurse", 1000);
            Employ e4 = new Employ("42345675D", "Pablo", 21, "C. Tui", sdf.parse("01/01/2015"), a1, "Nurse", 1000);
            Employ e5 = new Employ("51345674E", "Marcos", 30, "C. Santiago", sdf.parse("01/01/2015"), a5, "Nurse", 1000);
            Employ e6 = new Employ("69345673F", "Nuria", 30, "C. Coruña", sdf.parse("01/01/2010"), a5, "Doctor", 3000);
            Employ e7 = new Employ("78345672G", "Alejandro", 30, "C. Lisboa", sdf.parse("01/01/2010"), a5, "Doctor", 3000);
            Employ e8 = new Employ("87345671H", "Sancho", 30, "C. Argentina", sdf.parse("01/01/2005"), a5, "Doctor", 6000);
            Employ e9 = new Employ("96345679I", "Rafa", 30, "C. Ourense", sdf.parse("01/01/2013"), a5, "Doctor", 2000);
            Employ e10 = new Employ("15345678J", "Luis", 30, "C. Lugo", sdf.parse("01/01/2008"), a5, "Doctor", 4500);

            Patient p1 = new Patient("87654351Z", "Angel", 20, "C. Porriño", sdf.parse("20/10/2023"), "Digestive");
            Patient p2 = new Patient("77654342Y", "David", 18, "C. Urzaiz", sdf.parse("20/10/2023"), "Pediatrics");
            Patient p3 = new Patient("67654333X", "Hector", 28, "C. Gran Via", sdf.parse("20/10/2023"), "Orthopedics");

            p1.addAdmission(1, new Admission(sdf.parse("01/10/2020"), sdf.parse("10/10/2020"), a1));
            p1.addAdmission(2, new Admission(sdf.parse("01/10/2023"), sdf.parse("10/10/2023"), a1));

            p2.addAdmission(3, new Admission(sdf.parse("01/10/2023"), sdf.parse("10/10/2023"), a4));

            p3.addAdmission(4, new Admission(sdf.parse("01/10/2020"), sdf.parse("10/10/2020"), a3));
            p3.addAdmission(5, new Admission(sdf.parse("01/10/2023"), sdf.parse("10/10/2023"), a5));
            p3.addAdmission(6, new Admission(sdf.parse("01/10/2025"), sdf.parse("10/10/2025"), a3));

            employees.add(e1);
            employees.add(e2);
            employees.add(e3);
            employees.add(e4);
            employees.add(e5);
            employees.add(e6);
            employees.add(e7);
            employees.add(e8);
            employees.add(e9);
            employees.add(e10);

            patients.add(p1);
            patients.add(p2);
            patients.add(p3);
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }

        for (Employ e : employees) {
            System.out.println(e.toString());
        }
    }

    private void averageSalary(){
        //Mostrar el salario medio de enfermeria y medicos de cardiologia
        double additionSalary = 0;
        double higherSalary = 0;
        double nurseAverageSalary = 0;
        double cardiologyDoctorHigherSalary = 0;
        int nurseCount = 1;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getWorkPost().equalsIgnoreCase("Nurse")) {
                additionSalary += employees.get(i).getSalary();
                nurseCount++;
            }
            nurseAverageSalary = additionSalary / nurseCount;

            if (employees.get(i).getWorkPost().equalsIgnoreCase("Doctor") && (employees.get(i)).getWorkArea().getAreaName().equalsIgnoreCase("Cardiology") && (employees.get(i)).getSalary() > higherSalary) {
                higherSalary += employees.get(i).getSalary();
            }
            cardiologyDoctorHigherSalary = higherSalary;
        }
        System.out.println("Nurse Average Salary: " + nurseAverageSalary);
        System.out.println("Cardiology Doctor Higher Salary: " + cardiologyDoctorHigherSalary);
    }

    private void totalDays(){
        //Dias totales ingresados de cada paciente
        int days;

        for (int i = 0; i < patients.size(); i++) {
            HashMap<Integer, Admission> admissions = (patients.get(i)).getAdmissionHistory();
            Iterator it = admissions.keySet().iterator();
            Admission adm;

            while(it.hasNext()){
                Integer codigo = (Integer) it.next();
                adm = admissions.get(codigo);

                //Resta de fechas
                long tiempoTranscurrido = adm.getDischargeDate().getTime() - adm.getAdmissionDate().getTime();

                //Señalar en que rango de valores trabajos(años, dias, meses, ...)
                TimeUnit timeValue = TimeUnit.DAYS;
                long days = timeValue.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
            }
        }
        System.out.println("Patient: " + patients.get(i).getName() + ", Total Admissioned Days: " + days);
    }

    private void higherCostWorkArea(){

    }
}