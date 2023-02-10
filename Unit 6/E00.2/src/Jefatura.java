class Jefatura extends Empleado implements Jefes{

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

    public String tomarDecisiones(String decision) {

        return "Decision: " + decision;
    }

    public double estableceBonus(double gratificacion){

        double prima = 2000;

        return Trabajadores.bonusBase + gratificacion + prima;
    }
}
