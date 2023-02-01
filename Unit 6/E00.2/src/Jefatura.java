class Jefatura extends Empleado{

    private double incentivo;

    public Jefatura(String nombre, double sueldo, int año, int mes, int dia) {

        super(nombre, sueldo, año, mes, dia);
    }

    public void setIncentivo(double incentivo){

        this.incentivo = incentivo;
    }

    public double getSueldo(){

        double sueldoJefe = super.getSueldo();

        return sueldoJefe + incentivo;
    }
}
