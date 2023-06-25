import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Area> areas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Main eleccion = new Main();

        do{
            System.out.println("Escoja una opcion:");
            System.out.println("[1] Creacion de listas");
            System.out.println("[2] Calcular media salarial");
            System.out.println("[3] Calcular tiempo total ingresado");
            System.out.println("[4] Calcular area mas costosa");
            System.out.println("[5] Salir");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    eleccion.crearListas();
                    break;
                case 2:
                    eleccion.salarioMedio();
                    break;
                case 3:
                    eleccion.tiempoTotalIngresado();
                    break;
                case 4:
                    eleccion.mayorGastoAnual();
                    break;
                default:
                    System.out.println("Introduzca una de las opciones marcadas.");
            }
        }
        while (opcion != 5);
    }

    private void crearListas(){
        String dni, nombre, direccion, cargoHospital, patologia, persona;
        int idArea, edad, year, month, day;
        double salario;
        LocalDate fechaIncorporacion, fechaIngresoActual;

        Scanner sc = new Scanner(System.in);

        Area a1 = new Area(1, "Cardiologia");
        Area a2 = new Area(2, "Pediatria");
        Area a3 = new Area(3, "Traumatologia");
        Area a4 = new Area(4, "Oncologia");
        Area a5 = new Area(5, "Urgencias");

        areas.add(a1);
        areas.add(a2);
        areas.add(a3);
        areas.add(a4);
        areas.add(a5);

        for (int i = 0; i < 3; i++){
            boolean datosValidos = true;
            System.out.println("Eres trabajador o paciente?");
            persona = sc.nextLine();

            if(persona.equals("Trabajador")){
                do{
                    try{
                        System.out.println("Introduzca su dni, nombre, edad y direccion");
                        dni = sc.nextLine();
                        if (dni.length() != 9)
                            throw new DNIExcepcion("ERROR: LA LONGITUD DEL DNI DEBE SER 9");
                        nombre = sc.nextLine();

                        edad = sc.nextInt();
                        comprobarEdad(edad);

                        sc = new Scanner(System.in);
                        direccion = sc.nextLine();
                        personas.add(new Trabajador(dni,nombre, edad, direccion));
                        System.out.println("Introduzca su cargo y sueldo: ");
                        patologia = sc.nextLine();
                        salario = sc.nextDouble();

                        System.out.println("Intruzca la identificacion de su area");
                        sc = new Scanner(System.in);
                        idArea = sc.nextInt();

                        System.out.println("Introduzca el año, mes, y dia de su fecha de ingreso: ");
                        year = sc.nextInt();
                        month = sc.nextInt();
                        day = sc.nextInt();
                        fechaIncorporacion = LocalDate.of(year, month, day);
                    }
                    catch (ParseException | EdadExcepcion | DNIExcepcion e){
                        datosValidos = false;
                        System.out.println("ERROR EN LA INTRODUCCION DE DATOS");
                        System.out.println(e.getMessage());
                    }
                }
                while (!datosValidos);
            }
            else{
                do{
                    try{
                        System.out.println("Introduzca su dni, nombre, edad y direccion");

                        dni = sc.nextLine();
                        nombre = sc.nextLine();

                        edad = sc.nextInt();
                        comprobarEdad(edad);
                        sc = new Scanner(System.in);
                        direccion = sc.nextLine();

                        System.out.println("Introduzca su patologia");
                        patologia = sc.nextLine();

                        System.out.println("Introduzca el año, mes, y dia de su fecha de ingreso: ");
                        year = sc.nextInt();
                        month = sc.nextInt();
                        day = sc.nextInt();
                        fechaIngresoActual = LocalDate.of(year, month, day);

                    }
                    catch (InputMismatchException e){
                        datosValidos = false;
                        System.out.println("ERROR EN LA INTRODUCCION DE DATOS");
                    }
                }
                while (!datosValidos);
            }
        }
    }

    private void salarioMedio() {
        double sumaEnfermero = 0;
        int contador = 0;
        double salarioMaximo = 0;

        for (int i=0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Trabajador) {
                if (((Trabajador) personas.get(i)).getCargoHospital().equalsIgnoreCase("Enfermero")) {
                    sumaEnfermero += ((Trabajador) personas.get(i)).getSalario();
                    contador++;
                }
                if (((Trabajador) personas.get(i)).getCargoHospital().equalsIgnoreCase("Medico") && ((Trabajador) personas.get(i)).getAreaAsignada().getNombreArea().equalsIgnoreCase("Cardiologia") && (((Trabajador) personas.get(i)).getSalario() > salarioMaximo)) {
                    salarioMaximo = ((Trabajador) personas.get(i)).getSalario();
                }
            }
        }
        System.out.println("Salario medio de los enfermeros: " + sumaEnfermero / contador);
        System.out.println("Mayor salario entre los medicos de cardiologia: " + salarioMaximo);
    }

    private void tiempoTotalIngresado() {
        int diasIngresado = 0;

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Paciente) {
                HashMap<Integer, HistorialMedico> ingresos = (((Paciente) personas.get(i)).getHistorial());
                Iterator it = ingresos.keySet().iterator();
                HistorialMedico historial;

                while(it.hasNext()) {
                    Integer codigo = (Integer) it.next();
                    historial = ingresos.get(codigo);

                    long dias = ChronoUnit.DAYS.between(historial.getFechaAlta(), historial.getFechaIngreso());
                    diasIngresado += dias;
                }
            }
            System.out.println("Paciente: " + personas.get(i).getNombre() + ", Dias Ingresado: " + diasIngresado);
        }
    }

    private void mayorGastoAnual() {
        double gasto = 0;
        double gastoMaximo = 0;
        String area = "";

        for (int i = 0; i < areas.size(); i++) {
            for (int j = 0; j < personas.size(); j++) {
                if (personas.get(j) instanceof Trabajador) {
                    if (((Trabajador) personas.get(j)).getAreaAsignada().getIdArea() == areas.get(i).getIdArea()){
                        gasto += personas.get(j).costeAnual();
                    }
                }
                if (personas.get(j) instanceof Paciente) {
                    HashMap <Integer, HistorialMedico> ingresos = ((Paciente) personas.get(j)).getHistorial();
                    Iterator<Integer> it = ingresos.keySet().iterator();
                    HistorialMedico historial;

                    while(it.hasNext()) {
                        Integer codigo = (Integer) it.next();
                        historial = ingresos.get(codigo);

                        if(historial.getAreaIngresada().getIdArea() == areas.get(i).getIdArea()) {
                            gasto += personas.get(j).costeAnual();
                        }
                    }
                }
            }
            if (gasto > gastoMaximo) {
                gastoMaximo = gasto;
                area = areas.get(i).getNombreArea();
            }
        }
        System.out.println("Area mas costosa: " + area + ", Coste: " + gastoMaximo);
    }

    private static void comprobarEdad(int edad) throws EdadExcepcion{
        if (edad <= 0)
            throw new EdadExcepcion("ERROR: EDAD NEGATIVA INTRODUCIDA");
    }

    private static void comprobarFechasIngresos(ArrayList<Persona> miembros) throws FechaIngresoExcepcion{
        for (int i = 0;  i < miembros.size(); i++) {
            Persona p = miembros.get(i);
            if (p instanceof Paciente) {
                HashMap<Integer, HistorialMedico> ingresos = ((Paciente) miembros.get(i)).getHistorial();
                Iterator it = ingresos.keySet().iterator();
                HistorialMedico ing;

                while (it.hasNext()) {
                    int clave = (Integer)it.next();
                    ing = ingresos.get(clave);
                    if (ing.getFechaAlta().isBefore(ing.getFechaIngreso()))
                        throw new FechaIngresoExcepcion("ERROR: LA FECHA DE ALTA NO PUEDE SER ANTERIOR A LA DE INGRESO. INGRESO: " + clave);
                }
            }
        }
    }

    private static Area comprobarEspecialidad(String nom, ArrayList<Area> esp) throws AreaExcepcion{
        boolean encontrada = false;
        for(Area a: esp) {
            if (a.getNombreArea().equalsIgnoreCase(nom)) {
                encontrada = true;
                return a;
            }
        }
        if (!encontrada)
            throw new AreaExcepcion("ERROR: EL AREA INTRODUCIDA NO EXISTE: " + nom);
        return null;
    }
}